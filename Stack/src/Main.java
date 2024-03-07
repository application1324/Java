import java.util.EmptyStackException;
class Stack<T> {
    class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> top;

        public Node(T data) {
            this.data = data;
        }

        public T pop() {
            if( top == null ) {
                throw new  EmptyStackException();
            }
            T item = top.data;
            top = top.next;
            return item;
        }

        public void push(T item) {
            Node<T> t = new Node<>(item);
            t.next = top;
            top = t;
        }

        public T peek() {
            if( top == null ) {
                throw new  EmptyStackException();
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }
}

public class Main {
    public static void main(String[] args) {

    }
}