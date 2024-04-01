package prepare;

import java.util.Arrays;
import java.util.Scanner;

public class OccurrencesOfInteger {
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
            System.out.println("Enter the element for finding the occurances : ");
            int num = s.nextInt();
            // int n = arr.length
            int count = 0;
            for (int j : arr) {
                if (j == num) {
                    count++;
                }
            }
            System.out.println("The number " + num + " occurs " + count + " times in the array.");
        } catch (Exception e) {
            System.out.println("Error occurred while taking input from user!");
        }
    }
}
