package lab10.shapes3d;



public class TestShapes {
  public static void main(String[] args) {
    Cylinder cy = new Cylinder(5, 6);
    System.out.println(cy);
    System.out.println("Cylinder volume: " + cy.volume());

    Cube cu = new Cube(7);
    System.out.println(cu);
    System.out.println("Cube volume: " + cu.volume());
  }
}