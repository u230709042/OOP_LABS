package lab6;

public class Point {
  private int xCoord;
  private int yCoord;

  public Point(int xCoord, int yCoord) {
    this.xCoord = xCoord;
    this.yCoord = yCoord;
  }

  public int getXCoord() {
    return xCoord;
  }

  public void setXCoord(int xCoord) {
    this.xCoord = xCoord;
  }

  public int getYCoord() {
    return yCoord;
  }

  public void setYCoord(int yCoord) {
    this.yCoord = yCoord;
  }

  public double distanceTo(Point point) {
    return Math.sqrt(Math.pow(getXCoord() - point.getXCoord(), 2) + Math.pow(getYCoord() - point.getYCoord(), 2));
  }
}