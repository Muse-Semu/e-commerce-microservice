package com.ayg.ecommerce.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode()
@Data
public class BusinessException extends RuntimeException {
    private String message;
    public BusinessException(String s) {
    }
}
