package prepare;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortBasedOnTheFrequency {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            System.out.println("Enter the elements of the array: ");
            Integer[] arr = new Integer[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();

            }
            List<Integer> list = Arrays.asList(arr);
            System.out.println(list);
            System.out.println("Sorted array based upon the frequency: ");
            System.out.println(sortByFrequency(list));

        }
    }

    public static List<Integer> sortByFrequency(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }
        Collections.sort(list, (a, b) -> {
            int freq1 = map.get(a);
            int freq2 = map.get(b);

            if (freq1 != freq2) {
                return freq2 - freq1;
            }
            return list.indexOf(a) - list.indexOf(b);
        });
        return list;
    }
}
