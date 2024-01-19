package oops;
// This code is the solution for the practice set of abstraction concept...
public class PracticeSetAbstraction {
    public static void main(String[] args) {
        // Q1 + Q2
        FountainPen p = new FountainPen();
        p.write();
        System.out.println("------------------------");
        p.refill();
        System.out.println("------------------------");
        p.changeNib();
        System.out.println("------------------------");

        // Q3 + Q5
        Monkey m = new Human();
        m.jump();
        System.out.println("------------------------");
        m.bite();
        System.out.println("------------------------");

        Human h = new Human();
        h.speak();
        System.out.println("------------------------");
        h.eat();
        System.out.println("------------------------");
        h.sleep();
        System.out.println("------------------------");

        // Q4
        TelePhone t = new SmartTelePhone();
        t.ring();
        System.out.println("------------------------");
        t.disconnected();
        System.out.println("------------------------");

        // Q7
        TV tv = new TV();
        tv.switchOn();
        System.out.println("------------------------");
        tv.switchOff();
        System.out.println("------------------------");
        tv.openApps("Netflix");
        System.out.println("------------------------");
        tv.closeApps("Netflix");
        System.out.println("------------------------");

    }
}

// Question - 1 --> Create an abstract class Pen with method write() and refill() as abstract method.
abstract class Pen{
    abstract void write();
    abstract void refill();
}

// Question - 2 --> Use the Pen class from Q.1 to create a concrete class FountainPen with additional method changeNib().
class FountainPen extends Pen{
    @Override
    void write(){
        System.out.println("Fountain pen is writing.");
    }
    @Override
    void refill(){
        System.out.println("Fountain pen has refill.");
    }
    public void changeNib(){
        System.out.println("Changing nib of fountain pen");
    }
}

/* Question - 3 --> Create a Monkey class with jump() and bite() methods, Create a Human class with speak() method which inherit
 Monkey class and implements BasicAnimal interface with eat() and sleep() methods. */ 
class Monkey{
    public void jump(){
        System.out.println("Monkey is jumping.");
    }
    public void bite(){
        System.out.println("Monkey is biting.");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void speak(){
        System.out.println("Human is speaking.");
    }
    @Override
    public void eat(){
        System.out.println("Animal and Human both are eating.");
    }
    @Override
    public void sleep(){
        System.out.println("Animal and Human both are sleeping.");
    }
}

/* Question - 4 --> Create a class TelePhone with ring() and disconnected() methods a abstract methods, Create another class
 SmartTelePhone and demonstrate polymorphism. */ 
abstract class TelePhone{
    public abstract void ring();
    public abstract void disconnected();
}
class SmartTelePhone extends TelePhone{
    @Override
    public void ring(){
        System.out.println("SmartPhone is ringing.");
    }
    @Override
    public void disconnected(){
        System.out.println("SmartPhone is disconnected.");
    }
}

/* Question - 6 --> Create an interface TVRemote and use it to inherit another interface SmartTVRemote. */
interface TVRemote{
    void switchOff();
    void switchOn();
}
interface SmartTVRemote extends TVRemote{
    void openApps(String appName);
    void closeApps(String appName);
}

/* Question - 7 --> Create a class TV which implements SmartTVRemote interface from Q6. */
class TV implements SmartTVRemote{
    public void switchOff(){
        System.out.println("TV is switched off.");
    }
    public void switchOn(){
        System.out.println("TV is switched on.");
    }
    public void openApps(String appName){
        System.out.println("Opening "+appName+" App.");
    }
    public void closeApps(String appName){
        System.out.println("Closing "+appName+" App.");
    }
}