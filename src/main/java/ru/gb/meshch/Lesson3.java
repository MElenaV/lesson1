package ru.gb.meshch;

import java.util.Scanner;

public class Lesson3 {
  public static void main(String[] args) {
// Как менять метсами переменные

    factorial(5);
    fib(9);
    guessWord();

  }

    public static void guessWord() {
    String word = "apple";
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 3; i ++) {
      System.out.printf("Попробуйте угадать слово, которое я загадал: ");
      String userWord = scanner.nextLine();
        if (word.equals(userWord)) {
          System.out.println("Поздравляю, вы угадали!!!");
        } else {
          System.out.println("Пока неудача, попробуйте еще");
        }
      }
    }

  public static void sumArrayElements() {
    Scanner scanner = new Scanner(System.in);
    int a[] = new int[5];
    for (int i = 0; i < a.length; i ++) {
      System.out.printf("Введите значение a[%d]: ", i);
      a[i] = scanner.nextInt();
    }
    int s = 0;
      for (int i = 0; i < a.length; i ++) {
        s = s + a[i];
      }
      System.out.printf("Сумма элементов массива равна %d\n", s);
    }

  /* Факториал
      5! = 1 *2 *3 *4 *5
      0! = 1
   */
  public static long factorial(int n) {
    if (n<1) {
      return 1;
    }
    return n * factorial(n-1); // рекурсия
  }

  // Фиббоначи
  // 1 1 2 3 5 8 13 21 34
  public static long fib(int n) {
    if (n < 3) {
      return 1;
    }
    long first = 1, second = 1, sum = 0;
    for (int i = 3; i <= n; i++) {
      sum = first + second;
      first = second;
      second = sum;
    }
    return sum;
  }

}

