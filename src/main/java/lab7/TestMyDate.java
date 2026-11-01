package lab7;

public class TestMyDate {
  public static void main(String[] args) {
    MyDate date = new MyDate(28, 2, 2017);

    String strRep = date.toString();
    System.out.println(strRep);

    date.incrementDay();
    System.out.println(date.toString());

    date.incrementYear(3);
    System.out.println(date.toString());

    date.decrementDay();
    System.out.println(date.toString());

    date.decrementYear();
    System.out.println(date.toString());

    date.decrementMonth();
    System.out.println(date.toString());

    date.incrementDay(3);
    System.out.println(date.toString());

    date.decrementMonth(2);
    System.out.println(date.toString());

    date.decrementDay(30);
    System.out.println(date.toString());

    date.incrementMonth(16);
    System.out.println(date.toString());

    date.decrementYear(4);
    System.out.println(date.toString());

    date.incrementMonth();
    System.out.println(date.toString());

    date.incrementYear();
    System.out.println(date.toString());

    MyDate anotherDate = new MyDate(12, 2, 2013);

    boolean before = date.isBefore(anotherDate);
    System.out.println(date.toString() + " is before " + anotherDate.toString() + " : " + before);

    boolean after = date.isAfter(anotherDate);
    System.out.println(date.toString() + " is after " + anotherDate.toString() + " : " + after);

    int dayDiff = date.dayDifference(anotherDate);
    System.out.println("Day difference between " + date.toString() + " and " + anotherDate.toString() + " is " + dayDiff);
  }
}