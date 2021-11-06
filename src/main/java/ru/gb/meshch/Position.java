package ru.gb.meshch;

public enum Position {  // enum - класс перечисление, перечисления указываются большими буквами

  ENGINEER("Инженер", "Engineer", 1.5),
  HR("Отдел кадров", "HR", 1.1),
  ACCOUNTANT("Бухгалтерия", "Accountant", 1.3),
  SALES_MANAGER("Продажник", "Sales", 3),
  BOSS("Начальник", "Boss", 5),
  MANAGER("Менеджер", "Manager", 2.5);

  private String name;
  private String englishName;
  private double salaryCoef;

  Position(String name, String englishName, double salaryCoef) {
    this.name = name;
    this.englishName = englishName;
    this.salaryCoef = salaryCoef;
  }

  public String getName() {
    return name;
  }

  public String getEnglishName() {
    return englishName;
  }

  public double getSalaryCoef() {
    return salaryCoef;
  }
}
