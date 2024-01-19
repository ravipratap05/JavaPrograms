// This is all about string class --> String is a class in java but use as a datatype...
package string.stringclass;

// import string package from java.lang class...
import java.lang.String;

public class StringExample {
    public static void main(String[] args) {
        // declare string form perform opertations and used method on it...
        String str = "Hello World";

        // find length of a string...
        int strLength = str.length(); // space all count when length is calculated...
        System.out.println(strLength);

        // converting string according to the case...
        String upperCaseStr = str.toUpperCase();  // Converting into Uppercase...
        System.out.println(upperCaseStr);
        String lowerCaseStr = str.toLowerCase();   // Converting into Lowercase...
        System.out.println(lowerCaseStr);

        // removing white space arround the string...
        String trimmedStr = str.trim();
        System.out.println(trimmedStr);

        // creating substring from given string...
        String subStr1 = str.substring(2,5);     // From index 2
        System.out.println(subStr1);            
        String subStr2 = str.substring(4);       // From Index 4
        System.out.println(subStr2);            // till end of the string..

        // checking string whether it starts and ends with specified str...
        boolean startWith = str.startsWith("Hel");
        System.out.println(startWith);           // true or false
        boolean endWith = str.endsWith("ld");
        System.out.println(endWith);  
        boolean startWith1 = str.startsWith("lo");
        System.out.println(startWith1); // true or false
        boolean endWith2 = str.endsWith("rl");
        System.out.println(endWith2);            // true or false

        // find the characters in the given string...
        char findChar = str.charAt(2);
        System.out.println(findChar);         // returns the character which is on the index 2...

        // replace a given string with the another string...
        String replacedStr = str.replace('o', 'X'); // replaces all o with X...
        System.out.println(replacedStr);      // HExl WrXld

        // valueOf() method --> it convert the given datatype into a string...
        Integer num = 98;
        String convertedNum = String.valueOf(num);
        System.out.println(convertedNum);    // 98 --> but now it is a string...
        String modifiedString = convertedNum.concat( " ").concat(str);
        System.out.println(modifiedString);  // 98 Hello World

        /* intern() method --> it return the string if exist in the string pool 
        if not present in the string pool then it create the string with new reference...*/
        String s3 = "Hello";    
        String s4 = "Hello";
        String s5 = s3.intern();
        System.out.println(s5 == s4);          // true

        String s6 = "Hello";
        // String s7 = "Ravi";
        String s8 = "Ravi".intern();
        System.out.println(s8 == s6);         // false

        // comparision of strings...

        // using equals() method...
        boolean eq1 = s3.equals("Hello");
        System.out.println(eq1);             // true
        boolean eq2 = s3.equals("hello");
        System.out.println(eq2);             // false --> because java is case sensitive...
        boolean eq3 = s3.equalsIgnoreCase("hello");
        System.out.println(eq3);              // true

        // using == operator...
        boolean eq4 = (s3 == "Hello");       
        System.out.println(eq4);               // false --> because == checks for refernece...
        boolean eq5 = (s3 == s4);
        System.out.println(eq5);                // true --> both are pointing to same object

        // using compareTo() method...
        int cmp = s3.compareTo("World");   // s3 = "Hello"...
        /* returns -1 if first
          argument is less than second, 0 if equal and
          +1 if first argument is greater */ 
        System.out.println(cmp);                 // -1

        // toString() method...
        String strObj = s3.toString();
        System.out.println(strObj);            // Hello --> convert string into object...

        // indexOf() method...
        int indx = s3.indexOf('l');       
        System.out.println(indx);               // 2 --> at which first we found 'l'...
        int indx1 = s3.indexOf('w');
        System.out.println(indx1);              // -1 --> not found 'w'...
        int indx2 = s3.indexOf('l', 2);
        System.out.println(indx2);              // 3 --> finding starts from 2nd...

        // lastIndexOf() method...
        int lstIndx = s3.lastIndexOf('o');
        System.out.println(lstIndx);           // 4 --> it will return from left...

        // --> mostly used method of string are covered.. <--
    }
}


