package ru.gb.meshch;

public class App {

  public static void main(String[] args) {

    Car car1 = Car.create(12, 32);
    Car car2 = Car.create(10, 30);
    Car car3 = Car.create(8, 25);
    System.out.println(Car.getValue());

    Singleton singleton = Singleton.getInstance();
    System.out.println(singleton.next());
    System.out.println(singleton.next());
    System.out.println(singleton.next());
    Singleton singleton1 = Singleton.getInstance();
    System.out.println(singleton1.next());
    System.out.println(singleton1.next());





  }

}
