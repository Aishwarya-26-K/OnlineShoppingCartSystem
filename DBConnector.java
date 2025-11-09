package com.myshop.OnlineShoppingCart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DBConnector: reads connection info from environment variables first,
 * then falls back to sensible defaults. Avoid hard-coding credentials in source.
 *
 * Environment variables supported:
 *   DB_URL   (e.g. jdbc:mysql://localhost:3306/onlineshop?useSSL=false&serverTimezone=UTC)
 *   DB_USER
 *   DB_PASS
 */
public class DBConnector {
    private static final String DEFAULT_URL  = "jdbc:mysql://localhost:3306/onlineshop?useSSL=false&serverTimezone=UTC";
    private static final String DEFAULT_USER = "root";
    private static final String DEFAULT_PASS = "Aishu@2630";

    public static Connection connect() throws SQLException {
        String dbUrl  = System.getenv().getOrDefault("DB_URL", DEFAULT_URL);
        String dbUser = System.getenv().getOrDefault("DB_USER", DEFAULT_USER);
        String dbPass = System.getenv().getOrDefault("DB_PASS", DEFAULT_PASS);

        // Attempt to load the driver class explicitly for helpful log when missing.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC Driver loaded.");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver NOT found on classpath. " +
                    "Make sure connector jar is available at runtime.");
            // continue; DriverManager may still find auto-registered driver if jar is present
        }

        return DriverManager.getConnection(dbUrl, dbUser, dbPass);
    }
}


