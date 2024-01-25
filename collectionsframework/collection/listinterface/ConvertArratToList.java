package collectionsframework.collection.listinterface;

import java.util.*;

// converting the array into the list by using list interface--
/*
 * first create any array or take any array--
 * now this array convert in to the string for the iterate the all values--
 * then a list is created--
 * adding all string elements by using for loop into the list by using add() method--
 */

public class ConvertArratToList {
    public static void main(String[] args) {
        String[] array = { "Java", "Python", "C" };
        System.out.println("Print Array : " + Arrays.toString(array));
        List<String> list = new ArrayList<>();
        for (String e : array) {
            list.add(e);
        }
        System.out.println("The list is : " + list);
    }
}
