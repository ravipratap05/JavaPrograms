package string.stringclass;

import java.lang.String;

public class ArrayExample {
    public static void main(String[] args) {
        // declaration of array...
        // String [] name;          // this is best way for declare a array...
        // String name[];  --> valid way...
        // String [] name = new String[5];  --> declare and memory allocate same time...
        // String [] name = {"ravi", "bittu", "rohan", "mercy", "lucky"};  --> declare and initialization same time...
        // String [5] name; --> invalid way because not allocate memory in such way...

        // method of array 
        // name = new String[5];   // memory allocation
        // System.out.println("Memory allocated for an array: " + name);
        String [] names = {"ravi", "bittu", "rohan", "mercy", "lucky"};

        for (String name : names){
            System.out.println(name);
        }
    }
}