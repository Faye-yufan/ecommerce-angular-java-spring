package com.fayeyufan.ecommerce.service;

import com.fayeyufan.ecommerce.dto.PaymentInfo;
import com.fayeyufan.ecommerce.dto.Purchase;
import com.fayeyufan.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
