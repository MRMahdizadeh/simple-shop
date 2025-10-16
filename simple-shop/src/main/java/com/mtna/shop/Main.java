package com.mtna.shop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("p1", "Keyboard", 29.99, 10));
        products.add(new Product("p2", "Mouse", 19.99, 25));

        System.out.println("Products in store: ");
        products.forEach(System.out::println);
    }
}
