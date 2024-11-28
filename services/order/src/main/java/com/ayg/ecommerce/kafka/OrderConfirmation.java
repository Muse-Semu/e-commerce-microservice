package com.ayg.ecommerce.kafka;



import com.ayg.ecommerce.customer.CustomerResponse;
import com.ayg.ecommerce.order.PaymentMethod;
import com.ayg.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
