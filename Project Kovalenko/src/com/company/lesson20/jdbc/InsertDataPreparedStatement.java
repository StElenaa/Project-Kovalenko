package com.company.lesson20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static com.company.lesson20.jdbc.ConnectionData.DRIVER;
import static com.company.lesson20.jdbc.ConnectionData.URL;
import static com.company.lesson20.jdbc.ConnectionData.USER;
import static com.company.lesson20.jdbc.ConnectionData.PASSWORD;

public class InsertDataPreparedStatement {
    private static final String INSERT_QUERY =
            "INSERT INTO users (login, password) VALUES (?,?);";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement(INSERT_QUERY)) {

            preparedStatement.setString(1, "misha");
            preparedStatement.setString(2, "misha444");
            preparedStatement.addBatch();

            preparedStatement.setString(1, "grisha");
            preparedStatement.setString(2, "grisha555");
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
