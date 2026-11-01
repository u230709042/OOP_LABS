package lab13.generics;



import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> implements Stack<T> {
  private StackItem<T> top = null;

  @Override
  public void push(T item) {
    StackItem<T> newItem = new StackItem<>(item);
    newItem.setNext(top);
    top = newItem;
  }

  @Override
  public T pop() {
    if (empty()) {
      return null;
    }
    T item = top.getItem();
    top = top.getNext();
    return item;
  }

  @Override
  public boolean empty() {
    return top == null;
  }

  @Override
  public List<T> toList() {
    List<T> list = new ArrayList<>();
    StackItem<T> current = top;
    while (current != null) {
      list.add(current.getItem());
      current = current.getNext();
    }
    return list;
  }

  @Override
  public void addAll(Stack<? extends T> aStack) {
    List<? extends T> items = aStack.toList();
    for (int i = items.size() - 1; i >= 0; i--) {
      push(items.get(i));
    }
  }
}