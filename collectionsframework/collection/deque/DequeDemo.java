package collectionsframework.collection.deque;

import java.util.*;

class Demo {
    Deque<Integer> dq = new ArrayDeque<>();

    void meth() {
        System.out.println("\nElements in deque : ");
        dq.add(11);
        dq.add(12);
        dq.add(22);
        dq.add(23);
        dq.add(56);
        System.out.println(dq);

        System.out.println("\nUsing the iterator method : \n");
        Iterator<Integer> itr = dq.iterator();
        while (itr.hasNext()) {
            System.out.println("Next element is : " + itr.next());
        }
    }
}

public class DequeDemo {
    public static void main(String[] args) {

        Demo d = new Demo();
        d.meth();
    }

}
