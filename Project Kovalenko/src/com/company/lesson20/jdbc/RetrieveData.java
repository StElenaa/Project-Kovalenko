package com.company.lesson20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static com.company.lesson20.jdbc.ConnectionData.DRIVER;
import static com.company.lesson20.jdbc.ConnectionData.URL;
import static com.company.lesson20.jdbc.ConnectionData.USER;
import static com.company.lesson20.jdbc.ConnectionData.PASSWORD;

public class RetrieveData {
	private static final String SELECT_QUERY = "SELECT * FROM products;";

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName(DRIVER);
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				Statement statement = connection.createStatement()) {

			ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
			System.out.printf("%-10s%-20s%s%n", "id", "name product", "price product");
			System.out.println("-----------------------------------------------------");
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				float price = resultSet.getFloat("price");
				System.out.printf("%-10s%-20s%s%n", id, name, price);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
