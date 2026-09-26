package com.example.bean_scopes.service;

import org.springframework.stereotype.Service;

@Service
public class CheckoutService {

    private final PaymentService paymentService;

    public CheckoutService(PaymentService paymentService){
        this.paymentService = paymentService;

        System.out.println("CheckoutService criado!");
    }

    public PaymentService getPaymentService(){
        return paymentService;
    }


}
