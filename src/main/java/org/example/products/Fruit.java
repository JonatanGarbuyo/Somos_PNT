package org.example.products;

public class Fruit extends Product {

    private String salesUnit;

    public Fruit(String name, int price, String salesUnit) {
        super(name, price);
        this.salesUnit = salesUnit;
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + " /// Precio: $" + getPrice() + " /// Unidad de venta: " + salesUnit;
    }
}
