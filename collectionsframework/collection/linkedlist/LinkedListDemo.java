// This code is help us to understand the concept and additional method of linkedlist..

package collectionsframework.collection.linkedlist;

import java.util.LinkedList;

class TestLinkedList {
    // Declare the linked list..
    LinkedList<Integer> list = new LinkedList<>();

    // Adding the elements in the linkedlist by using the add method..
    void add() {
        System.out.println("\nAdding the elements : ");
        list.add(20);
        list.add(30);
        list.addFirst(10);
        list.addLast(40);
        System.out.println("The present elements in the linked list : ");
        System.out.println(list);
    }

    // now perform the additional methods on the linkedlist..

    void allAditionalMeth() {
        System.out.println("\nGetting the element by using the element() method : ");
        System.out.println(list.element()); // return the head element but not remove
        System.out.println(list);
        System.out.println("\nGetting the element by using the poll() method : ");
        System.out.println(list.poll()); // returns and removes the head element
        System.out.println(list);
        System.out.println("\nAdding the element by using the offer() method : ");
        System.out.println(list.offer(100));
        System.out.println(list);
        System.out.println("\nUsing the peek() method : ");
        System.out.println(list.peek());
        System.out.println(list);
        System.out.println("\nReversed the list : ");
        System.out.println(list.reversed());
        System.out.println(list);
    }

}

public class LinkedListDemo {
    public static void main(String[] args) {
        TestLinkedList tl = new TestLinkedList();
        tl.add();
        tl.allAditionalMeth();
    }
}
