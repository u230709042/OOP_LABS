package lab11.shapes;



public class Square extends Shape {
  protected double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public double area() {
    return side * side;
  }
}