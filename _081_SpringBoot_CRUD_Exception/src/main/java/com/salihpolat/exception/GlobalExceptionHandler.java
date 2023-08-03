package com.salihpolat.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    public ResponseEntity<?> globalExceptionHandler(Exception exception, WebRequest request) {
        return null;
    }
}