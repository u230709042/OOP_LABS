package lab6;

public class Main {
  public static void main(String[] args) {
    Point center1 = new Point(0, 0);
    Circle circle1 = new Circle(5, center1);

    Point center2 = new Point(8, 0);
    Circle circle2 = new Circle(4, center2);

    System.out.println("Circle 1 Area: " + circle1.area());
    System.out.println("Circle 1 Perimeter: " + circle1.perimeter());

    System.out.println("Circle 2 Area: " + circle2.area());
    System.out.println("Circle 2 Perimeter: " + circle2.perimeter());

    if (circle1.intersect(circle2)) {
      System.out.println("Circles intersect");
    } else {
      System.out.println("Circles do not intersect");
    }
  }
}