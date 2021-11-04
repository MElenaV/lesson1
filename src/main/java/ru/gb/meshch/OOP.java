package ru.gb.meshch;

public class OOP {
  public static void main(String[] args) {

    /* ООП. Принципы (кратко):
     * 0. Абстракция (ООП описывает объекты, мы отбрасываем у объекта какие-то свойства и оставляем те, что нужны для решения текущей задачи)
     * 1. Инкапсуляция - способ хранения данных объекта внутри самого объекта ИЛИ способ скрыть, как внутри этот класс устроен (от других классов)
     * 2. Наследование
     * 3. Полиморфизм
     * */

  //private - виден только внутри класса
  // default - виден только внутри пакета
  // public - виден везде

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
