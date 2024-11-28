package com.ayg.ecommerce.payment;

import java.math.BigDecimal;

public record PaymentRequest(
        Integer id,
        Integer orderId,
        BigDecimal amount,
        String currency,
        PaymentMethod paymentMethod,
        String orderReference,
        Customer customer
) {
}
