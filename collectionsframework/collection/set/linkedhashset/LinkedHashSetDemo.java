// This code is help to understand the concept of the linkedhashset..

package collectionsframework.collection.set.linkedhashset;

// importing the needy packages..
import java.util.*;

// LinkedHashSet is ordered and sorted collection because it use the hashtable and linkedlist for storing the data.

// creating the subcalss for the implementation of the linkedhashset..
class DemoLHS {
    // creating the LinkedHashSet--
    LinkedHashSet<Integer> set = new LinkedHashSet<>();

    // adding the elements in it--
    void addElements() {
        System.out.println("\nAdding elements to the LinkedHashSet: ");
        set.add(10);
        set.add(20);
        set.add(50);
        set.add(40);
        set.add(10);
        System.out.println(set);
    }

    // implement all other method--
    void meth() {
        System.out.println("\nSize of set is : " + set.size());
        // using iterator--
        System.out.println("\nUsing the iterator method : ");
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            int element = iter.next();
            System.out.println("Next element is : " + element);
        }
    }
}

// main method..
public class LinkedHashSetDemo {
    public static void main(String[] args) {

        // initializing the object..
        DemoLHS d = new DemoLHS();
        d.addElements();
        d.meth();
    }
}
