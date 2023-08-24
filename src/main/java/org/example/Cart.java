package org.example;

import org.example.products.Product;

import java.util.ArrayList;
import java.util.Comparator;

public class Cart {

    private ArrayList<Product> productList;

    public Cart() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public String getMostExpensiveProduct() {
        return productList.stream()
                .max(Comparator.comparingInt(Product::getPrice))
                .orElse(null).getName();
    };

    public String getLeastExpensiveProduct() {
        return productList.stream()
                .min(Comparator.comparingInt(Product::getPrice))
                .orElse(null).getName();
    };

    public void showProducts() {
        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println("=============================");
        System.out.println("Producto más caro: " + this.getMostExpensiveProduct());
        System.out.println("Producto más barato: " + this.getLeastExpensiveProduct());
    }
}
