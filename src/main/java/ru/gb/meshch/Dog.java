package ru.gb.meshch;

public class Dog extends Animal {

  private static int count = 0;

  public Dog(String name, int age, double weight) {
    super(name, age, weight);  // super - означат родительский класс
    count++;
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

  @Override
  public void run(String name, int length) {
    if (length <= 500) {
      System.out.printf("%s пробежал %dм\n", name, length);
    } else {
      System.out.printf("%s не может пробежать более %dм\n", name, length);
    }
  }

  @Override
  public void swim(String name, int length) {
    if (length <= 10) {
      System.out.printf("%s проплыл %dм\n", name, length);
    } else {
      System.out.printf("%s не может проплыть более %dм\n", name, length);
    }
  }
}
