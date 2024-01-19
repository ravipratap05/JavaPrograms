package oops;
// This is a example for better understanding the inheritance concept in interface...
public class InheritanceInInterface {
    public static void main(String[] args) {
        Examples e = new Examples();
        e.meth1();
        e.meth3();
        e.meth4();
    }
}

// Declare a interface having the public, private and default method...
interface SampleInterface {
    void meth1();
    private void meth2(){
        System.out.println("This is method 2, Which is declare as private.");
    }    
    default void meth3() {
        meth2();
        System.out.println("This is method 3, Which is declare as default.");
    }
}

// Declare second interface which extends another interface...
interface ChildSample extends SampleInterface{
    void meth4();
}

// Declare a class which implements second interface...
class Examples implements ChildSample{
    @Override
    public void meth1(){
        System.out.println("This is method 1.");
    }
    @Override
    public void meth4(){
        System.out.println("This is method 4.");
    }
}

