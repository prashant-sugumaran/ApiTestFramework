package io.backend.api.currency.tests;

import io.backend.api.base.BaseTest;
import io.backend.api.constants.TestGroups;
import io.backend.api.entities.response.CurrencyFailureResponse;
import io.backend.api.entities.response.CurrencyResponse;
import io.backend.api.services.ApiHelpers;
import io.backend.api.testdata.ApiDataProvider;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Slf4j
public class CurrencyCodeTest extends BaseTest {

    @Test(description = "To verify, the base code of currency details and the USD price against the AED.",
            dataProvider = "currency-code", dataProviderClass = ApiDataProvider.class,
            groups = {TestGroups.CURRENCY_SMOKE, TestGroups.CURRENCY_REGRESSION, TestGroups.ALL_SMOKE, TestGroups.ALL_REGRESSION})
    public void testCurrencyCodeDetails(String currency) {
        SoftAssert softAssert = new SoftAssert();
        CurrencyResponse currencyResponse = ApiHelpers.getApiControllers().getCurrencyDetailsResponse(currency);
        String expectedBaseCurrencyCode = currency.toUpperCase();
        int currencyPairs = CurrencyResponse.Rates.class.getDeclaredFields().length;
        softAssert.assertEquals(currencyResponse.getResult(), "success", "Currency Result is not success!");
        softAssert.assertEquals(currencyResponse.getBaseCode(), expectedBaseCurrencyCode, "Currency Base Code Mismatched!");
        softAssert.assertEquals(currencyPairs, ApiHelpers.getApiControllers().getCurrencyPairs(), "Currency Pairs Mismatched!");
        double aedCurrencyValue = currencyResponse.getRates().getAED();
        boolean isUsdToAedInRange = aedCurrencyValue >= 3.6 && aedCurrencyValue <= 3.7;
        softAssert.assertTrue(isUsdToAedInRange);
        softAssert.assertAll();
        log.info("Verified the Currency Base Code {}, its result Status {}, the currency pairs count {} and the AED price is within the range {}",
                currencyResponse.getBaseCode(), currencyResponse.getResult(), currencyPairs, isUsdToAedInRange);
    }

    @Test(description = "To verify, the base invalid currency codes gives failure response.", dataProvider = "invalid-currency-code",
            dataProviderClass = ApiDataProvider.class, groups = {TestGroups.CURRENCY_REGRESSION, TestGroups.ALL_REGRESSION})
    public void testInvalidCurrencyCodeDetails(String currency) {
        SoftAssert softAssert = new SoftAssert();
        CurrencyFailureResponse currencyFailureResponse = ApiHelpers.getApiControllers().getInvalidCurrencyDetailsResponse(currency);
        softAssert.assertEquals(currencyFailureResponse.getResult(), "error", "Invalid Currency Code Result Mismatched!");
        softAssert.assertEquals(currencyFailureResponse.getErrorType(), "unsupported-code",
                "Invalid Currency Code Error Type Mismatched!");
        log.info("Verified the Result {} and Error Type {} for the invalid currency code {}",
                currencyFailureResponse.getResult(), currencyFailureResponse.getErrorType(), currency);
        softAssert.assertAll();
    }
}