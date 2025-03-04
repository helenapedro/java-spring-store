package com.pedro.store.services;

import com.pedro.store.services.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stripe")
@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${tripe.supported-currencies}")
    private List<String> supportedCurrencies;

    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Currencies" + supportedCurrencies);
        System.out.println("Amount: " + amount);
    }
}
