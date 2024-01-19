// This code help to understand the concept of abstract class or abstract method..
public class Abstraction {
    public static void main(String[] args) {
       Child c = new Child();
       c.greet(); 
       Abs a = new Child(); // we can create the refrence for the abstract class and refer to child class..
       a.greet();
       a.hello();
    }
}

abstract class Abs{
    Abs(){
        System.out.println("I am an Abstract Class"); // constructor automatically load or run at the execution of code..
    }
    abstract public void greet();
    public void hello(){
        System.out.println("Hello World");
    }
} 

class Child extends Abs{
    @Override
    public void greet(){
        System.out.println("Hey, Good Morning.");
    }
}

// we can not create the object of the abstract class...
abstract class Child1 extends Abs{
    public void run(){
        System.out.println("I am running");
    }
}