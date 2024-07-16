package com.org.collection.model;

import java.util.Scanner;

public class DepartmentalStore {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        StoreManagement storeManagement = new StoreManagement();

	        while (true) {
	            System.out.println("\nDepartmental Store Management System");
	            System.out.println("1. Add Item");
	            System.out.println("2. Remove Item");
	            System.out.println("3. Update Item");
	            System.out.println("4. List All Items");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            int option = scanner.nextInt();

	            switch (option) {
	                case 1:
	                    System.out.print("Enter item ID: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine(); // consume newline
	                    System.out.print("Enter item name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter item quantity: ");
	                    int quantity = scanner.nextInt();
	                    System.out.print("Enter item price: ");
	                    double price = scanner.nextDouble();
	                    Item newItem = new Item(id, name, quantity, price);
	                    storeManagement.addItem(newItem);
	                    break;

	                case 2:
	                    System.out.print("Enter item ID to remove: ");
	                    int removeId = scanner.nextInt();
	                    storeManagement.removeItem(removeId);
	                    break;

	                case 3:
	                    System.out.print("Enter item ID to update: ");
	                    int updateId = scanner.nextInt();
	                    scanner.nextLine(); // consume newline
	                    System.out.print("Enter new item name: ");
	                    String newName = scanner.nextLine();
	                    System.out.print("Enter new item quantity: ");
	                    int newQuantity = scanner.nextInt();
	                    System.out.print("Enter new item price: ");
	                    double newPrice = scanner.nextDouble();
	                    Item updatedItem = new Item(updateId, newName, newQuantity, newPrice);
	                    storeManagement.updateItem(updatedItem);
	                    break;

	                case 4:
	                    storeManagement.listItems();
	                    break;

	                case 5:
	                    System.out.println("Exiting the system.");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	    }
}
