package Zadanie3;

public class ExapmleOfUsage {

  public static void checkArea(Figure figure) {

    System.out.println(figure.getArea());
  }

  public static void main(String[] args) {

    checkArea(new Rectangle(5,4));
    checkArea(new Square(5));
  }
}