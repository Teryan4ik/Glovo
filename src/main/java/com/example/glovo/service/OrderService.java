package com.example.glovo.service;

import com.example.glovo.model.Order;
import com.example.glovo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class OrderService {
    private final List<Order> orders = new ArrayList<>();

    public OrderService() {
        Product apple = Product.builder().id(1).cost(15).name("Apple").build();
        List <Product> products = List.of(apple);
        orders.add(Order.builder().cost(15).date("03-11-2022").id(1).products(products).build());
    }

    private Order get(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    private List<Order> getAll() {
        return orders;
    }

    public void add(Order order) {
        orders.add(order);
    }
}
