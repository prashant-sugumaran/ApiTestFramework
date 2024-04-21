package io.backend.api.exceptions;

public class TestUtilsException extends RuntimeException {

    public TestUtilsException(String errorMessage) {
        super(errorMessage);
    }
}