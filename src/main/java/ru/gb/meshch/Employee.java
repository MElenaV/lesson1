package ru.gb.meshch;

public class Employee {

  private String fullName;
  private String position;
  private String email;
  private String phone;
  private double salary;
  private int age;

  public Employee(String fullName, String position, String email, String phone, double salary, int age) {
    this.fullName = fullName;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void printEmployee() {
    System.out.printf("ФИО: %s, должность: %s, email: %s, телефон: %s, зарплата: %f, возраст: %d\n", fullName, position, email, phone, salary, age);
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer();
    sb.append("ФИО: ").append(fullName);
    sb.append(", должность: ").append(position);
    sb.append(", email: ").append(email);
    sb.append(", телефон: ").append(phone);
    sb.append(", зарплата: ").append(salary);
    sb.append(", возраст: ").append(age);
    return sb.toString();
  }

  // контракт:
  // if Object o is null return false
  // a.equals(s) == true
  // if a.equals(b) -- true then b.equals(a) == true  // рефлексивность
  // a == b, b == c => a == c // транзитивность
  // метод equals должен быть такой, чтобы контракт соблюдался
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;  // проверка ссылок, если одинаковые - один и тот же объект
    if (o == null || getClass() != o.getClass()) return false;  // проверяются классы объектов, их названия

    Employee employee = (Employee) o;

    if (Double.compare(employee.salary, salary) != 0) return false;
    if (age != employee.age) return false;
    if (fullName != null ? !fullName.equals(employee.fullName) : employee.fullName != null) return false;
    if (position != null ? !position.equals(employee.position) : employee.position != null) return false;
    if (email != null ? !email.equals(employee.email) : employee.email != null) return false;
    return phone != null ? phone.equals(employee.phone) : employee.phone == null;
  }

}
