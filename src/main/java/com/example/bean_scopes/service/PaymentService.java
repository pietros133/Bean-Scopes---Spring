package com.example.bean_scopes.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentService(){
        System.out.println("PaymentService foi criado!");
    }
}
