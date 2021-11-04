package ru.gb.meshch;

public class HW6 {
  public static void main(String[] args) {
    Animal dog1 = new Dog("Тузик", 10, 25);
    Animal dog2 = new Dog("Фокс", 3, 40);
    Animal dog3 = new Dog("Мотильда", 12, 52);
    dog1.run(dog1.getName(),200);
    dog1.swim(dog2.getName(),9);
    Animal cat1 = new Cat("Вася", 3, 5);
    Animal cat2 = new Cat("Шуня", 10, 4);
    cat1.run(cat1.getName(),200);
    cat2.swim(cat2.getName(),2);

    System.out.println("\nСозданных собак: "+Dog.countDog());
    System.out.println("Созданных котов: " + Cat.countCat());
    System.out.println("Итого создано животных: "+ Animal.countAnimal());
  }


  }

