package com.ayg.ecommerce.payment;


import com.ayg.ecommerce.customer.CustomerResponse;
import com.ayg.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
