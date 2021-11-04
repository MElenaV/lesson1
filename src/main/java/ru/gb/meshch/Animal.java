package ru.gb.meshch;

public abstract class Animal {  // Классы "заготовки" принято обозначать абстрактными - abstract, чтобы не создавать его экземпляры (они не нужны)
  private String name;
  private int age;
  public double weight;

  public Animal(String name, int age, double weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  protected abstract void voice();  // абстрактный метод не имеет тела, он не имеет своей логики, может быть только в абстрактном классе
  // !!! В дочернем классе абстрактный метод родительского класса должен быть обязательно перегружен/имплементирован*, иначе не скомпилируется


  @Override  // метод toString() - превращает класс в некоторое строковое представление
  public String toString() {  // перегрузка метода базового класса Object
    return "Animal{name='" + name + "', age=" + age + ", weight=" + weight + "}";
  }
}
