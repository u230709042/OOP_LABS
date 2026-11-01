package lab13.demo;



import lab13.generics.*;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> s1 = new StackImpl<>();
    s1.push("A");
    s1.push("B");

    Stack<String> s2 = new StackArrayImpl<>();
    s2.push("X");
    s2.push("Y");

    s1.addAll(s2); // Y, X, B, A

    while (!s1.empty()) {
      System.out.println(s1.pop());
    }

    System.out.println("---");

    Stack<Object> objStack = new StackArrayImpl<>();
    objStack.push(100);
    objStack.push(3.14);

    Stack<String> strStack = new StackImpl<>();
    strStack.push("Hello");
    strStack.push("World");

    objStack.addAll(strStack);

    while (!objStack.empty()) {
      System.out.println(objStack.pop());
    }
  }
}