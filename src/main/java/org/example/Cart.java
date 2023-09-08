package org.example;

import org.example.products.Product;

import java.util.*;

public class Cart {

    private final ArrayList<Product> productList;

    public Cart() {
        productList = new ArrayList<>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
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
        return productList.isEmpty() ? "No products in the cart" : Collections.min(productList).getName();

//        return productList.stream()
//                .min(Comparator.comparingInt(Product::getPrice))
//                .map(Product::getName)
//                .orElse("No products in the cart");
    }

    @Override
    public String toString(){
        StringBuilder message = new StringBuilder();
        for (Product product : productList) message.append(product).append("\n");
        message.append("=============================\n");
        message.append("Producto más caro: ").append(this.getMostExpensiveProduct()).append("\n");
        message.append("Producto más barato: ").append(this.getLeastExpensiveProduct());
        return message.toString();
    }

}
