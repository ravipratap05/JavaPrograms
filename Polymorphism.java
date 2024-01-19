// This code helps to understands the oops concept (Method Overloding and Method Overriding)
public class Polymorphism {
    public static void main (String[] args){
        // this block of code run as method overloading...
        Person p = new Person();
        p.details("Ravi Pratap", 24);
        System.out.println(" ");
        p.details("Nitya Kaushik", 22, "Bengaluru");

        // this block of code run as method overriding...
        Teacher t = new Teacher();
        t.teach();
        Student s = new Student();
        s.teach();
    }
}

class Teacher{
    public void teach(){
        System.out.println("This is Teacher class");
    }
}
class Student extends Teacher{
    public void teach(){
        System.out.println("This is Student class");
    }
}

class Person{
    String name;
    int age;
    void details(String n , int a){
        System.out.println("Name is : " +n);
        System.out.println("Age is : "+a);
    }

    void details(String n , int a , String l){
        System.out.println("Name is : " +n);
        System.out.println("Age is : "+a);
        System.out.println("Location is : " +l);
    }
}

