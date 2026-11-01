package lab10.shapes3d;



import lab10.shapes2d.Square;

public class Cube extends Square {

  public Cube(double side) {
    super(side);
  }

  @Override
  public double area() {
    return 6 * super.area();
  }

  public double volume() {
    return side * super.area();
  }

  @Override
  public String toString() {
    return "Cube{" +
      "side=" + side +
      '}';
  }
}