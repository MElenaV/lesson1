package ru.gb.meshch;

public class Cat extends Animal {  // "чертеж" кота :)

  private static int count = 0;

  public Cat(String name, int age, double weight) {
    super(name, age, weight);
    count++;
  }

  public static int countCat() {
    return count;
  }

  public Cat(String name, int appetite, boolean satiety) {
    super(name, appetite, satiety);
  }

  public void printCat() {
    System.out.printf("Кличка: %s, аппетит: %d, сытость: %b\n", getName(), getAppetite(), isSatiety());
  }

  @Override
  public boolean checkSatiety(String name, int appetite) {
    if (appetite == 0) {
      System.out.printf("%s сыт\n", name);
      return true;
    }
    else {
      System.out.printf("%s голодный\n", name);
      return false;
    }
  }

  @Override  // переопределение метода родительского класса
  public void voice() {
    System.out.println("Мяу");
  }

  @Override
  public void run(String name, int length) {
    if (length <= 200) {
      System.out.printf("%s пробежал %dм\n", name, length);
    } else {
      System.out.printf("%s не может пробежать более %dм\n", name, length);
    }
  }

  @Override
  public void swim(String name, int length) {
      System.out.printf("%s не может плыть, даже %dм\n", name, length);
  }

  public void jump() {
    System.out.println("Кот подпрыгнул\n");
  }

  @Override
  public boolean equals(Object obj) {  // для сравнения объектов ссылочного типа, нужно обязательно переопределять метод класса object для сравнения объектов своих классов
    if (this == obj) { // если ссылка на текущий объект одинаковая - это один и тот же объект
      return true;
    }if (!(obj instanceof Cat)) {
      return false;
    }
    Cat cat = (Cat) obj;
    return  (cat.getName().equals(this.getName()) && cat.getAge() == this.getAge() && cat.getWeight() == this.getWeight());
  }

  @Override
  public void eat(Plate plate) {
    int appetite;
    if (getAppetite() <= plate.getFood()) {
      plate.decreaseFood(getAppetite());
      appetite = 0;
      setAppetite(appetite);
      setSatiety(checkSatiety(getName(), appetite));
    }
    else {
      appetite = getAppetite();
      System.out.printf("%s отказался есть, не достаточно еды\n", getName());
      setSatiety(checkSatiety(getName(), appetite));
    }
  }

}
