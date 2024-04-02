package prepare;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray012 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array : ");
        try (Scanner s = new Scanner(System.in)) {
            int size = s.nextInt();
            int[] arr = new int[size];
            System.out.println("Entering the elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println("Sorted array is " + Arrays.toString(arr));

        }
    }
}
