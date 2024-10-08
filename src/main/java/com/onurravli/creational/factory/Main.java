package com.onurravli.creational.factory;

public class Main {
    public static void main(String[] args) {
        try {
            Product p1 = Factory.createProduct("a");
            p1.create();
            Product p2 = Factory.createProduct("b");
            p2.create();
        } catch (Exception e) {
            System.out.println("Null pointer exception.");
        }
    }
}
