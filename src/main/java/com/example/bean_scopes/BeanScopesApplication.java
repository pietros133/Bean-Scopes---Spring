package com.example.bean_scopes;

import com.example.bean_scopes.service.CheckoutService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeanScopesApplication {

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(BeanScopesApplication.class, args);

		CheckoutService checkout1 =
				context.getBean(CheckoutService.class);

		CheckoutService checkout2 =
				context.getBean(CheckoutService.class);

		System.out.println(checkout1);
		System.out.println(checkout2);

		System.out.println(checkout1 == checkout2);

		System.out.println(
				checkout1.getPaymentService()
						== checkout2.getPaymentService()
		);
	}
}