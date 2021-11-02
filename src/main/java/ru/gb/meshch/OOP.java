package ru.gb.meshch;

public class OOP {
  public static void main(String[] args) {

    Employee[] employeeArr = new Employee[5];
    int adultAge = 40;
    employeeArr[0] = new Employee("Петров Петр Петрович", "инженер", "petrovPP@gmail.com","8 910 104 78 23", 45000, 24);
    employeeArr[1] = new Employee("Лисин Александр Валерьевич", "стажер", "lis@mail.ru","8 910 104 78 23", 10000, 19);
    employeeArr[2] = new Employee("Моисеев Андрей Алексеевич", "менеджер отдела продаж", "moiseev@gmail.com","+7(926-654-32-12)", 45000, 45);
    employeeArr[3] = new Employee("Бубнов Антон Иванович", "менеджер отдела продаж", "buben@yandex.ru","79106547898", 35000, 29);
    employeeArr[4] = new Employee("Волкова Анастасия Сергеевна", "бухгалтер", "volchok@mail.ru","248-46-52", 30000, 40);

    System.out.println("Список всех сотрудников:");
    for (int i = 0; i < employeeArr.length; i++) {
        employeeArr[i].printEmployee();
    }
      
    System.out.printf("\nCотрудники старше %d лет:\n", adultAge);
    Employee[] adultArr = new Employee[employeeArr.length];;
    for (int i = 0; i < employeeArr.length; i++) {
      if (employeeArr[i].getAge() > adultAge) {
        adultArr[i] = employeeArr[i];
        adultArr[i].printEmployee();
      }
    }
  }
}
