package oops;

// This is short program to understand the concept of inheritance
public class Inheritance{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking...");
    }
}