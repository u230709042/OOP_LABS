package lab13.generics;

import java.util.List;

public interface Stack<T> {
  void push(T item);
  T pop();
  boolean empty();
  List<T> toList();
  void addAll(Stack<? extends T> aStack);
}