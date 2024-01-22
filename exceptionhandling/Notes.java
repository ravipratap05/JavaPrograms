package exceptionhandling;

import java.util.Scanner;

/*
 * Exception's top most class is Throwale class and Exception are two types-
 * 1. Compile time --> check at compile time(IO, SQL, ClassNotFound)
 * 2.Run time --> check at runtime(Arithmetic, NullPointer, NumberFormat, IndexOutOfBound(Array, String))
 */

// Built-in Exceptions--
class BuiltInException {
    int a = 50;

    void cal() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("The given number is : " + a);
            System.out.print("Enter the number for divide the given number : ");
            int b = sc.nextInt();
            // if there are some possibilty of rise any specific exception then use
            // try-catch block as:--
            try {
                int result;
                result = a / b;
                System.out.println("Result of division is : " + result);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero not allowed");
            } finally {
                System.out.println("\nFinished");
            }
        }

    }

}

public class Notes {
    public static void main(String[] args) {
        BuiltInException ex = new BuiltInException();
        ex.cal();
    }
}
