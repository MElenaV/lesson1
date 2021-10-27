package ru.gb.meshch;

import java.util.Random;
import java.util.Scanner;

public class BullsCowsGame {
  public static void main(String[] args) {
    play();
  }

  private static void play() {
    int[] guessNum = generateNumber();
    Scanner scanner = new Scanner(System.in);
    int bulls, cows, step = 0;
    do {
      bulls = 0;
      cows = 0;
      System.out.println("Введите четырехзначное число: ");
      String playerNum = scanner.nextLine();
      for (int i = 0; i < 4; i++) {
        if (guessNum[i] == playerNum.charAt(i) - '0') {
          bulls++;
        } else if (playerNum.contains(String.valueOf(guessNum[i]))) {
          cows++;

        }
      }
      step++;
      System.out.printf("Ход %d. Введено число %s, быков %d, коров %d\n", step, playerNum, bulls, cows);

    } while (bulls < 4);
    System.out.println("Поздравляю, вы выиграли!!!");
  }

  private static int[] generateNumber() {  // генерим число
    int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Random random = new Random();
    for (int i = 0; i < 100; i++) {
      int i1 = random.nextInt(10);
      int i2 = random.nextInt(10);
      int c = a[i2];
      a[i2] = a[i1];
      a[i1] = c;

    }
    return new int[]{a[0], a[1], a[2], a[3]};
  }
}
