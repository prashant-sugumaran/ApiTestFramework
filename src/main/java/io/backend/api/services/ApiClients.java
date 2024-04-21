package io.backend.api.services;

import io.backend.api.commons.RestResource;
import io.backend.api.constants.ApiRoutes;
import io.backend.api.exceptions.CurrencyException;
import io.restassured.response.Response;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ApiClients {

    public Response getCurrencyCodeResponse(String currency) {
        String currencyCodeEndPoint = ApiRoutes.CURRENCY_INFO + currency;
        Response currencyCodeResponse = RestResource.getInstance().getApiResponse(currencyCodeEndPoint);
        if (currencyCodeResponse != null)
            return currencyCodeResponse;
        else
            throw new CurrencyException("Client Exception: Currency Code API");
    }

    public Response getCurrencyFailureResponse(String currency) {
        String currencyCodeEndPoint = ApiRoutes.CURRENCY_INFO + currency;
        Response currencyCodeFailResponse = RestResource.getInstance().getApiResponse(currencyCodeEndPoint);
        if (currencyCodeFailResponse != null)
            return currencyCodeFailResponse;
        else
            throw new CurrencyException("Client Exception: Currency Failure Code API");
    }
}