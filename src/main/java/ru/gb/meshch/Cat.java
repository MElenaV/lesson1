package ru.gb.meshch;

public class Cat extends Animal {  // "чертеж" кота :)

  public Cat(String name, int age, double weight) {
    super(name, age, weight);
  }

  public Cat(String name, int appetite) {
    super(name, appetite);
  }

  @Override  // переопределение метода родительского класса
  public void voice() {
    System.out.println("Мяу");
  }

  public void jump() {
    System.out.println("Кот подпрыгнул");
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
    plate.decreaseFood(getAppetite());

  }
}
