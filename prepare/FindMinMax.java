package prepare;

import java.util.*;

public class FindMinMax {
    public static void main(String[] args) {
        System.out.println("Enter the size of array : ");
        try (Scanner s = new Scanner(System.in)) {
            int size = s.nextInt();
            System.out.println("Entering the elements : ");
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                arr.add(i, s.nextInt());
            }
            System.out.println(arr);
            // sorting the array for finding the minimum and maximum value of the elements
            // of the array...
            System.out.println("Now sorting the array in asending order : ");
            Collections.sort(arr);
            System.out.println(arr);
            // displaying the minumum and maximum values
            System.out.println("The mimimum element of this array is " + arr.getFirst()
                    + " and maximum element of this array is " + arr.getLast());
        }
    }
}
