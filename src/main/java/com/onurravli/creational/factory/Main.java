package com.onurravli.creational.factory;

interface Product {
    void create();
}

class ConcreteProductA implements Product {
    public void create() {
        System.out.println("Product A created.");
    }
}

class ConcreteProductB implements Product {
    public void create() {
        System.out.println("Product B created.");
    }
}

class Factory {
    public static Product createProduct(String type) throws NullPointerException{
        if(type.equals("a")) {
            return new ConcreteProductA();
        } else if (type.equals("b")) {
            return new ConcreteProductB();
        }
        throw new NullPointerException();
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Product p1 = Factory.createProduct("a");
            p1.create();
        } catch (Exception e) {
            System.out.println("Null pointer exception.");
        }
    }
}
