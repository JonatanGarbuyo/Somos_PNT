package org.example.products;

public abstract class Product implements Comparable<Product> {
    private final String name;
    private final int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.getPrice(), other.getPrice());
    }
}
