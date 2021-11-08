package ru.gb.meshch;

import java.util.Scanner;

public class HW7 {

  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    Cat cats[] = { new Cat("Барон", 30, false),
                      new Cat("Мурзик", 40, false),
                      new Cat("Шуня", 40, false),
                      new Cat("Берни", 20, false),
                      new Cat("Персик", 20, false)};

    int additive;  // добавка

    Plate plate1 = new Plate(100);
    System.out.println("Миска с едой:");
    System.out.println(plate1);
    System.out.println("Список голодных котов");
    for (Cat cat : cats) {
      cat.printCat();
    }

    System.out.println("\nИнформация о сытости котиков после еды:");
    for (Cat cat : cats) {
      cat.eat(plate1);
    }
    System.out.println("Сколько корма еще насыпать? Введите положительное целочисленное значение или 0, если передумали докладывать еду в тарелку\n");
    additive = sc.nextInt();
      if (additive > 0) {
        plate1.addFood(additive);
        System.out.println("\nТарелка с едой:");
        System.out.println(plate1);

        System.out.println("\nИнформация о сытости котиков после добавки:");
        for (Cat cat : cats) {
          cat.eat(plate1);
        }
      }
  }
}
