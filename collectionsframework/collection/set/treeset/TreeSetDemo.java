package collectionsframework.collection.set.treeset;

import java.util.*;
// import java.util.Comparator;

class DemoTS {

    TreeSet<Integer> set = new TreeSet<>();

    void add() {
        System.out.println("\nElement added :");
        set.add(10);
        set.add(19);
        set.add(11);
        set.add(140);
        set.add(162);
        set.add(20);
        System.out.println("TreeSet: " + set);
    }

    void meth() {
        System.out.println("\nMethod test : ");
        System.out.println(set.floor(15));
        System.out.println(set.ceiling(15));
        System.out.println(set.lower(15));
        System.out.println(set.higher(15));
        Iterator<Integer> itr = set.descendingIterator();
        System.out.println("Iterate the element in desecnding manner :");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(set.headSet(19, true));
        System.out.println(set.tailSet(19, true));
        System.out.println(set.subSet(10, 20));
    }
}

public class TreeSetDemo {
    public static void main(String[] args) {

        DemoTS t = new DemoTS();
        t.add();
        t.meth();
    }
}
