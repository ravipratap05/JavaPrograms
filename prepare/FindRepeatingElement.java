package prepare;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class FindRepeatingElement {
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
            System.out.println("Repeating elements are: ");
            printRepeatingElements(arr);
        }
    }

    public static void printRepeatingElements(int[] arr) {
        int[] duplicateArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {

                    duplicateArr[i] = arr[i];
                }

            }

        }
        int[] newArr = new int[duplicateArr.length];
        newArr = duplicateArr;
        Arrays.sort(newArr);
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : newArr) {
            set.add(integer);

        }
        set.remove(0);
        System.out.println(set.toString());

    }
}
