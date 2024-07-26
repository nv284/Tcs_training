package com.org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



class JDBCExample {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "pass";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection connection = getConnection()) {
            if (connection != null) {
                System.out.println("Connected to the database!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

public class ResultSetMetaDataExample {
	public static void main(String[] args) {
        String selectSQL = "SELECT * FROM new_products";

        try (Connection connection = JDBCExample.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSQL)) {

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            System.out.println("Number of Columns: " + columnCount);
            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                String columnTypeName = metaData.getColumnTypeName(i);
                int columnDisplaySize = metaData.getColumnDisplaySize(i);
                boolean isNullable = metaData.isNullable(i) == ResultSetMetaData.columnNullable;
                boolean isAutoIncrement = metaData.isAutoIncrement(i);

                System.out.println("Column Name: " + columnName);
                System.out.println("Column Type: " + columnTypeName);
                System.out.println("Column Size: " + columnDisplaySize);
                System.out.println("Is Nullable: " + isNullable);
                System.out.println("Is Auto Increment: " + isAutoIncrement);
                System.out.println("---------------------------");
            }
         // Retrieve data from ResultSet
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                double price = resultSet.getDouble("price");

                System.out.println("ID: " + id + ", Name: " + name + ", Description: " + description + ", Price: " + price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
