package prepare;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReversedArray {
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

            // reverse this array by using the built in function

            List<Integer> newArr = arr.reversed();
            System.out.println("The reversed array is : " + newArr);
        }
    }
}
