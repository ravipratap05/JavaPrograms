package collectionsframework.collection.list.arraylist;

import java.util.ArrayList;

// import javax.swing.text.html.HTMLDocument.Iterator;

class AllMethods extends Remove {
    ArrayList<Integer> myarr = new ArrayList<>();
    // Object collect = new ArrayList<>();

    void addElements() {
        System.out.println("\nAdding Elements in New ArrayList using add() method...");
        myarr.add(10);
        myarr.add(11);
        myarr.add(12);
        myarr.add(13);
        myarr.add(14);
        myarr.add(15);
        myarr.add(11);
        myarr.add(13);
        System.out.println("\nElements of New ArrayList are : ");
        System.out.println(myarr);
    }

    void allmeth() {
        // Calculating the size of the given ArrayList..
        int size = myarr.size();
        System.out.println("Size of the array list is: " + size);

        // Using the clear() method for removing all the present elements..
        System.out.println("\n Using the clear() method : ");
        myarr.clear();
        System.out.println(myarr);
        addElements();

        // Using the clone() method for Returns a shallow copy of this ArrayList
        // instance.
        System.out.println("\nUsing the clone() method : ");
        // collect = myarr.clone();
        System.out.println(myarr.clone());

        // Check the element exist in the ArrayList..
        System.out.println("\nChecking the particular elements : ");
        if (myarr.contains(11)) {
            System.out.println("Yes! It is an element of the given ArrayList.\n");
        } else {
            System.out.println("No! This element is not found in the ArrayList.\n");
        }

        // Getting the elements of ArrayLists..
        System.out.println("\nElement getting from specific index by using the get() method : ");
        int a = myarr.get(2);
        System.out.println("Element at the index 2 is : " + a);
        System.out.println("Element getting at the first and the at last of the ArrayList :");
        System.out.println("First Element is :" + myarr.getFirst());
        System.out.println("Last Element is :" + myarr.getLast());

        // Setting the value of element of ArrayList..
        System.out.println("\nSetting the value of element using set() method : ");
        System.out.println("Before modification : ");
        System.out.println(myarr);
        myarr.set(3, 40);
        System.out.println("After modification : ");
        System.out.println(myarr); // at index 3 value 13 replace with 40

        // Using the indexOf() method--> return the index of that element whose match
        // first..
        System.out.println("\nUsing the indexOf() method : ");
        int b = myarr.indexOf(15);
        System.out.println("The index of element whose value is 15 : " + b);
        // Using the lastIndexOf() method--> return the index of that element whose
        // match
        // last..
        System.out.println("\nUsing the lastIndexOf() method : ");
        int c = myarr.lastIndexOf(11);
        System.out.println("The index of element whose value is 11 : " + c);

        // checking the ArrayList is empty or not..
        System.out.println("\nChecking the ArrayList is empty or not : ");
        if (myarr.isEmpty()) {
            System.out.println("This ArrayList is Empty.");
        } else {
            System.out.println("This ArrayList is Not Empty.");
        }

        // Making the ArrayList to sublist..
        System.out.println("\nSublist of the given list : ");
        System.out.println(myarr.subList(3, 7));

        // Using the equals() method..
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(98);
        arr2.add(65);
        arr2.add(89);
        System.out.println("\nComparing two ArrayLists are equal or not : ");
        boolean d = myarr.equals(arr2);
        if (d == true) {
            System.out.println("Both ArrayLists are Equal.");
        } else {
            System.out.println("Both ArrayLists are Not Equal.");
        }

        // Using the hascode() method for converting the hashcode of given list..
        System.out.println("\nConverting the HashCode of the List : ");
        int e = myarr.hashCode();
        System.out.println("Hash Code of the List : " + e);
    }

    public class ArrayListAllMethod {
        public static void main(String[] args) {
            AllMethods am = new AllMethods();
            am.addElements();
            am.allmeth();

        }

    }
}