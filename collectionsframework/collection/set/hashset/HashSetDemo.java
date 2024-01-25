// This code help to understand the implementation or the operation of HashSet..

package collectionsframework.collection.set.hashset;

// Importing the needy packages..
import java.util.*;

// HashSet- a collection which is used to hashtable for storing the data and store the the unique element only.

// creating the subclass for implementing the operation of hashset..
class DemoHS {
    // creating the hashset--
    HashSet<Integer> set = new HashSet<>(); // return an empty hashset.
    // HashSet<Integer> set = new HashSet<>(int capacity);
    // HashSet<Integer> set = new HashSet<>(int capacity, float loadfactor);
    // HashSet<Integer> set = new HashSet<>(collection c);

    // methods are same as arraylist--
    void ele() {
        System.out.println("\nAdding the elements :");
        set.add(101); // adding element in the hashset.
        set.add(202);
        set.add(303);
        set.add(101); // duplicate value discarded.
        System.out.println(set);
    }

    void meth() {
        System.out.println("\nUsing the iterator :");
        Iterator<Integer> itr = set.iterator(); // getting the object of the iterator for iterate the set.
        while (itr.hasNext()) {
            System.out.println("\nNext Element is : " + itr.next());
        }

        System.out.println("\nSize of the set : " + set.size());
    }
}

// main method..
public class HashSetDemo {
    public static void main(String[] args) {

        // initializing the object
        DemoHS dm = new DemoHS();
        dm.ele();
        dm.meth();
    }
}
