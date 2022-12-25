package com.skypro.marketplace.service;

import com.skypro.marketplace.model.Cart;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private final Cart cart;

    public Service(Cart cart) {
        this.cart = cart;
    }

    public void addToCart(List<Integer> idsToAdd) {
        cart.addToCart(idsToAdd);
    }

    public List<Integer> getItems() {
        return cart.getCartItems();
    }
}
