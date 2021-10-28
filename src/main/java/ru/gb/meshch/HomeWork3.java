package ru.gb.meshch;

import java.util.Random;

public class HomeWork3 {
  private static int[] arr = {1, 1, 1, 2, 1, 5, 2} ;
  private static int n = 2;

  public static void main(String[] args) {

    replacementInArray();
    arrayValueFrom1To100();
    changeValue();
    fillTwoDimensionalArray();
    oneDimensionalArray(5, 2);
    minMaxElementInArray();
    resultCherryBalanceArray();
    shiftArrayElements(arr, n);

  }
  public static void replacementInArray() {
    int a[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    System.out.println("Массив до изменений:");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println("\nМассив после замены 0 на 1 и 1 на 0:");
    for (int i = 0; i < a.length; i++) {
     a[i] = (a[i] == 0 ? 1 : 0);
     System.out.print(a[i] + " ");
    }

  }

  public static void arrayValueFrom1To100() {
    int a[] = new int[100];
    int value = 1;
    System.out.println("\nЗаполнили массив значениями:");
    for (int i = 0; i < a.length; i ++) {
      a[i] = value;
      System.out.print(a[i] + " ");
      value++;
    }
    System.out.println("\n");
  }

  public static void changeValue() {
    int a[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    System.out.println("Массив до изменений:");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println("\nМассив после замены (числа меньшие 6 умножили на 2)):");
    for (int i = 0; i < a.length; i++) {
      if ( a[i] < 6 ) {
        a[i] = a[i] * 2;
      }
      System.out.print(a[i] + " ");
      }
  }


  public static void fillTwoDimensionalArray() {
    int a[][] = new int[3][3];
    int value = 0;
    System.out.println("\nКвадратный двумерный целочисленный массив:");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = value;
        System.out.print(a[i][j] + " ");
        value++;
      }
      System.out.println();
      }
    }

  public static void oneDimensionalArray(int len, int initialValue) {
    int a[] = new int[len];
    System.out.printf("\nОдномерный целочисленный массив, длиной %d, заполненный значением = %d:\n", len, initialValue);
    for (int i = 0; i < a.length; i++) {
      a[i] = initialValue;
      System.out.print(a[i] + " ");
    }
  }

  public static void minMaxElementInArray() {
    int a[] = new int[10];
    int max = 0;
    int min = 101;

    final Random random = new Random();
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(100);
    }
    System.out.println("\nОдномерный целочисленный массив:");
    for (int i = 0; i < a.length; i++) {
      System.out.println("a[" + i + "] = " + a[i]);
      if (min >= a[i]) {
        min = a[i];
      }
      if (max <= a[i]) {
        max = a[i];
      }
    }
    System.out.printf("Минимальный элемент массива = %d, максимальный элемент массива = %d:\n", min, max);
  }

    public static boolean CheckBalanceArray(int[] arr) {

    int sumArr = 0;
      for (int i = 0; i < arr.length; i++) {
        sumArr += arr[i];
      }
      if (sumArr % 2 != 0) {
        return false;
      }
      System.out.println("\nСумма по всему массиву:" + sumArr);
      int sumLeft = 0;
      for (int i = 0; i < arr.length; i++) {
        sumLeft += arr[i];
        if (sumLeft == sumArr - sumLeft) {
          System.out.println("\nСумма левой части:" + sumLeft);
          System.out.println("Сумма правой части:" + (sumArr - sumLeft));
          return true;
        }
      }
      return false;
    }

  public static void resultCherryBalanceArray() {
    boolean result = CheckBalanceArray(arr);
    System.out.println("Результат: "+ result + "\n");
  }

  public static void shiftArrayElements(int arr[], int n) {
    System.out.print("Исходный массив:\n");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.printf("\nПосле сдвига направо на %d элемента:\n", n);
    for (int i = 0; i < n; i++) {
      int buff = arr[arr.length - 1];
      for (int j = arr.length - 1; j > 0; j--) {
        arr[j] = arr[j-1];
      }
      arr[0] = buff;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    /* Еще один способ из разбора лекции 5
    Поправить и понять, как работает
    private static int[] shiftArray(int[a], int offset) {
      int len = a.lenght;
      offset %= len;
        for (int i = len - 1; i >= offset; i--) {
          int c = a[i];
          a[i] = a[i - offset];
          a[i - offset] = c;
        }
      System.out.println(Arrays.toString(s));
      return new int[0];
    }
    * */



  }
}