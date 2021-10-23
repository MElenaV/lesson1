package ru.gb.meshch;

public class HomeWorkApp {

  public static void main(String[] args) {
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();

  }

  public static void printThreeWords() {
    String firstWord = "Orange";
    String secondWord = "Banana";
    String thirdWorld = "Apple";
    System.out.println(firstWord + "\n" + secondWord + "\n" + thirdWorld + "\n");

  }
  public static void checkSumSign() {
    int a = 3, b = -5;
    int sum = a + b;
    if (sum >= 0){
      System.out.println("Сумма положительная");
    } else
      System.out.println("Сумма отрицательная");
  }

  public static void printColor() {
    int value = 101;
    if (value <= 0) {
      System.out.println("Красный");
    } else if ((value > 0) && (value <= 100)) {
      System.out.println("Желтый");
    } else
      System.out.println("Зеленый");
  }

  public static void compareNumbers() {
    int a = 4, b = 5;
    if (a >= b) {
      System.out.println("a >= b");
    } else
      System.out.println("a < b");
  }
}
