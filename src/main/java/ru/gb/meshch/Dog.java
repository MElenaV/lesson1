package ru.gb.meshch;

public class Dog extends Animal {

  public static final int DOG_RUN_LIMIT = 500;
  public static final int DOG_SWIM_LIMIT = 10;
  private static int count = 0;

  public Dog(String name, int age, double weight) {
    super(name, age, weight);  // super - означат родительский класс
    count++;
  }

  @Override
  public int getRunLimit() {
    return DOG_RUN_LIMIT;
  }

  @Override
  public int getSwimLimit() {
    return DOG_SWIM_LIMIT;
  }

  public static int countDog() {
    return count;
  }

  @Override
  public void voice() {
    System.out.println("Гаф!");
  }

  public void bite() {
    System.out.println("Собака кусается");
  }

  @Override
  public void eat(Plate plate) {

  }


}
