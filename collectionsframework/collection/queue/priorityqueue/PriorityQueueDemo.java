package collectionsframework.collection.queue.priorityqueue;

import java.util.*;

class DemoPQ {
    Queue<Integer> pq = new PriorityQueue<>();

    void add() {
        // Adding elements to the queue
        System.out.println("\nAdding the elements in the queue : ");
        pq.add(100);
        pq.add(101);
        pq.add(102);
        pq.add(103);
        System.out.println(pq);

        // implementation other methods...
        System.out.println(pq.offer(107));
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.element());
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
    }

    PriorityQueue<Integer> pq1 = new PriorityQueue<>();

    void add1() {
        // Adding elements to the queue
        System.out.println("\nAdding the elements in the priority queue : ");
        pq1.add(100);
        pq1.add(101);
        pq1.add(102);
        pq1.add(103);
        System.out.println(pq);

        // implementation other methods...
        System.out.println(pq1.offer(107));
        System.out.println(pq1);
        System.out.println(pq1.remove());
        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println(pq1.element());
        System.out.println(pq1);
        System.out.println(pq1.peek());
        System.out.println(pq1);
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {

        DemoPQ p = new DemoPQ();
        p.add();
        p.add1();
    }
}
