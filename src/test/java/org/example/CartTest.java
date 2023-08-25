package org.example;

import org.example.products.Beverage;
import org.example.products.Fruit;
import org.example.products.HairProduct;
import org.example.products.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    Cart cart;

    @BeforeEach
    void setUp() {
        cart = new Cart();
    }

    @Test
    void addProduct() {
        Product product = new Beverage("my product", 10, "1.5");
        cart.addProduct(product);

        assertFalse(cart.getProductList().isEmpty());
        assertEquals(1, cart.getProductList().size());
        assertEquals(product, cart.getProductList().get(0));
    }

    @Test
    void getMostExpensiveProduct() {
        cart.addProduct(new Beverage("Coca-Cola", 20, "1.5"));
        cart.addProduct(new Beverage("Pepsi", 18, "1.5"));
        cart.addProduct(new HairProduct("Shampoo", 19, "500ml"));
        cart.addProduct(new Fruit("Apples", 64, "kilo"));

        assertEquals("Apples", cart.getMostExpensiveProduct());
    }
    @Test
     void testGetMostExpensiveProductEmptyCart() {
        assertEquals("No products in the cart", cart.getMostExpensiveProduct());
    }

    @Test
    void getLeastExpensiveProduct() {
        cart.addProduct(new Beverage("Coca-Cola", 20, "1.5"));
        cart.addProduct(new Beverage("Pepsi", 18, "1.5"));
        cart.addProduct(new HairProduct("Shampoo", 19, "500ml"));
        cart.addProduct(new Fruit("Apples", 64, "kilo"));

        assertEquals("Pepsi", cart.getLeastExpensiveProduct());
    }
    @Test
    void getLeastExpensiveProductEmptyCart() {
        assertEquals("No products in the cart", cart.getLeastExpensiveProduct());
    }

    @Test
    void showProducts() {
        String expected = String.join("\n",
                "Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20",
                "Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18",
                "Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19",
                "Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo",
                "=============================",
                "Producto más caro: Frutillas",
                "Producto más barato: Coca-Cola"
        );
        cart.addProduct(new Beverage("Coca-Cola Zero", 20, "1.5"));
        cart.addProduct(new Beverage("Coca-Cola", 18, "1.5"));
        cart.addProduct(new HairProduct("Shampoo Sedal", 19, "500ml"));
        cart.addProduct(new Fruit("Frutillas", 64, "kilo"));

        assertEquals(expected, cart.toString());
    }
}