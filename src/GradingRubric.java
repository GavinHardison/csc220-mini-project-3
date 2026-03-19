public class GradingRubric {

    public static void main(String[] args) {
        int totalPoints = 0;

        // Test Case 1: Reverse an Empty Linked List
        LinkedList<Integer> list1 = new LinkedList<>(null);
        list1.reverse();
        if (list1.getLength() == 0) {
            System.out.println("Test 1 Passed");
            totalPoints += 20;
        } else {
            System.out.println("Test 1 Failed");
        }

        // Test Case 2: Reverse a Single-Node Linked List
        LinkedList<Integer> list2 = new LinkedList<>(new Node<>(10, null));
        list2.reverse();
        if (list2.getLength() == 1 && list2.print_list().equals("10 ==> null")) {
            System.out.println("Test 2 Passed");
            totalPoints += 20;
        } else {
            System.out.println("Test 2 Failed");
        }

        // Test Case 3: Reverse a Two-Node Linked List
        Node<Integer> second = new Node<>(20, null);
        Node<Integer> first = new Node<>(10, second);
        LinkedList<Integer> list3 = new LinkedList<>(first);
        list3.reverse();
        if (list3.print_list().equals("20 ==> 10 ==> null")) {
            System.out.println("Test 3 Passed");
            totalPoints += 20;
        } else {
            System.out.println("Test 3 Failed");
        }

        // Test Case 4: Reverse a Multi-Node Linked List
        Node<Integer> third = new Node<>(30, null);
        Node<Integer> secondMulti = new Node<>(20, third);
        Node<Integer> firstMulti = new Node<>(10, secondMulti);
        LinkedList<Integer> list4 = new LinkedList<>(firstMulti);
        list4.reverse();
        if (list4.print_list().equals("30 ==> 20 ==> 10 ==> null")) {
            System.out.println("Test 4 Passed");
            totalPoints += 20;
        } else {
            System.out.println("Test 4 Failed");
        }

        // Test Case 5: Verify List Integrity After Multiple Reversals
        Node<Integer> secondReversal = new Node<>(20, null);
        Node<Integer> firstReversal = new Node<>(10, secondReversal);
        LinkedList<Integer> list5 = new LinkedList<>(firstReversal);
        list5.reverse();
        list5.reverse(); // Reverse again to restore original order
        if (list5.print_list().equals("10 ==> 20 ==> null")) {
            System.out.println("Test 5 Passed");
            totalPoints += 20;
        } else {
            System.out.println("Test 5 Failed");
        }

        // Display the total score
        System.out.println("Total Points: " + totalPoints + "/100");
    }
}
