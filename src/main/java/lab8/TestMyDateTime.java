package lab8;

public class TestMyDateTime {
  public static void main(String[] args) {
    MyTime time = new MyTime(15, 30);
    MyDate date = new MyDate(28, 2, 2017);

    MyDateTime dateTime = new MyDateTime(date, time);
    String strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.incrementDay();
    strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.incrementHour();
    strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.incrementHour(32);
    strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.decrementHour(49);
    strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.incrementMinute(90);
    strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.decrementMinute(30);
    strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.incrementYear(3);
    strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.decrementDay();
    strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.decrementYear();
    strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.decrementMonth();
    strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.incrementDay(3);
    strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.decrementMonth(2);
    strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.decrementDay(30);
    strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.incrementMonth(16);
    strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.decrementYear(4);
    strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.incrementMonth();
    strRep = dateTime.toString();
    System.out.println(strRep);

    dateTime.incrementYear();
    strRep = dateTime.toString();
    System.out.println(strRep);

    MyDateTime anotherDateTime = new MyDateTime(new MyDate(29, 3, 2017), new MyTime(15, 30));

    boolean before = dateTime.isBefore(anotherDateTime);
    System.out.println(dateTime.toString()+ " is before " + anotherDateTime.toString()+ " = " + before);

    boolean after = dateTime.isAfter(anotherDateTime);
    System.out.println(dateTime.toString()+ " is after " + anotherDateTime.toString()+ " = " + after);

    String dayTimeDiff = dateTime.dayTimeDifference(anotherDateTime);
    System.out.print("Day time difference between " + dateTime.toString()+ " and " + anotherDateTime.toString()+ " is " + dayTimeDiff);

    anotherDateTime.incrementMinute(4850);
    strRep = anotherDateTime.toString();
    System.out.println(strRep);

    dayTimeDiff = dateTime.dayTimeDifference(anotherDateTime);
    System.out.print("Day time difference between " + dateTime.toString()+ " and " + anotherDateTime.toString()+ " is " + dayTimeDiff);
  }
}