package com.company.lesson19;

public class StringThreadDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("A");
        StringThread thread1 = new StringThread(str);
        StringThread thread2 = new StringThread(str);
        StringThread thread3 = new StringThread(str);
        thread2.start();
        thread3.start();
        thread1.start();
    }
}
