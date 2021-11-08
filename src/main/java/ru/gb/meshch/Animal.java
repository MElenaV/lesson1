package ru.gb.meshch;

public abstract class Animal {  // Классы "заготовки" принято обозначать абстрактными - abstract, чтобы не создавать его экземпляры (они не нужны)
  private String name;
  private int appetite;
  private boolean satiety;
  private int age;
  private double weight;


  private static int count = 0;

  public Animal(String name, int age, double weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    count++;
  }

  public static int countAnimal() {
    return count;
  }

  public Animal(String name, int appetite, boolean satiety) {
    this.name = name;
    this.appetite = appetite;
    this.satiety = satiety;

  }

  public abstract int getRunLimit();

  public abstract int getSwimLimit();

  public int getAppetite() {
    return appetite;
  }

  public void setSatiety(boolean satiety) {
    this.satiety = satiety;
  }

  public boolean isSatiety() {
    return satiety;
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

  public void setAppetite(int appetite) {
    this.appetite = appetite;
  }

  protected abstract void voice();  // абстрактный метод не имеет тела, он не имеет своей логики, может быть только в абстрактном классе
  // !!! В дочернем классе абстрактный метод родительского класса должен быть обязательно перегружен/имплементирован*, иначе не скомпилируется

  public abstract void eat(Plate plate);

  public void run(String name, int length) {
    if (length <= getRunLimit()) {
      System.out.printf("%s пробежал %dм\n", name, length);
    } else {
      System.out.printf("%s не может пробежать более %dм\n", name, length);
    }
  }

  public void swim(String name, int length) {
    if (length <= getSwimLimit()) {
      System.out.printf("%s проплыл %dм\n", name, length);
    } else {
      System.out.printf("%s не может проплыть более %dм\n", name, length);
    }
  }

  public abstract boolean checkSatiety(String name, int appetite);

  @Override  // метод toString() - превращает класс в некоторое строковое представление
  public String toString() {  // перегрузка метода базового класса Object
    return "Animal{name='" + name + "', age=" + age + ", weight=" + weight + "}";
  }
}
