package ru.gb.meshch;

public class Lesson6_OOP {
  public static void main(String[] args) {
  Animal dog1 = new Dog("Шарик", 2, 20);
  Animal cat1 = new Cat("Мурзик", 3, 10);
  Animal cat2 = new Cat("Мурзик", 3, 10);

    System.out.println(cat1);
    System.out.println(dog1);

    if(cat1.equals(cat2)) {
    System.out.println("Это один и тот же кот");
  } else {
    System.out.println("Это разные коты");
  }

  askQuesyion(cat1);
  askQuesyion(dog1);
}

  static void askQuesyion(Animal animal) {
    if (animal instanceof Cat) {  // оператор instanceof - сравнение объектов, но не желательное (instanceof - признак плохого кода)
      Cat cat = (Cat) animal; //приведение типов, т.к. метод jump() не принадлежит классу Animal
      cat.jump();
    }
    if (animal instanceof Dog) {
      Dog dog = (Dog) animal;
      dog.bite();
    }
    System.out.println("Какое животное говорит ");
    animal.voice();
  }
}
