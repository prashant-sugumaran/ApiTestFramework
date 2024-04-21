package io.backend.api.constants;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TestGroups {
    public static final String ALL_SMOKE = "ALL_SMOKE";
    public static final String ALL_REGRESSION = "ALL_REGRESSION";
    public static final String CURRENCY_SMOKE = "CURRENCY_SMOKE";
    public static final String CURRENCY_REGRESSION = "CURRENCY_REGRESSION";
}