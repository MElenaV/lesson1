package ru.gb.meshch;

public class CyclesHomeWork2 {

  public static void main(String[] args) {
    isPositiveSum(8,2);
    checkNumber(-1);
    isPositiveNumber(-1);
    outputPhraseNCount("Практическое задание №2", 3);
    System.out.println(isLeapYear(2021) ? "високосный" : "невисокосный");
  }

  public static boolean isPositiveSum(int a, int b) {
    int sum = a + b;
    return (sum >= 10 && sum <= 20);
  }

  public static void checkNumber(int a) {
    if (a >= 0) {
      System.out.println("Число " + a + " является положительным");
    } else
      System.out.println("Число " + a + " является отрицательным");
  }

  public static boolean isPositiveNumber(int a) {
    return (a >= 0);
  }

  public static void outputPhraseNCount(String phrase, int count) {
    for (int i = 0; i < count; i++) {
      System.out.println(phrase);
    }
  }

  public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
  }

}
