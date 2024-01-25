// This is a demo code to understand the logic of the ListIterator interface==

package collectionsframework.collection.list.listinterface;

// Importing the needed packages--
import java.util.*;

// Creating the subclass for implementation of the list operator method with the different operations--
class TestListInterator {
    public void testIterator() {
        // creating the list (arraylist or linkedlist)--
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Adding elements in arraylist:");
        arr.add(10);
        arr.add(23);
        arr.add(45);
        System.out.println(arr);

        // for intializing the listiterator using basic generic syntax--
        ListIterator<Integer> iterator = arr.listIterator();

        System.out.println("\nUsing HasNext Method:\n");
        while (iterator.hasNext()) {
            // using the next() method--
            System.out.println("The next element is : " + iterator.next());
            // System.out.println("The next index is : " + iterator.nextIndex());

        }
        System.out.println("When we use the set method : ");
        iterator.set(1022);
        System.out.println(arr);
        iterator.remove();
        System.out.println(arr);

        // use of listIterator via it's object--

        // using add() method--
        // System.out.println("\nUsing Add Method:\n");
        // iterator.add(100);
        // System.out.println(arr);

        // using hasNext() method--

        // using the hasPrevious() method--
        // while (iterator.hasPrevious()) {
        // System.out.println("The previous element is : " + iterator.previous());
        // System.out.println("The previous index is : " + iterator.previousIndex());
    }

}

// Main method--
public class ListIteratorInterfaceDemo {
    public static void main(String[] args) {

        // creating object of subclass--
        TestListInterator obj = new TestListInterator();
        obj.testIterator();
    }
}
