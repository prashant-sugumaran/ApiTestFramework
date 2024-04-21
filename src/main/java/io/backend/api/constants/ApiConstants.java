package io.backend.api.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiConstants {

    public static final String API_PROPERTY_FILE = System.getProperty("user.dir") + "/src/main/resources/api.properties";
    public static final String CONTENT_TYPE = "application/json";
}
