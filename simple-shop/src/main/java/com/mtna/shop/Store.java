package com.mtna.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Store {
    private List<Product> products;

    public Store() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Optional<Product> getProductById(String id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public boolean removeProduct(String id) {
        return products.removeIf(p -> p.getId().equals(id));
    }

    public void listProducts() {
        System.out.println("Products in store: ");
        products.forEach(System.out::println);
    }

    public boolean updateProduct(String id, int newStock) {
        Optional<Product> product1 = getProductById(id);
        product1.ifPresent(product -> product.setStock(newStock));
        return product1.isPresent();
    }
}
