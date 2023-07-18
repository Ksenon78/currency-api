package com.example.currency;

import org.springframework.http.HttpStatus;

public interface ResponseEntity<T> {
    HttpStatus getStatusCode();

    T getBody();
}
