package com.skypro.marketplace.controller;

import com.skypro.marketplace.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void addItems(@RequestParam("id") List<Integer> idsToAdd) {
        this.service.addToCart(idsToAdd);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return this.service.getItems();
    }
}
