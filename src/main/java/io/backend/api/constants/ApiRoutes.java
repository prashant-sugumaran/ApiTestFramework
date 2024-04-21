package io.backend.api.constants;

import io.backend.api.utils.ConfigLoader;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiRoutes {
    public static final String CURRENCY_INFO = ConfigLoader.getInstance().getCurrencyHost() + "/v6/latest/";
}