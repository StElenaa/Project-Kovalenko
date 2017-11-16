package com.company.lesson13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.company.lesson12.Employee;

/**
 * Программа, выводящая на консоль всю метаинформацию о выбранном классе
 * 
 * @author Elen
 *
 */
public class PrintMeta {
	public static void printMetaInfo(Class clazz) {
		System.out.println("Class name - " + clazz.getName());
		System.out.println("Is Array? " + clazz.isArray());
		System.out.println("Is Interface? " + clazz.isInterface());
		System.out.println("Is Primitive? " + clazz.isPrimitive());
		System.out.println();

		int modifiers = clazz.getModifiers();
		System.out.println("Is Abstract? " + ((modifiers & Modifier.ABSTRACT) != 0));
		System.out.println("Is Final? " + ((modifiers & Modifier.FINAL) != 0));
		System.out.println("Is Interfase? " + ((modifiers & Modifier.INTERFACE) != 0));
		System.out.println("Is Protected? " + ((modifiers & Modifier.PROTECTED) != 0));
		System.out.println("Is Private? " + ((modifiers & Modifier.PRIVATE) != 0));
		System.out.println("Is Public? " + ((modifiers & Modifier.PUBLIC) != 0));
		System.out.println("Is Static? " + ((modifiers & Modifier.STATIC) != 0));
		System.out.println();

		Constructor<?>[] constrs = clazz.getConstructors();
		for (Constructor<?> constructor : constrs) {
			System.out.println("Constructor: ");
			Class<?>[] paramClasses = constructor.getParameterTypes();
			System.out.print("Params (" + paramClasses.length + ") : ");
			for (Class<?> paramClass : paramClasses) {
				System.out.print(paramClass.getName() + ", ");
			}
		}
		System.out.println();
		Field[] filds = clazz.getFields();
		for (Field field : filds) {
			System.out.println("Fild: " + field.getName() + " Type: " + field.getClass().getName());
			modifiers = field.getModifiers();
			System.out.println("Is Protected? " + ((modifiers & Modifier.PROTECTED) != 0));
			System.out.println("Is Private? " + ((modifiers & Modifier.PRIVATE) != 0));
			System.out.println("Is Public? " + ((modifiers & Modifier.PUBLIC) != 0));
			System.out.println("Is Static? " + ((modifiers & Modifier.STATIC) != 0));
		}
	}

	public static void main(String[] args) {
		printMetaInfo(Employee.class);
	}
}
