// In this code discussing about the arraylist remove or clear method..

package collectionsframework.collection.arraylist;

import java.util.ArrayList;

class Remove extends Testing {
    ArrayList<Integer> newarr = new ArrayList<>();
    ArrayList<Integer> collect = new ArrayList<>();

    void addElements() {
        System.out.println("\nAdding Elements in New ArrayList using add() method...");
        newarr.add(10);
        newarr.add(11);
        newarr.add(12);
        newarr.add(13);
        newarr.add(14);
        newarr.add(15);
        System.out.println("\nElements of New ArrayList are : ");
        System.out.println(newarr);

    }

    void collectionElements() {
        System.out.println("\nAdding Elements in a custom collection using add() method...");
        collect.add(100);
        collect.add(110);
        collect.add(120);
        collect.add(130);
        collect.add(140);
        collect.add(150);
        System.out.println("\nElements of collection are : ");
        System.out.println(collect);
    }

    void removeElements() {
        System.out.println("\nRemoving Elements from the ArrayList at zeroth index : ");
        newarr.remove(0);
        System.out.println(newarr);
        System.out.println("\nAdding all collection element in the newarr : ");
        newarr.addAll(collect);
        // System.out.println("\nRemoving the specific Element based upon the element's
        // value : ");
        // newarr.remove("ram"); //it deleted the object only if we pass number as
        // object it take that as integer
        System.out.println(newarr);
        System.out.println("\nUsing the removeFirst() method for removing : ");
        newarr.removeFirst();
        System.out.println(newarr);
        System.out.println("\nUsing the removeLast() method for removing : ");
        newarr.removeLast();
        System.out.println(newarr);
        System.out.println("\nUsing the removeAll() method for removing : ");
        newarr.removeAll(collect);
        System.out.println(newarr);

    }
}

public class ArrayListRemoveMethod {
    public static void main(String[] args) {
        Remove r = new Remove();
        r.addElements();
        r.collectionElements();
        r.removeElements();
    }

}
