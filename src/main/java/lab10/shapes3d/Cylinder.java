package lab10.shapes3d;


import lab10.shapes2d.Circle;

public class Cylinder extends Circle {

  private double height;

  public Cylinder() {
    super(1);
    height = 1;
  }

  public Cylinder(double radius, double height) {
    super(radius);
    this.height = height;
  }

  @Override
  public double area() {
    return 2 * super.area() + height * 2 * Math.PI * radius;
  }

  public double volume() {
    return super.area() * height;
  }

  @Override
  public String toString() {
    return "Cylinder{" +
      "height=" + height +
      ", radius=" + radius +
      '}';
  }
}