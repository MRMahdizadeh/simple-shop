package com.mtna.shop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*        List<Product> products = new ArrayList<>();
        products.add(new Product("p1", "Keyboard", 29.99, 10));
        products.add(new Product("p2", "Mouse", 19.99, 25));

        System.out.println("Products in store: ");
        products.forEach(System.out::println);*/

        Store store = new Store();
        store.addProduct(new Product("p1", "Keyboard", 29.99, 10));
        store.addProduct(new Product("p2", "Mouse", 19.99, 25));
        store.addProduct(new Product("p3", "Monitor", 49.99, 35));

        store.listProducts();

        store.updateProduct("p1", 15);
        System.out.println("\nAfter updating stock: ");
        store.listProducts();

        store.removeProduct("p2");
        System.out.println("\nAfter removing a product: ");
        store.listProducts();
    }
}
