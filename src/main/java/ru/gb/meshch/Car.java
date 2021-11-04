package ru.gb.meshch;

public class Car {
  // поля класса, они создаются, когда создаётся экземпляр класса
  private double fuelVolume; // количество топлива в топливном баке
  private double fuelConsumption; // расход топлива на 1 км

  private static int value = 0;  // статические поля принадлежат не только экземпляру класса, но и всему классу (можно использовать в счетчике экземпляра класса)
  // использование статических методов - это не ООП, это процедурное/модульное программирование

  public Car() {
  }

  public static int getValue() {
    return value;
  }

  private Car (double fuelVolume, double fuelConsumption) {
    this.fuelVolume = fuelVolume;
    this.fuelConsumption = fuelConsumption;
    value++;
  }

  public boolean move (double kilometers) {
    double newFuelVolume = fuelVolume - fuelConsumption * kilometers;
    if (newFuelVolume < 0) {
      System.out.println("Не можем проехать " + kilometers + " км");
      return false;
    }
    this.fuelVolume = newFuelVolume;
    return true;
  }

  public static Car create(double fuelVolume, double fuelConsumption) {  //создали инстанс, чтобы можно было создавать экземпляр только с валидными значениями
    // статический метод - это метод, который не принадлежит экземпляру класса, а принадлежит всему классу
    if (fuelConsumption > 0 && fuelVolume >= 0) {
      return new Car(fuelVolume, fuelConsumption);
    }
    return null;
  }
  public static void printInfo() {  // из статического метода нельзя получить доступ к полям класса, т.к. они создаются при создании экземпляра класса
    System.out.println("Автомобиль с расходом топлива" + value );
  }

}
