public class Main {
    public static void main(String[] args) {

        Node<Integer> n5 = new Node<>(5, null);
        Node<Integer> n4 = new Node<>(4, n5);
        Node<Integer> n3 = new Node<>(3, n4);
        Node<Integer> n2 = new Node<>(2, n3);
        Node<Integer> n1 = new Node<>(1, n2);

        LinkedList<Integer> list = new LinkedList<>(n1);

        System.out.println("Before: " + list.print_list());
        list.reverse();
        System.out.println("After:  " + list.print_list());
    }
}
