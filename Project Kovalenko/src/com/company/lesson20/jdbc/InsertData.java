package com.company.lesson20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static com.company.lesson20.jdbc.ConnectionData.DRIVER;
import static com.company.lesson20.jdbc.ConnectionData.URL;
import static com.company.lesson20.jdbc.ConnectionData.USER;
import static com.company.lesson20.jdbc.ConnectionData.PASSWORD;

public class InsertData {
    private static final String INSERT_QUERY =
            "INSERT INTO catalogs (name) VALUES ('stationery');";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            statement.execute(INSERT_QUERY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
