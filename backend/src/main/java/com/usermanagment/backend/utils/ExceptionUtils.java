package com.usermanagment.backend.utils;

import com.usermanagment.backend.exception.UserException;
import org.springframework.http.ResponseEntity;

import java.util.function.Supplier;

public class ExceptionUtils {

    public static <T> ResponseEntity<T> handleResponse(Supplier<ResponseEntity<T>> supplier) {
        try {
            return supplier.get();
        }
        catch (UserException exception) {
            System.out.println(exception.getMessage() + " " + exception.getHttpStatus());
            return ResponseEntity.status(exception.getHttpStatus()).build();
        }
    }
}