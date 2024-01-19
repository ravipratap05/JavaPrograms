// This code bout the concept of dynamic method dispatching(somehow polymorphism)...
public class DynamicDispatching {
    public static void main(String[] args) {
        Base b = new Base();
        b.printName();
        System.out.println("------------------------");
        Derived d = new Derived();
        d.printName();
        System.out.println("------------------------");

        // Dynamic Dispatching...
        Base obj = new Derived();
        obj.printName();
    }
}

// Create a class 
class Base{
    public void printName(){
        System.out.println("This is the base class");
    }
}

// Create another class
class Derived extends Base{
    @Override
    public void printName() {
        System.out.println("This is derived from base class");
    }

    public void print(){
        System.out.println("I am in Print Method of Derived Class");
    }
}