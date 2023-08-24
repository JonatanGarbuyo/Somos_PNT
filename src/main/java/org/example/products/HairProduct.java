package org.example.products;

public class HairProduct extends Product {

    private String productSize;

    public HairProduct(String name, int price, String productSize) {
        super(name, price);
        this.productSize = productSize;
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + " /// Contenido: " + productSize + " /// Precio: $" + getPrice();
    }
}
