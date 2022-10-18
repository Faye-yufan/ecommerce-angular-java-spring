package com.fayeyufan.ecommerce.service;

import com.fayeyufan.ecommerce.dto.Purchase;
import com.fayeyufan.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
