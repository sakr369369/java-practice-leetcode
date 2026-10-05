package com.java.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class LimitinList {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Mouse", 40, true));
        products.add(new Product("Pen", 30, false));
        products.add(new Product("keyboard", 20, true));
        products.add(new Product("Monitor", 50, true));
        products.add(new Product("MAngo", 70, true));

        List<String> productNameList = filterName(products, 3);

        System.out.println(productNameList); // [Mouse, keyboard, Monitor]
    }

    public static List<String> filterName(List<Product> products, int limit) {

        return products.stream().filter(p -> p.isAvailable() == true).map(p ->p.getName()).limit(limit).collect(Collectors.toList());
    }
}


class Product {
    private String name;
    private int price;
    private boolean isAvailable;

    public Product(String name, int price, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
}

