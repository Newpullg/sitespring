package com.labwork.sitespring.exception;

public class ServiceException extends RuntimeException {
    private int code;
    private String message;
    private String details;

    public ServiceException(int code, String message, String details) {
        this.code = code;
        this.message = message;
        this.details = details;
    }

    public ServiceException(String message, Throwable cause, int code, String details) {
        super(message, cause);
        this.code = code;
        this.message = message;
        this.details = details;
    }

    //Getter & Setter

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
