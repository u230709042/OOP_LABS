package lab13.generics;



import java.util.ArrayList;
import java.util.List;

public class StackArrayImpl<T> implements Stack<T> {
  private final List<T> stack = new ArrayList<>();

  @Override
  public void push(T item) {
    stack.add(0, item);
  }

  @Override
  public T pop() {
    return stack.remove(0);
  }

  @Override
  public boolean empty() {
    return stack.isEmpty();
  }

  @Override
  public List<T> toList() {
    return new ArrayList<>(stack);
  }

  @Override
  public void addAll(Stack<? extends T> aStack) {
    List<? extends T> items = aStack.toList();
    for (int i = items.size() - 1; i >= 0; i--) {
      push(items.get(i));
    }
  }
}