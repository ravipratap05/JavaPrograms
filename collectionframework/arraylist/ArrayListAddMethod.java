// This code will help you to understand the concepts of Arraylist..
// Basically ArrayList extends AbstractList implements List.

package collectionframework.arraylist;

import java.util.ArrayList;
// import java.lang.Thread;

class Testing {
    // declaration syntax of ArrayList:
    ArrayList<Integer> arr = new ArrayList<>(); // build an empty array list..

    // ArrayList<Integer> arr = new ArrayList<>(int capacity); // build the array-
    // list with specified initialized capacity..

    // ArrayList<Integer> arr = new ArrayList<>(collecion<? extends objects> c); //
    // build the arraylist with the collection objects which parse by the iterator
    // from the collection..

    // Methods of the ArrayList class

    // Adding the elements in the ArrayList
    void addElements() {
        System.out.println("Adding Elements using add() method...");
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
    }

    void printElements() {
        System.out.println("Printing Elements...");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + "  "); // printing the elements through for each loop..
            // System.out.println(i + " ");at index
        }
    }

    // Adding more elements in above ArrayList..
    void addMoreElements() {
        System.out.println("\nAdding More Elements to existing ArrayList...");
        // Add in the start or zeroth index..
        System.out.println("\nAdding the Element at the zeroth index : ");
        arr.add(0, 100);
        printElements();

        // Add in the between on random index..
        System.out.println("\nAdding the Element in the between at random index : ");
        arr.add(2, 200);
        printElements();

        // Add at the end of existing Arraylist or default add..
        System.out.println("\nAdding the Element at the end : ");
        arr.add(300);
        printElements();
    }

    void addElementsFromCollection() {
        System.out.println("Adding the Elements from the collections : ");
        // Creating first collection
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(1);
        number1.add(2);
        number1.add(3);
        number1.add(4);

        // Creating second collection
        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(11);
        number2.add(22);
        number2.add(33);
        number2.add(44);

        // Adding both list elements using the addall() method..
        number1.addAll(number2); // it is a boolean return type method so it return true
        System.out.println(number1);
        // we can add collection with another collection with the addAll() method for
        // specified index

    }

}

// Main class..
public class ArrayListAddMethod {
    public static void main(String[] args) {

        // Creating the object of the Testing class for performing the operations
        Testing obj = new Testing();

        obj.addElements(); // This line invoke the functionality of adding the
        // elements..
        obj.printElements(); // This line show all the elements of the ArrayList..
        obj.addMoreElements();
        obj.addElementsFromCollection();
    }

}
