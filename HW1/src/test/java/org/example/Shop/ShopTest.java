package org.example.Shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Shop shop;
    @BeforeEach
    void init(){
        List<Product> products = new ArrayList<>();
        products.add(new Product(250, "Мандарин"));
        products.add(new Product(35, "Хлеб"));
        products.add(new Product(60, "Молоко"));
        products.add(new Product(90, "Яйцо"));
        this.shop = new Shop(products);
    }

    @Test
    @DisplayName("Отсортированность магазина")
    void sortProductsByPrice() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(35, "Хлеб"));
        products.add(new Product(60, "Молоко"));
        products.add(new Product(90, "Яйцо"));
        products.add(new Product(250, "Мандарин"));
        assertThat(shop.sortProductsByPrice()).isSorted();
    }

    @Test
    @DisplayName("Самый дорогой продукт")
    void getMostExpensiveProduct() {
        assertEquals(shop.getMostExpensiveProduct().getCost(), 250);
    }
}