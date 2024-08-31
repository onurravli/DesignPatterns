package com.onurravli.creational.factory;

public class Factory {
  public static Product createProduct(String type) throws NullPointerException {
    if (type.equals("a")) {
      return new ConcreteProductA();
    } else if (type.equals("b")) {
      return new ConcreteProductB();
    }
    throw new NullPointerException();
  }
}