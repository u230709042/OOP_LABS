package lab10.shapes2d;

public class Circle {
  protected double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public double area() {
    return Math.PI * radius * radius;
  }

  @Override
  public String toString() {
    return "Circle{" +
      "radius=" + radius +
      '}';
  }
}