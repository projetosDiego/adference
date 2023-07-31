package com.adference.troubleshooting.exception;

public class HistoryNotFoundException extends RuntimeException{
    public HistoryNotFoundException(String message) {
        super(message);
    }
}
