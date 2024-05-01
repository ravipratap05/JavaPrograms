package prepare;

import java.util.Arrays;
import java.util.Scanner;

public class FindNonRepeatingElement {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            System.out.println("Enter the elements of the array: ");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();

            }
            System.out.println(Arrays.toString(arr));
            System.out.println("The non-repeating elements are: ");
            printNonRepeatingElements(arr);
        }

    }

    public static void printNonRepeatingElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isPresent = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isPresent = true;
                    break;

                }

            }
            if (!isPresent) {
                System.out.println(arr[i] + " ");
            }

        }
    }
}
