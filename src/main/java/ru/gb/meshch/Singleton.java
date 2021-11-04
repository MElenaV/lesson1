package ru.gb.meshch;

// Singleton - паттерн программирования. Идея: чтобы клас существовал в единственном экземпляре
// Пример исползования: создание сервиса (например, обращение к БД), который должен быть в единственном экземпляре
// Singleton считается антипаттерном (желательно избегать его использовать)

public class Singleton {

  private static Singleton INSTANCE;

  private int count;

  private Singleton() {

  }

  public static Singleton getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new Singleton();
    }
    return INSTANCE;
  }
  public int next() {
    return ++count;
  }
}
