package com.company.lesson17.shop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ���� ���������� - ��������-�������. ����������� ��������� �����������: a)
 * �������������� ������������. �����������, ���������� ���� �����-������. ����
 * ������������ ���� ���������� ������, �� ����������������. � ���� ������
 * ��������� ������ User, c��������� �����, ������. ���� ������ �� ����������,
 * �� ��������� ������ User, � ������� ����������. �) �������� ������ ���������
 * ������, �) �������� ������ ������� ������������� ��������, ����������������
 * �� ��������� ��������, �) ����� ������ � �������, �) ������� �������,
 * ����������� � �������, �) ����� �������, ������������ ����� � ����,
 * ���������� ���������� � ���������� �������. ���������� ����� PrintWriter ���
 * ������ � �������������� ������. ������ �������� ��� ������������ �
 * �������������� ����������� ��������� ��������� �������.
 * 
 * @author Elen
 *
 */
public class Shop {
	private Map<String, Catalog> catalogs;
	private Map<String, String> credentials;

	public Shop() {
		this.catalogs = new HashMap<>();
		this.credentials = new HashMap<>();
	}

	public Map<String, Catalog> getCatalogs() {
		return catalogs;
	}

	public void setCatalogs(Map<String, Catalog> catalogs) {
		this.catalogs = catalogs;
	}

	public void addCatalog(Catalog catalog) {
		catalogs.put(catalog.getName(), catalog);
	}

	public void removeCatalog(String name) {
		catalogs.remove(name);
	}

	public void addUser(String login, String password) {
		credentials.put(login, password);
	}

	public User authenticate(String login, String password) {
		String pwd = credentials.get(login);
		if (pwd == null || !pwd.equals(password)) {
			return new User();
		}
		return new User(login, password);
	}

	public void registerUser(String login, String password, String confPassword) {
		try {
			RegisterUser.isCorrect(login, password, confPassword);
			credentials.put(login, password);
		} catch (WrongLoginException e) {
			System.out.println(e.getMessage());
		} catch (WrongPasswordException e) {
			System.out.println(e.getMessage());
		}
	}

	public void putInBag(User user, String catalog, Product p, int q) {
		catalogs.get(catalog).removeProducts(p, q);
		user.addToBag(p, q);
	}

	public void buyFromBag(User user) {
		try (PrintWriter pw = new PrintWriter(new FileWriter("src\\io\\report.txt"))) {
			pw.println("������� ������������ " + user.getLogin());
			Catalog bag = user.getBag();
			Map<Product, Integer> bagContent = bag.getProducts();
			for (Map.Entry<Product, Integer> entry : bagContent.entrySet()) {
				pw.println(entry.getKey() + " ���������� - " + entry.getValue());
			}
			pw.flush();
			pw.close();
		} catch (IOException e) {
			System.out.print("Exception");
		}
		user.buyFromBag();
	}

	public static Catalog serializeBag(Catalog bag) {
		try (FileOutputStream fs = new FileOutputStream("src\\io\\Bag.ser");
				ObjectOutputStream os = new ObjectOutputStream(fs)) {
			os.writeObject(bag);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}

	public static Catalog deserializeBag() {
		Catalog bag = null;
		try (FileInputStream fis = new FileInputStream("src\\io\\Bag.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			bag = (Catalog) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}

	private static void printCatalogs(Shop s) {
		for (String name : s.getCatalogs().keySet()) {
			System.out.println("������� - " + name);

			Catalog c = s.getCatalogs().get(name);
			for (Map.Entry<Product, Integer> entry : c.getProducts().entrySet()) {
				System.out.println("����� - " + entry.getKey().getName() + " ���������� " + entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		Shop s = new Shop();
		Catalog cravats = new Catalog("��������");
		cravats.addProducts(new Cravat("�������1", 25, 2, "�������"), 5);
		cravats.addProducts(new Cravat("�������2", 25.8f, 3, "������"), 10);
		cravats.addProducts(new Cravat("�������3", 75, 2, "�����"), 50);
		s.addCatalog(cravats);
		Catalog skirts = new Catalog("����");
		skirts.addProducts(new Skirt("����1", 56.7f, 4, "�������"), 20);
		skirts.addProducts(new Skirt("����2", 75.8f, 2, "�������"), 10);
		skirts.addProducts(new Skirt("����3", 80.6f, 4, "�����"), 6);
		s.addCatalog(skirts);
		Catalog pants = new Catalog("�����");
		pants.addProducts(new Pants("�����1", 50.6f, 3, "�����"), 40);
		pants.addProducts(new Pants("�����2", 75.6f, 2, "������"), 30);
		pants.addProducts(new Pants("�����3", 25.4f, 5, "�����"), 10);
		s.addCatalog(pants);
		s.registerUser("Petrov", "PPPPPP", "PPPPPP");
		s.registerUser("Ivanov", "IIIIIIII", "PPPPPP");
		s.registerUser("Sidorov", "SSSSSSSS", "SSSSSSSS");
		printCatalogs(s);
		User user1 = s.authenticate("Petrov", "PPPPPP");
		if (user1.getLogin() == null) {
			System.out.println("�������� ����� ��� ������");
			System.exit(0);
		}
		Comparator<Product> c = new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return ((o1.getPrice() - o2.getPrice()) < 0 ? -1 : 1);
			}
		};
		List<Product> t = cravats.getSorted(c);
		List<Product> t1 = skirts.getSorted(c);
		Product p = t.get(0);
		Product p1 = t1.get(0);
		s.putInBag(user1, cravats.getName(), p, 1);
		s.putInBag(user1, skirts.getName(), p1, 2);
		Catalog bag = user1.getBag();
		Map<Product, Integer> bagContent = bag.getProducts();
		System.out.println("������� ������������ " + user1.getLogin());
		for (Map.Entry<Product, Integer> entry : bagContent.entrySet()) {
			System.out.println(entry.getKey() + " ���������� - " + entry.getValue());
		}
		s.buyFromBag(user1);
		printCatalogs(s);
		serializeBag(bag);
		Catalog bag1 = deserializeBag();
		if (bag.equals(bag1)) {
			System.out.println("�������������� ������ �������");
		} else {
			System.out.println("�������������� �� �������");
		}
	}
}
