package java8;

// import java.util.*;

class Example {
    // this code is all about the lambda expression in java 8...

    // normal function without using the lambda expression -->
    public void method1() {
        System.out.println("Hello World!...");
    }

    // when we use the lambda expression for above code section -->
    // () -> {System.out.println("Help!!")}

    /*
     * Important things which we can remember when we convert any normal function in
     * the lambda expression.
     * When lambda expression executing any java.class file not created so it comes
     * in java with enable functionality and
     * compact and concise way to write the functional interfaces.
     * 
     * Three major rules are to be remember --
     * 1. remove the access modifeir
     * 2. remove the return type
     * 3. remove the method name
     * 
     * Lambda expression is used for the passing the comparator for any function.
     * eg. when we sorted via comparator then we use the following -->
     * (a,b) -> a-b; --- for asending order
     * (a,b) -> b-a; --- for desecending order
     */

}

public class LambdaExp {
    public static void main(String[] args) {

    }

}
