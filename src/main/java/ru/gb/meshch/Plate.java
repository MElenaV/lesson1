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
    this.food -= food;
  }


  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Plate{");
    sb.append("food=").append(food);
    sb.append('}');
    return sb.toString();
  }
}
