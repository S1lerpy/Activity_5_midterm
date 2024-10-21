package com.perlas.perlas;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private String url = "jdbc:mysql://localhost:3306/ACTIVITY_FIVE_PERLAS";

    private String user = "jg";

    private String password = "123";

    public Connection connection;

    public DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database connection successful!");
        } catch (Exception e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }


}
