package ru.gb.meshch;

public class Plate {

  private int food;

  public Plate(int food) {
    this.food = food;
  }

  public int getFood() {
    return food;
  }

  public void decreaseFood(int food) {
    if (food > 0) {
      this.food -= food;
    }
  }

  public void addFood(int food) {
    this.food += food;
    System.out.printf("Добавили %d единиц корма в тарелку", food);
  }


  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("В тарелке ");
    sb.append(food);
    sb.append(" единиц корма");
    return sb.toString();
  }
}
