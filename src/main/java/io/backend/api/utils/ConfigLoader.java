package io.backend.api.utils;

import io.backend.api.constants.ApiConstants;
import io.backend.api.exceptions.CurrencyException;

import java.util.Properties;

public class ConfigLoader {
    private final Properties PROPERTIES;
    private static ConfigLoader instance;

    private ConfigLoader() {
        PROPERTIES = PropertiesHelper.loadProperties(ApiConstants.API_PROPERTY_FILE);
    }

    public static ConfigLoader getInstance() {
        if (instance == null) {
            synchronized (ConfigLoader.class) {
                if (instance == null)
                    instance = new ConfigLoader();
            }
        }
        return instance;
    }

    public String getCurrencyHost() {
        String currencyHost = PROPERTIES.getProperty("CURRENCY_HOST");
        if (currencyHost != null)
            return currencyHost;
        else
            throw new CurrencyException("Currency Host failed to load from the properties file!");
    }
}