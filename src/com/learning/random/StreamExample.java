package com.learning.random;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"Nokia",25000f));
        productsList.add(new Product(2,"RedMi",30000f));
        productsList.add(new Product(3,"Samsung",28000f));
        productsList.add(new Product(4,"LG",28000f));
        productsList.add(new Product(5,"Apple",90000f));
        productsList.stream()
                .filter(p ->p.price> 30000)   // filtering price
                .map(pm ->pm.price)          // fetching price
                .forEach(System.out::println);  // iterating price
    }
}