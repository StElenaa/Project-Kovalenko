package com.company.lesson18;

import java.io.*;

public class SerializableHorse {

	public static Horse serialize(Horse horse) {
		try (FileOutputStream fs = new FileOutputStream("src\\com\\company\\lesson18\\testSer.ser");
				ObjectOutputStream os = new ObjectOutputStream(fs)) {
			os.writeObject(horse);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return horse;
	}

	public static Horse deserialize() {
		Horse horse = null;
		try (FileInputStream fis = new FileInputStream("src\\com\\company\\lesson18\\testSer.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			horse = (Horse) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return horse;
	}

	public static void main(String[] args) {
		Halter halter = new Halter();
		Horse horse = new Horse(halter);
		serialize(horse);
		Horse desirialaizedHorse = deserialize();
		if (horse.equals(desirialaizedHorse)) {
			System.out.println("Десериализация прошла успешно");
		} else {
			System.out.println("Десериализация не удалась");
		}
	}
}
