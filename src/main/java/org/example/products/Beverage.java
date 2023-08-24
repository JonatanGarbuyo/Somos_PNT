package org.example.products;

public class Beverage extends Product {

    private String productSize;

    public Beverage(String name, int price, String productSize) {
        super(name, price);
        this.productSize = productSize;
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + " /// Litros: " + productSize + " /// Precio: $" + getPrice();
    }
}
