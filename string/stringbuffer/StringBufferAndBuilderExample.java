package string.stringbuffer;

public class StringBufferAndBuilderExample {
    public static void main(String[] args) {
        //  String buffer helps us to create string which are mutable...
        //  it is used when we want to make changes in the existing string..
        //  Object creation is needed for using the stringbuffer class...

        StringBuffer sb = new StringBuffer("Hello ");

        // string buffer has three constructor...
        // StringBuffer sb = new StringBuffer();  --> this create empty string buffer with capacity 16.
        // StringBuffer sb = new StringBuffer("Hey");  --> this create string buffer with specified string.
        // StringBuffer sb = new StringBuffer(100);  --> this create string buffer with specified capacity.

        // Method of StringBuffer() class...
        // once a method perform upon the string of string buffer class then it is modified not return a new string.

        // append() method...
        sb.append("Java");
        System.out.println(sb);     // Hello Java

        // insert() method...
        sb.insert(5, " World");
        System.out.println(sb);     // Hello World Java --> because sb is modified now 

        // replace() method...
        sb.replace(2,5, " Bye");
        System.out.println(sb);     // He Bye World Java --> because sb is modified

        // delete() method...
        sb.delete(0,7);
        System.out.println(sb);     // World Java

        // reverse() method...
        sb.reverse();
        System.out.println(sb);      // Java World
        sb.reverse();
        System.out.println(sb);

        // capacity() method...
        sb.capacity();
        System.out.println(sb.capacity());   // 22 --> default capacity is 16.
        
        // ensureCapacity() method...
        sb.ensureCapacity(30);
        System.out.println(sb.capacity());   // now (22*2)+2 = 46 --> if given capacity is greator than the original capacity
        sb.ensureCapacity(40);
        System.out.println(sb.capacity());   // now no change because given capacity is lesser than given capacity

        /* StringBuilder is same functionality as StringBuffer, Some difference in between them is that StringBuffer is 
        non-synchronized and thread-safe but StringBuilder is non-synchronized and non-thread-safe.
        --> thread-safe is like two thread not call same stringbuffer object simultaneously
        --> non-thread-safe is like two thread can call same stringbuilder object simultaneously */ 

        // ALL FUCNTIONALITY AND METHOD WORKING ARE SAME FOR BOTH STRINGBUFFER & STRINGBUILDER.

        /* --> Author - Ravi Pratap Singh <-- */
    }
}
