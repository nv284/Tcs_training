package com.org.collection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;



class StoreManagement implements ItemManagement {
    private LinkedList<Item> items;
    private Connection connection;

    public StoreManagement() {
        items = new LinkedList<>();
        connectToDatabase();
    }

    private void connectToDatabase() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "pass");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void addItem(Item item) {
        items.add(item);
        try {
            String query = "INSERT INTO items (id, name, quantity, price) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, item.getId());
            preparedStatement.setString(2, item.getName());
            preparedStatement.setInt(3, item.getQuantity());
            preparedStatement.setDouble(4, item.getPrice());
            preparedStatement.executeUpdate();
            System.out.println("Item added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void removeItem(int itemId) {
        boolean removed = items.removeIf(item -> item.getId() == itemId);
        if (removed) {
            try {
                String query = "DELETE FROM items WHERE id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, itemId);
                preparedStatement.executeUpdate();
                System.out.println("Item removed successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Item not found.");
        }
    }

    @Override
    public void updateItem(Item item) {
        for (Item i : items) {
            if (i.getId() == item.getId()) {
                i.setName(item.getName());
                i.setQuantity(item.getQuantity());
                i.setPrice(item.getPrice());
                try {
                    String query = "UPDATE items SET name = ?, quantity = ?, price = ? WHERE id = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, item.getName());
                    preparedStatement.setInt(2, item.getQuantity());
                    preparedStatement.setDouble(3, item.getPrice());
                    preparedStatement.setInt(4, item.getId());
                    preparedStatement.executeUpdate();
                    System.out.println("Item updated successfully.");
                    return;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Item not found.");
    }

    @Override
    public void listItems() {
        if (items.isEmpty()) {
            System.out.println("No items in the store.");
        } else {
            try {
                String query = "SELECT * FROM items";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    System.out.println("Item{id=" + resultSet.getInt("id") +
                            ", name='" + resultSet.getString("name") + '\'' +
                            ", quantity=" + resultSet.getInt("quantity") +
                            ", price=" + resultSet.getDouble("price") + '}');
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}