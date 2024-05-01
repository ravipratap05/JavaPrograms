package prepare;

import java.util.Arrays;

import java.util.Scanner;

public class PushAllZeroAtTheEnd {
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
            System.out.println("Now pushing the all zero in the end of the array: ");
            pushZero(arr);
            System.out.println(Arrays.toString(arr));

        }
    }

    static void pushZero(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];

            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }
}
