// describe the list interface demo--

package collectionsframework.collection.list.listinterface;

// importing the basic utility package for implementing the list interface--
import java.util.*;

// declare the class in which we perform the different types of methods--
class ListDemo {
    // we can create the list interface by ArrayList and LlinkedList for
    // implemention of it--
    // -- by using the arrylist --
    List<Integer> mylist1 = new ArrayList<>(); // -- Integer type list --
    // -- by using the linkedlist --
    List<Integer> mylist2 = new LinkedList<>(); // -- String type list --

    void eleAdd() {
        System.out.println("\n--- Adding elements to lists ---");
        mylist1.add(10);
        // mylist1.add(40);
        // mylist1.add(50);
        mylist1.add(20);
        mylist1.add(30);
        mylist1.add(40);
        mylist1.add(50);

        mylist2.add(100);
        mylist2.add(20);
        // mylist2.add(300);
        mylist2.add(400);
        mylist2.add(50);
        // System.out.println("The list is : " + mylist1);
    }

    void sortList() {
        System.out.println("This is the unsorted list : " + mylist1);

        // by using comparator--
        // mylist1.sort(new compareToDescending());
        // System.out.println("This is the sorted list : " + mylist1);

        // without using comparator--
        Collections.sort(mylist1, Collections.reverseOrder());
        System.out.println("This is the sorted list (desc) : " + mylist1);
        Collections.sort(mylist1);
        System.out.println("Default or ascending order : " + mylist1);

        // retain the all elements which are present in another collections--

        // mylist1.retainAll(mylist2);

        // System.out.println(mylist1.retainAll(mylist2));
        System.out.println(mylist1);

        // replaceAll method
        System.out.println("This is replace all method : ");
        int oldValue = 10;
        int newValue = 999;
        mylist1.replaceAll((i) -> i == oldValue ? newValue : i); // if i match the oldvalue then it replace it with the
        // new value else return the i.
        System.out.println(mylist1);

    }

}

class compareToDescending implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i1 - i2;
    }
}

// main method--
public class ListInterfaceDemo {
    public static void main(String[] args) {

        // creating the object--
        ListDemo l = new ListDemo();
        l.eleAdd();
        l.sortList();
    }
}
