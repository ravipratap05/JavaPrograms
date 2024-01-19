import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        try (
            // Take input from the user for name and age.
        Scanner data = new Scanner(System.in)) 
        {
            System.out.print("Enter your name: ");
            String name = data.nextLine();
            System.out.print("Enter your age: ");
            int age = data.nextInt();
            // Display the entered information.
            System.out.println("\nYour name is " + name + ", and you are " + age + " years old.");
        }
    }
}
