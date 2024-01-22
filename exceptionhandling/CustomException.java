// This code is a understanding for creation of the custom exceptions..
package exceptionhandling;

// Import Scanner class for further uses..
import java.util.*;

// Making the custom exception..
class MyException extends Exception {
    // simply throw default Exception

    @Override
    public String toString() {
        return "Number divided by zero is not possible";
    }

    @Override
    public String getMessage() {
        return "This is a Custom Arithmetic Exception.";
    }

    // this is custom exception

}

class Test {
    void cal() throws MyException {
        int a = 50;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("The given number is : " + a);
            System.out.print("Enter the number for divide the given number : ");
            int b = sc.nextInt();
            // if there are some possibilty of rise any specific exception then use
            // try-catch block as:--
            if (b == 0) {
                try {
                    throw new MyException();
                } catch (MyException e) {
                    System.out.println(e.getMessage()); // this show the message of the Exception class.
                    System.out.println(e); // this return the toString.
                }
            }
        }

    }

}

public class CustomException {
    public static void main(String[] args) throws MyException {
        Test t = new Test();
        t.cal();

    }
}