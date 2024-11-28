package com.ayg.ecommerce.exception;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class BusinessException extends RuntimeException {
   private String msg;

   public BusinessException(String msg) {
      this.msg = msg;
   }
}
