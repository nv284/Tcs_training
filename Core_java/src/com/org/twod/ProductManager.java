package com.org.twod;

public class ProductManager {
	Product[] products;
    int productCount;

    ProductManager(int size) {
        products = new Product[size];
        productCount = 0;
    }

    void addProduct(String name, double price) {
        if (productCount < products.length) {
            products[productCount++] = new Product(name, price);
        } else {
            System.out.println("Product list is full.");
        }
    }

    void displayProducts() {
        for (int i = 0; i < productCount; i++) {
            System.out.println((i + 1) + ". " + products[i].name + " - $" + products[i].price);
        }
    }

    Product getProduct(int index) {
        if (index >= 0 && index < productCount) {
            return products[index];
        } else {
            return null;
        }
    }
}
