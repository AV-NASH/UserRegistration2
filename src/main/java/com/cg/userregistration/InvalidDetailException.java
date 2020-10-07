package com.cg.userregistration;

public class InvalidDetailException extends  RuntimeException{

    public InvalidDetailException(String message) {
        super(message);
    }
}
