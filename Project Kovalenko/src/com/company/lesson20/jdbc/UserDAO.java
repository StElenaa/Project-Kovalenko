package com.company.lesson20.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO extends AbstractDAO<Integer, User> {
	public static final String SQL_SELECT_ALL_USERS = "SELECT * FROM users";
	public static final String SQL_SELECT_USER_ID = "SELECT * FROM users WHERE id=?";
	public static final String SQL_DELETE_USER_ID = "DELETE FROM users WHERE id=?";
	public static final String SQL_CREATE_USER = "INSERT INTO users (login, password) VALUES (?, ?)";
	public static final String SQL_UPDATE_USER = "UPDATE users SET login=?, password=? WHERE id=?";

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<>();
		try (Connection connection = ConnectorDB.getConnection(); Statement statement = connection.createStatement()) {
			ResultSet rs = statement.executeQuery(SQL_SELECT_ALL_USERS);
			while (rs.next()) {
				int id = rs.getInt(1);
				String login = rs.getString(2);
				String passwod = rs.getString(3);
				users.add(new User(id, login, passwod));
			}
		} catch (SQLException e) {
			System.err.println("SQL Exeption (request failed):" + e);
		}
		return users;
	}

	@Override
	public User findEntityById(Integer id) {
		User user = null;
		try (Connection connection = ConnectorDB.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_SELECT_USER_ID)) {
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				id = rs.getInt(1);
				String login = rs.getString(2);
				String passwod = rs.getString(3);
				user = new User(id, login, passwod);
			}
		} catch (SQLException e) {
			System.err.println("SQL Exeption (request failed):" + e);
		}
		return user;
	}

	@Override
	public boolean delete(Integer id) {
		try (Connection connection = ConnectorDB.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_DELETE_USER_ID)) {
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("SQL Exeption (request failed):" + e);
			return false;
		}
		return true;

	}

	@Override
	public boolean delete(User entity) {
		return delete(entity.getId());
	}

	@Override
	public boolean create(User entity) {
		try (Connection connection = ConnectorDB.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_CREATE_USER)) {
			statement.setString(1, entity.getLogin());
			statement.setString(2, entity.getPasswod());
			statement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("SQL Exeption (request failed):" + e);
			return false;
		}
		return true;
	}

	@Override
	public User update(User entity) {
		try (Connection connection = ConnectorDB.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_UPDATE_USER)) {
			statement.setString(1, entity.getLogin());
			statement.setString(2, entity.getPasswod());
			statement.setInt(3, entity.getId());
			statement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("SQL Exeption (request failed):" + e);
			return null;
		}
		return entity;
	}
}
