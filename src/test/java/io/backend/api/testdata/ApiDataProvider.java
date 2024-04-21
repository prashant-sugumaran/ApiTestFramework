package io.backend.api.testdata;

import org.testng.annotations.DataProvider;

public class ApiDataProvider {

    @DataProvider(name = "currency-code", parallel = true)
    private Object[][] currencyCodes() {
        return new Object[][]{
                {"usd"}
        };
    }

    @DataProvider(name = "invalid-currency-code", parallel = true)
    private Object[][] invalidCurrencyCodes() {
        return new Object[][]{
                {"abcd"},
                {"us"},
                {"a"}
        };
    }
}