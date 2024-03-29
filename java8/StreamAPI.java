// This is useful document about java 8 features...

package java8;

// importing the useful packages...
import java.util.*;
import java.util.stream.*;

// class Examples {
//     // creating the integer stream by using the of method...
//     Stream<Integer> streams = Stream.of(1, 2, 3, 4, 5);
//     Stream<Integer> number = Stream.of(22, 33, 24, 1, 4, 2, 90, 45);
//     // creating the string stream by using the of method...
//     Stream<String> stringStreams = Stream.of("Hello", "World", "Java", "Programming");

//     void printAllElements() {
//         streams.forEach(System.out::println);
//         stringStreams.forEach(System.out::println);
//     }

//     void usingMap() {
//         streams.map(number -> number * number).forEach(System.out::println);
//         // System.out.println(list);
//     }

//     void usingFilter() {
//         List<String> newList = Arrays.asList("Hello", "World", "Java", "Programming");
//         int counts = (int) newList.stream().filter(n -> n.length() == 4).count();
//         System.out.println("The count where string length is equals to 4 : " + counts);
//     }

//     void usingCollect() {
//         List<String> newList1 = Arrays.asList("Hello", "", "World", "", "Java", "Programming", "");

//         List<String> filteredListOfString = newList1.stream().filter(n -> !n.isEmpty()).collect(Collectors.toList());
//         System.out.println("\nThe filteres list where string are not empty : " + filteredListOfString);

//         String mergedListOfString = newList1.stream().filter(n -> !n.isEmpty()).collect(Collectors.joining(" & "));
//         System.out.println("\nThe merger list of the strings with & is : " + mergedListOfString);

//         int count = (int) newList1.stream().filter(n -> n.isEmpty()).count();
//         System.out.println("\nThe count of blank or empty strings are : " + count);
//     }

//     void usingSorted() {

//         List<Integer> result = number.sorted().collect(Collectors.toList());
//         System.out.println(result);

//         // learn how to convert this resultant stream in to the list
//     }

//     void usingMinMax() {
//         Optional<Integer> minNumber = streams.min((n1, n2) -> n1.compareTo(n2));
//         System.out.println("The minimum number in the above stream : " + minNumber.get());

//         Optional<Integer> maxNumber = number.max((n1, n2) -> n1.compareTo(n2));
//         System.out.println("The maximum number in the above stream : " + maxNumber.get());
//     }
// }

public class StreamAPI {
    public static void main(String[] args) {
        // Examples e = new Examples();
        // e.printAllElements();

        // e.usingMap();

        // e.usingFilter();

        // e.usingCollect();

        // e.usingSorted();

        // e.usingMinMax();

        List<Integer> myList = Arrays.asList(1, 2, 34, 25, 8, 34, 23, 11, 18, 22, 38, 61, 9, 15);
        List<Integer> filteredList = myList.stream()
                .filter(x -> x % 2 == 0)
                .distinct()
                .map(x -> x * 2)
                .peek(System.out::println)
                .sorted((a, b) -> (b - a))
                .collect(Collectors.toList());

        System.out.println(filteredList);

        Optional<Integer> minimum = filteredList.stream().min((a, b) -> a.compareTo(b));
        System.out.println(minimum);
        Optional<Integer> maximum = filteredList.stream().max((a, b) -> a.compareTo(b));
        System.out.println(maximum);

    }
}
