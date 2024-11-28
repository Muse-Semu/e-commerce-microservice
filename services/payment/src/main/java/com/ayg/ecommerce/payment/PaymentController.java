package com.ayg.ecommerce.payment;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {

    private PaymentService paymentService;

    @PostMapping
    private ResponseEntity<Integer> createPayment(
            @RequestBody
            @Valid PaymentRequest paymentRequest
    ){

        return  ResponseEntity.ok(paymentService.createPayment(paymentRequest));
    }
}
