package com.company.lesson20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static com.company.lesson20.jdbc.ConnectionData.DRIVER;
import static com.company.lesson20.jdbc.ConnectionData.URL;
import static com.company.lesson20.jdbc.ConnectionData.USER;
import static com.company.lesson20.jdbc.ConnectionData.PASSWORD;

public class CreatingTable {
    private static final String CREATE_TABLE_QUERY =
            "CREATE TABLE users1 "
                    + "(id INT(5) NOT NULL AUTO_INCREMENT,"
                    + " login VARCHAR(50), "
                    + " password VARCHAR(20), "
                    + " phoneNumber INTEGER(10), "
                    + "PRIMARY KEY(id));";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(CREATE_TABLE_QUERY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


