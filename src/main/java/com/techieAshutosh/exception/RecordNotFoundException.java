package com.techieAshutosh.exception;

import org.springframework.http.HttpStatus;

public class RecordNotFoundException extends RuntimeException{
    public RecordNotFoundException(HttpStatus httpStatus, String s) {
        super(s);
    }
}
