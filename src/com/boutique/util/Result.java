package com.boutique.util;

/**
 * A generic wrapper for operation results throughout the system.
 * Carries either a success value or an error message — never both.
 */
public class Result<T> {
    private final boolean success;
    private final T value;
    private final String errorMessage;

    private Result(boolean success, T value, String errorMessage) {
        this.success = success;
        this.value = value;
        this.errorMessage = errorMessage;
    }

    public static <T> Result<T> success(T value) {
        return new Result<>(true, value, null);
    }

    public static <T> Result<T> failure(String errorMessage) {
        return new Result<>(false, null, errorMessage);
    }

    public boolean isSuccess() { return success; }
    public T getValue() { return value; }
    public String getErrorMessage() { return errorMessage; }

    @Override
    public String toString() {
        return success ? "Result{success, value=" + value + "}" : "Result{failure, error='" + errorMessage + "'}";
    }
}