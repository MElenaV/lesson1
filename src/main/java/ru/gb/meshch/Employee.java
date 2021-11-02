package ru.gb.meshch;

public class Employee {

  private String fullName;
  private String position;
  private String email;
  private String phone;
  private float salary;
  private int age;

  public Employee(String fullName, String position, String email, String phone, float salary, int age) {
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

}
