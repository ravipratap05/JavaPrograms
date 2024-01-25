package collectionsframework.collection.list.arraylist;

import java.util.*;

class Testing1 {
    ArrayList<Integer> thisArr = new ArrayList<>();

    void add() {
        System.out.println("\nAdd Elements : ");
        thisArr.add(10);
        thisArr.add(12);
        thisArr.add(14);
        thisArr.add(16);
        thisArr.add(18);
        System.out.println(thisArr);
    }

    void iterate() {
        System.out.println("\nThis way we use the iterator :");
        Iterator<Integer> iterator = thisArr.iterator();
        while (iterator.hasNext()) {
            System.out.println("The value of next element is : " + iterator.next());
        }

    }
}

public class TesingIterator {
    public static void main(String[] args) {
        Testing1 t1 = new Testing1();
        t1.add();
        t1.iterate();
    }
}
