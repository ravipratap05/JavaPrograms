import java.util.ArrayList;
import java.util.Scanner;

class Remove {
    void removeEle() {
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("Enter the size of the array : ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("Enter elements one by one:");
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                num.add(x);
            }
            System.out.println("The entered array is : " + num);
            System.out.print("Enter element to be removed : ");
            int val = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (val == num.get(i)) {
                    num.remove(i);
                    --i; // decrement index because a gap created after removal
                    --n; // decrease count of remaining elements
                    num.add(0);
                }
            }
            System.out.println("The entered array is : " + num);
        }
    }
}

public class Leetcode_practice {
    public static void main(String[] args) {
        // Testing the methods of the class.
        // removing element in the array

        Remove r = new Remove();
        r.removeEle();

    }
}
