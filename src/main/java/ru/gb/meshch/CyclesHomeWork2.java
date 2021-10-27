package ru.gb.meshch;

public class CyclesHomeWork2 {

  public static void main(String[] args) {
    isPositiveSum(8,2);
    CheckNumber(-1);
    isPositiveNumber(-1);
    outputPhraseNCount("Практическое задание №2", 3);
    isLeapYear(2025);
  }

  public static boolean isPositiveSum(int a, int b) {
    int sum = a + b;
    return (sum >= 10 && sum <= 20);
  }

  public static void CheckNumber(int a) {
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
    boolean isLeapYear = false;
    for (int i = 0; i <= year; i += 4) {
      for (int j = 0; j <= year; j += 100) {
        for (int k = 0; k <= year; k += 400) {
          if ((year == i) && (year != j) || (year == k)) {
            isLeapYear = true;
          } else {
            isLeapYear = false;
          }
        }
      }
    }

    if (isLeapYear == true)
    {
      System.out.println("Год " + year + " является високосным!");
    }
    else {
      System.out.println("Год " + year + " НЕ является високосным!");
    }
  return isLeapYear;
  }
}
