package ru.gb.meshch;

public class Dog extends Animal {

  public Dog(String name, int age, double weight) {
    super(name, age, weight);  // super - означат родительский класс
  }

  @Override
  public void voice() {
    System.out.println("Гаф!");
  }

  public void bite() {
    System.out.println("Собака кусается");
  }
}
