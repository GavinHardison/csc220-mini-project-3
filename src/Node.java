public class Node<T> {
    // instance variables
    T data;
    Node next;

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
