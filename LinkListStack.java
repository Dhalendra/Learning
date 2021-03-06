package dc.learn.Stack;


public class LinkListStack<T> {

    private final LinkList<T> linkedList = new LinkList<T>();

    public void push(T data) {
        linkedList.addFirst(data);
    }

    public T pop() {
        return linkedList.removeFirst();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
      
}



