package org.example;

import org.example.products.Product;

import java.util.ArrayList;

public class Cart {

    private final ArrayList<Product> productList;

    public Cart() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public String getMostExpensiveProduct() {
        Product mostExpensive = productList.stream()
                .max(Product::compareTo)
                .orElse(null);

        return mostExpensive != null ? mostExpensive.getName() : "No products in the cart";
    }

    public String getLeastExpensiveProduct() {
        Product leastExpensive = productList.stream()
                .min(Product::compareTo)
                .orElse(null);

        return leastExpensive != null ? leastExpensive.getName() : "No products in the cart";

    }

    public void showProducts() {
        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println("=============================");
        System.out.println("Producto más caro: " + this.getMostExpensiveProduct());
        System.out.println("Producto más barato: " + this.getLeastExpensiveProduct());
    }
}
