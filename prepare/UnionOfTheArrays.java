package prepare;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class UnionOfTheArrays {
    public static void main(String[] args) {
        // initializing the first array
        System.out.println("Enter the size of the first array :");
        try (Scanner s = new Scanner(System.in)) {
            int size1 = s.nextInt();
            int arr1[] = new int[size1];
            System.out.println("Enter elements of the first array :");
            for (int i = 0; i < size1; i++) {
                arr1[i] = s.nextInt();
            }
            System.out.println(Arrays.toString(arr1));

            // initializing the second array
            System.out.println("Enter the size of the second array :");
            int size2 = s.nextInt();
            int arr2[] = new int[size2];
            System.out.println("Enter elements of the second array :");
            for (int j = 0; j < size2; j++) {
                arr2[j] = s.nextInt();
            }
            System.out.println(Arrays.toString(arr2));
            printUnion(arr1, arr2);

        }

    }

    static void printUnion(int[] arr1, int[] arr2) {
        List<Integer> unionArray = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();
        Arrays.stream(arr1).forEach(set1::add);
        Arrays.stream(arr2).forEach(set2::add);
        unionArray.addAll(set1);
        unionArray.addAll(set2);
        Collections.sort(unionArray);
        System.out.println("Union of both arrays is: " + unionArray);

    }
}
