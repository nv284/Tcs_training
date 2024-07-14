package com.org.oned;

public class Delivery {
	   Product product;
	    Address address;

	    Delivery(Product product, Address address) {
	        this.product = product;
	        this.address = address;
	    }

	    @Override
	    public String toString() {
	        return "Product: " + product.name + ", Quantity: " + product.quantity +
	                ", Address: " + address.street + ", " + address.city + ", " + address.postalCode;
	    }
}
