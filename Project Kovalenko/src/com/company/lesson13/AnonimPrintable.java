package com.company.lesson13;

import com.company.lesson9.printable.Printable;

public class AnonimPrintable {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.print("ֲûחמג לועמהא print() interface Printable");
            }
        };
        printable.print();
    }
}
