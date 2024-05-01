package prepare;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the array elements: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            removeDuplicate(arr);
        }

    }

    // Function for removing the duplicates from an array
    public static void removeDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        System.out.println(set);
    }
}
