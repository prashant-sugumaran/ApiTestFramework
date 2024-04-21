package io.backend.api.services;

import io.backend.api.commons.HttpStatuses;
import io.backend.api.commons.RestResource;
import io.backend.api.entities.response.CurrencyFailureResponse;
import io.backend.api.entities.response.CurrencyResponse;
import io.backend.api.utils.JsonUtils;
import io.backend.api.utils.RetryUtils;
import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.jodah.failsafe.Failsafe;

@Slf4j
public class ApiControllers {

    ApiClients apiClients;

    public ApiControllers() {
        this.apiClients = new ApiClients();
    }

    @Getter
    @Setter
    public int currencyPairs;

    public CurrencyResponse getCurrencyDetailsResponse(String currency) {
        return Failsafe.with(new RetryUtils().getRetryPolicyForCurrencyTestException(2, 3)).get(() -> {
            Response currencyCodeResponse = apiClients.getCurrencyCodeResponse(currency);
            if (currencyCodeResponse.getStatusCode() != HttpStatuses.OK.getCode())
                log.error("Retrying for the Currency Code. Please stay with us...");
            currencyPairs = JsonUtils.getObjectLength(currencyCodeResponse, "rates");
            return RestResource.getInstance().deserialize(currencyCodeResponse, CurrencyResponse.class);
        });
    }

    public CurrencyFailureResponse getInvalidCurrencyDetailsResponse(String currency) {
        return Failsafe.with(new RetryUtils().getRetryPolicyForCurrencyTestException(2, 3)).get(() -> {
            Response currencyCodeResponse = apiClients.getCurrencyFailureResponse(currency);
            System.out.println("Response: " + currencyCodeResponse.asString());
            if (currencyCodeResponse.getStatusCode() != HttpStatuses.OK.getCode())
                log.error("Retrying for the Invalid Currency Code. Please stay with us...");
            return RestResource.getInstance().deserialize(currencyCodeResponse, CurrencyFailureResponse.class);
        });
    }
}
