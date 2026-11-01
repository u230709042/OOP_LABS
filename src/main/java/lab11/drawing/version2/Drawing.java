package lab11.drawing.version2;



import java.util.ArrayList;

import lab11.shapes.Circle;
import lab11.shapes.Rectangle;
import lab11.shapes.Square;

public class Drawing {

  private ArrayList<Object> shapes = new ArrayList<>();

  public double calculateTotalArea() {
    double totalArea = 0;

    for (Object shape : shapes) {
      if (shape instanceof Circle) {
        totalArea += ((Circle) shape).area();
      } else if (shape instanceof Rectangle) {
        totalArea += ((Rectangle) shape).area();
      } else if (shape instanceof Square) {
        totalArea += ((Square) shape).area();
      }
    }

    return totalArea;
  }

  public void addShape(Object s) {
    shapes.add(s);
  }
}