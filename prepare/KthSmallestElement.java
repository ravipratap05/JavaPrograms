package prepare;

// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.List;
import java.util.Scanner;

public class KthSmallestElement {
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
            // taking input for finding desireable element...
            System.out.println("Enter the Kth number : ");

            int k = s.nextInt();
            System.out.println("The " + k + " smallest element is " + kthSmallEle(arr, k));
        }

    }

    // create the function for Kth smallest elements...
    static int kthSmallEle(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

}
