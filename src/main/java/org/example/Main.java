package org.example;

import org.example.products.Beverage;
import org.example.products.Fruit;
import org.example.products.HairProduct;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.addProduct(new Beverage("Coca-Cola Zero", 20, "1.5"));
        cart.addProduct(new Beverage("Coca-Cola", 18, "1.5"));
        cart.addProduct(new HairProduct("Shampoo Sedal", 19, "500ml"));
        cart.addProduct(new Fruit("Frutillas", 64, "kilo"));

        System.out.println(cart);
    }
}