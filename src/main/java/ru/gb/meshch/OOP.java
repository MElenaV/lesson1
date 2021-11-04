package ru.gb.meshch;

import java.util.Arrays;

public class OOP {
  public static void main(String[] args) {
    /* ООП. Принципы (кратко):
     * 0. Абстракция (ООП описывает объекты, мы отбрасываем у объекта какие-то свойства и оставляем те, что нужны для решения текущей задачи)
     * 1. Инкапсуляция - способ хранения данных объекта внутри самого объекта ИЛИ способ скрыть, как внутри этот класс устроен (от других классов)
     * 2. Наследование
     * 3. Полиморфизм
     * */

    //private - виден только внутри класса
    // default - виден только внутри пакета
    // public - виден везде

    Employee[] employeeArr = new Employee[5];
    int adultAge = 40;
    employeeArr[0] = new Employee("Петров Петр Петрович", "инженер", "petrovPP@gmail.com", "8 910 104 78 23", 45000, 24);
    employeeArr[1] = new Employee("Лисин Александр Валерьевич", "стажер", "lis@mail.ru", "8 910 104 78 23", 10000, 19);
    employeeArr[2] = new Employee("Моисеев Андрей Алексеевич", "менеджер отдела продаж", "moiseev@gmail.com", "+7(926-654-32-12)", 45000, 45);
    employeeArr[3] = new Employee("Бубнов Антон Иванович", "менеджер отдела продаж", "buben@yandex.ru", "79106547898", 35000, 29);
    employeeArr[4] = new Employee("Волкова Анастасия Сергеевна", "бухгалтер", "volchok@mail.ru", "248-46-52", 30000, 41);

    System.out.println("Список всех сотрудников:");
    for (int i = 0; i < employeeArr.length; i++) {
      employeeArr[i].printEmployee();
    }

    System.out.printf("\nCотрудники старше %d лет:\n", adultAge);
    // for-each
    for (Employee employee : employeeArr) {
      if (employee.getAge() > adultAge) {
        employee.printEmployee();
      }
    }

    // stream
    System.out.printf("\nCотрудники младше %d лет:\n", adultAge);
    Arrays.stream(employeeArr)
            .filter(e -> e.getAge() < adultAge)
            .forEach(e -> System.out.println(e));
  }
}
