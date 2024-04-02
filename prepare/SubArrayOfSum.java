package prepare;

import java.util.Arrays;
import java.util.Scanner;

public class SubArrayOfSum {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array : ");
        try (Scanner s = new Scanner(System.in)) {
            int size = s.nextInt();
            System.out.println("Enter the elements of the array : ");
            int arr[] = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("Enter the sum  to be found in subarray : ");
            int sumToFind = s.nextInt();
            printSubarrayWithGivenSum(arr, size, sumToFind);

        }
    }

    // creating the function for the finding the subarray of the array where the sum
    // is matched with the indices...
    static void printSubarrayWithGivenSum(int[] arr, int n, int sum) {
        // A nested loop to get all subarray
        for (int i = 0; i < n - 1; i++) {
            int currentSum = arr[i];
            if (currentSum == sum) {
                System.out.println("Sum find at the indices " + i);
                return;
            } else {
                for (int j = i + 1; j < n; j++) {
                    currentSum += arr[j];
                    if (currentSum == sum) {
                        System.out.println("Sum is finding in between the indices  " + i + " and " + j);
                        return;
                    }
                }
            }
        }
    }
}
