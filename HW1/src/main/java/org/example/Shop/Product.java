package org.example.Shop;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private int cost;
    private String title;

    public Product(int cost, String title) {
        this.cost = cost;
        this.title = title;
    }

    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.cost, other.cost);
    }

    public Product(Integer cost, String title) {
        this.cost = cost;
        this.title = title;
    }

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Product{" +
                "cost=" + cost +
                ", title='" + title + '\'' +
                '}';
    }
}