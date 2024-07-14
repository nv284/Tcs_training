package com.org.exception;

// unchecked exception
//ProductNotFound Exception Class
class ProductNotFound extends Exception{
 static String notFound = "Product Key Invalid, Try some other Key.";
 public ProductNotFound(){
     super(notFound);
 }

}

public class Products {
 // list of products
 static String[] ProductsList = {"Phone", "Washing Machine", "Geyser", "Television", "Laptop"};
 static int validKey = ProductsList.length;
 // bring method 
 // if product key is valid it returns the product
 public static void bring(int productNo) throws ProductNotFound {
     if(productNo>=validKey || productNo<0)
         // throws exception if the key is invalid
         throw new ProductNotFound();
     else System.out.println(ProductsList[productNo-1]);
 }
//fetching products from products list
 public static void main(String[] args) throws ProductNotFound {
     System.out.println("Fetching Some Products...");
     bring(2);
     bring(6);
 }
}

