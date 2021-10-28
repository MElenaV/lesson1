package ru.gb.meshch;

import java.util.Random;
import java.util.Scanner;

public class NoughtsCrosses {

  public static int SIZE = 3;
  public static final char DOT_EMPTY = '•';
  public static final char DOT_X = 'X';
  public static final char DOT_O = 'O';
  public static char[][] map;
  public static Scanner sc = new Scanner(System.in);
  public static Random rand = new Random();
  public static void main(String[] args) {

    initMap();  // инициализировали поле
    printMap();  // напечатали поле
    play();  // играем

  }

  private static void play() {  // играем до тех пор, пока не заполнится игровое поле или не выиграет один из участников
    while (true) {
      humanTurn();
      printMap();
      if (checkWin(DOT_X)) {
        System.out.println("Победил человек");
        break;
      }
      if (isMapFull()) {
        System.out.println("Ничья");
        break;
      }
      aiTurn();
      printMap();
      if (checkWin(DOT_O)) {
        System.out.println("Победил Искуственный Интеллект");
        break;
      }
      if (isMapFull()) {
        System.out.println("Ничья");
        break;
      }
    }
    System.out.println("Игра закончена");
  }

  public static boolean checkWin(char symb) { // проверка победы
    return checkWinLines(symb) || checkWinDiagonals(symb);
  }

  private static boolean checkWinLines(char symb) {
    for (int i = 0; i < SIZE; i++) {
      int countCol = 0;
      int countRow = 0;
      for (int j = 0; j < SIZE; j++) {
        if (map[i][j] == symb)  // проверка по горизонтале
        {
          countRow++;
          if (countRow == SIZE)
          {
            return true;
          }
        }
        if (map[j][i] == symb)  // проверка по вертикале
        {
          countCol++;
          if (countCol == SIZE)
          {
            return true;
          }
        }
      }
    }
    return false;
  }

  private static boolean checkWinDiagonals(char symb) {
    int count = 0; // счетчик
    for (int i = 0; i < SIZE; i++)
    {
      if (map[i][i] == symb || map[SIZE - i - 1][i] == symb)  //проверка победы по обоим диагоналям
      {
        count++;
      }
    }
    if (count == SIZE)  // проверка на количество символов Х/О для победы
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public static boolean isMapFull() {
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        if (map[i][j] == DOT_EMPTY) return false;
      }
    }
    return true;
  }
  public static void aiTurn() { // Ход компьютера
    int x, y;
    do {
      x = rand.nextInt(SIZE);
      y = rand.nextInt(SIZE);
    } while (!isCellValid(x, y));
    System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
    map[y][x] = DOT_O;
  }
  public static void humanTurn() { // Ход человека
    int x, y;
    do {
      System.out.println("Введите координаты в формате X Y");
      x = sc.nextInt() - 1;
      y = sc.nextInt() - 1;
    } while (!isCellValid(x, y)); // если ячейка свободна, ставим крестик
    map[y][x] = DOT_X;
  }
  public static boolean isCellValid(int x, int y) {  // проверка - можно ли поставить фишку в указанную ячейку (входит ли в поле и пустая ли ячейка)
    if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
    if (map[y][x] == DOT_EMPTY) return true;
    return false;
  }
  public static void initMap() {
    map = new char[SIZE][SIZE];
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        map[i][j] = DOT_EMPTY;
      }
    }
  }
  public static void printMap() {
    for (int i = 0; i <= SIZE; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
    for (int i = 0; i < SIZE; i++) {
      System.out.print((i + 1) + " ");
      for (int j = 0; j < SIZE; j++) {
        System.out.print(map[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

}
