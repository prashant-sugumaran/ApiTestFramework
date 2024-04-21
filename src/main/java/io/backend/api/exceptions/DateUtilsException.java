package io.backend.api.exceptions;

public class DateUtilsException extends RuntimeException {
    public DateUtilsException(String errorMessage) {
        super(errorMessage);
    }
}