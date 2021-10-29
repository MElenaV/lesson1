package ru.gb.meshch;

import sun.util.resources.cldr.naq.CalendarData_naq_NA;

public class Cat {  // "чертеж" кота :)
  /* ООП. Принципы (кратко):
   * 0. Абстракция (ООП описывает объекты, мы отбрасываем у объекта какие-то свойства и оставляем те, что нужны для решения текущей задачи)
   * 1. Инкапсуляция - способ хранения данных объекта внутри самого объекта ИЛИ способ скрыть, как внутри этот класс устроен (от других классов)
   * 2. Наследование
   * 3. Полиморфизм
   * */
  private String name = "Мурзик";  // поля класса
  private int age = 1;

  // private - виден только внутри класса
  // default - виден только внутри пакета
  // public - виден везде

  public Cat() {// конструктор - это специальный метод, который называется как класс (с большой буквы)
    this("Мурзик", 1);
  }

  public Cat(int age) {
    this("Мурзик", age);
  }
  public Cat(String name) {
    this(name, 1);
  }

  public Cat(String name, int age) {
    setName(name);
    setAge(age);
  }

  public void print() {
    int a;
    System.out.printf("Кот по имени %s, возрастом %d лет\n", name, age);
  }

 public void setAge(int age) {
    if (age > 0 && age < 50) {
      this.age = age;  // this всегда ссылается на текущий класс (поле текущего класса)
    } else {
      System.out.println("Возраст должен быть больше 0 и меньше 50");
    }
  }

  public void setName(String name) {
    if (name.length() > 0) {
      this.name = name;
    } else {
      System.out.println("Имя котика не должно быть пустым");
    }
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }
}
