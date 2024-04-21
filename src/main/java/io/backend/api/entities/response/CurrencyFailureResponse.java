package io.backend.api.entities.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyFailureResponse {

    private String result;
    @JsonProperty("error-type")
    private String errorType;
}