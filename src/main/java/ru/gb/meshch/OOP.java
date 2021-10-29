package ru.gb.meshch;

public class OOP {
  public static void main(String[] args) {

    Cat[] cats = new Cat[5];
    cats[0] = new Cat("", 1);


    Cat cat1 = new Cat();  // создали экземпляр класса Cat, инстанс, объект класса
    cat1.setName("Барсик");
    cat1.setAge(4) ;
    cat1.print();

    Cat cat2 = new Cat();
    cat2.setName("");
    cat2.setAge(-6);
    cat2.print();

    Cat c3 = new Cat("Мурка", 4);
    c3.print();

    System.out.println(c3.getName());
    System.out.println(c3.getAge());
  }
}
