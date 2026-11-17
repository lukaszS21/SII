package Zadanie3;

public class Square extends Figure {

 private int side;

 Square(int side) {
    this.side = side;
  }
  @Override
  public int getArea() {
    return side* side;
  }
}
 