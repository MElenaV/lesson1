package ru.gb.meshch;

public class HomeWorkApp {

  public static void main(String[] args) {
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();

  }

  public static void printThreeWords() {
    System.out.println("Orange\nBanana\nApple\n");

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
    } else if (value <= 100) {
      System.out.println("Желтый");
    } else
      System.out.println("Зеленый");
  }

  public static void compareNumbers() {
    int a = 4, b = -5;
    int c = a + b;
    System.out.println("Сумма " + (c >= 0 ? "положительная" : "отрицательная"));
   }

}
