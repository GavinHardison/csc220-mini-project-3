public class LinkedList<T> {
    // instance variables
    private Node head;

    //constructor
    public LinkedList(Node head) {
        this.head = head;
    }

    //methods ...

    public String print_list(){
        Node runner = head;
        String output = "";
        while(runner != null){
            output += runner.data+" ==> ";
            runner = runner.next;
        }
        output += "null";

        return output;
    }

    public int getLength(){
        int length = 0;
        Node runner = head;
        while(runner != null){
            runner = runner.next;
            length++;
        }
        return length;

    }

    public boolean addToFront(T someValue){
        boolean okay = false;
        Node<T> nodeToAdd = new Node<>(someValue, null);

        nodeToAdd.next = head;
        head = nodeToAdd;
        okay = true;

        return okay;

    }

    public void reverse(){
        // Your code goes here



    }


}
