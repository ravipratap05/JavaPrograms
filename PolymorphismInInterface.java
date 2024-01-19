// This is for better understanding the polymorphism concept in interface...
public class PolymorphismInInterface {
    public static void main(String[] args) {
       NewCamera cam = new NewSmartPhone();
       cam.takephoto();
    //    cam.chat();  --> Throw an error, referencing object of camera only access the method of camera interface.
        Whatsapp w = new NewSmartPhone();
        w.chat();
    }
}

// Declare a interface...
interface NewCamera{
    void takephoto();
}

// Declare another interface...
interface Whatsapp{
    void chat();
}

// Declare a class and implements both interfaces...
class NewSmartPhone implements NewCamera,Whatsapp{
    public void takephoto(){
        System.out.println("Taking photo using Smart phone camera.");
    }
    public void chat(){
        System.out.println("Chatting through whatsapp.");
    }
}