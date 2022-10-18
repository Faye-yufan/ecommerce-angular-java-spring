package com.fayeyufan.ecommerce.dto;

import com.fayeyufan.ecommerce.entity.Address;
import com.fayeyufan.ecommerce.entity.Customer;
import com.fayeyufan.ecommerce.entity.Order;
import com.fayeyufan.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
