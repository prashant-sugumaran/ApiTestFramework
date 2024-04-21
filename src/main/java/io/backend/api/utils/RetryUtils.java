package io.backend.api.utils;


import io.backend.api.exceptions.CurrencyException;
import net.jodah.failsafe.RetryPolicy;
import org.apache.http.NoHttpResponseException;

import java.net.ConnectException;
import java.net.SocketException;
import java.time.Duration;

public class RetryUtils {

    public RetryPolicy<Object> getDefaultRetryPolicy(int delayInSeconds, int maxRetries) {
        return new RetryPolicy<>()
                .handle(ConnectException.class)
                .handle(SocketException.class)
                .handle(NoHttpResponseException.class)
                .withDelay(Duration.ofSeconds(delayInSeconds))
                .withMaxRetries(maxRetries);
    }


    public RetryPolicy<Object> getRetryPolicyForCurrencyTestException(int delayInSeconds, int maxRetries) {
        return getDefaultRetryPolicy(delayInSeconds, maxRetries).handle(CurrencyException.class);
    }
}