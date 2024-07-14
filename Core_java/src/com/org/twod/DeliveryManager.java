package com.org.twod;

public class DeliveryManager {

	void deliverProduct(Product product, String customerName, String address) {
        System.out.println("Delivering " + product.name + " to " + customerName + " at " + address);
    }
}