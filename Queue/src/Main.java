import java.util.NoSuchElementException;

class Queue<T> {
    class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    Node<T> first;
    Node<T> last;

    public void add(T item) {
        // 새로운 객체을 만들고, 새로운 객체의 next의 변수을 만들고 할당함
        Node<T> t = new Node<>(item); // 2 입력

        // last에 값이 있을때
        if(last != null) { // last 1 입력
            last.next = t; // 2 할당
        }

        // last에 값이 없을때
        last = t; // 2 할당

        // fist에 값이 없다면, last의 값을 first로 할당함
        if(first == null) {
            first = last; // 2 할당
        }
    }

    public T remove() {
        if(first == null) {
            throw new NoSuchElementException();
        }
        T data = first.data; // retuen할 데이터을 저장함
        first = first.next; // 할당 받은 적이 없어 null

        if(first == null) {
            last = null; // first에 값이 없다면, last가 null이 되어야함
        }
        return data;
    }

    public T peek() {
        if(first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}


public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
    }
}