package com.mtna.shop;

import java.util.Objects;

public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;


    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }


    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, stock);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && stock == product.stock && Objects.equals(id, product.id) && Objects.equals(name, product.name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}

