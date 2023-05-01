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
        Product apple = Product.builder().id(1).cost(5).name("Apple").build();
        Product orange = Product.builder().id(2).cost(10).name("Orange").build();

        List<Product> products = new ArrayList<>();
        List<Product> products2 = new ArrayList<>();
        products.add(apple);
        products2.add(orange);

        orders.add(Order.builder().cost(15).date("01-01-2001").id(1).products(products).build());
        orders.add(Order.builder().cost(30).date("02-02-2002").id(2).products(products2).build());
    }

    public Order get(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public List<Order> getAll() {
        return orders;
    }

    public void add(Order order) {
        orders.add(order);
    }
}
