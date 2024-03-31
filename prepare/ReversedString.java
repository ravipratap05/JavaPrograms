package prepare;

// import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        Scanner s = new Scanner(System.in);
        String myString = s.nextLine();
        // System.out.println(myString);
        StringBuffer sb = new StringBuffer(myString);

        System.out.println(sb.reverse());

    }
}
