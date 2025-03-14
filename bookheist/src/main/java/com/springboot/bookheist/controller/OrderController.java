package com.springboot.bookheist.controller;


import com.springboot.bookheist.model.Order;
import com.springboot.bookheist.model.Purchase;
import com.springboot.bookheist.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/order")
    public ResponseEntity<Order> orderBook(@RequestParam Long bookId, @RequestParam Long userId, @RequestParam int quantity) {
        Order order = orderService.orderBook(bookId, userId, quantity);
        return ResponseEntity.status(201).body(order);
    }


    @PostMapping("/purchase/{orderId}")
    public ResponseEntity<Purchase> buyBook(@PathVariable Long orderId) {
        Purchase purchase = orderService.buyBook(orderId);
        return ResponseEntity.status(201).body(purchase);
    }
}