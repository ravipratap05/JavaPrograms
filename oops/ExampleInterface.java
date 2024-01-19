package oops;


public class ExampleInterface {
    public static void main(String[] args) {
        // Creating object for accessing the properties and method of interface and subclass.
        SmartPhone s = new SmartPhone();    
        
        String[] nt = s.networks();{
            for (String item: nt){
                if (item == "Airtel_5G") {
                    System.out.println(item);
                }
            }
        } 
        // Invoking the methods of interface and subclass.
        s.call();
        s.takePhoto();
        s.connect();
        s.snap();
        s.swithoff();
    }  
}

// First interface
interface CellPhone{
    // Method declaration in interface(-- all methods and variable in interface are final by default --)
    void call();
    void takePhoto();
    // Create a default method in interface
    default void swithoff(){
        System.out.println("Swithing off the cellphone...");
    }
}

// Second interface
interface Wifi{
    String[] networks();
    void connect();
}

// Subclass for inherit the properties.
class Camera{
    void snap(){
        System.out.println("Taking a snap");
    }
}

// Inherit the subclasses and implements the interfaces.
class SmartPhone extends Camera implements CellPhone, Wifi{
    // Override the methods of interfaces.
    @Override
    public void call(){
        System.out.println("Calling someone...");
    }
    @Override
    public void takePhoto(){
        System.out.println("Taking picture...");
    }
    @Override
    public String[] networks(){
        System.out.println("Getting networks...");
        String[] network = {"Airtel_5G", "Jio_5G"};
        return network;
    }
    @Override
    public void connect(){
        System.out.println("Connect to network succesfully...");
    }
    // Override the default method of interface for modifying it's definition.
    @Override
    public void swithoff() {
        System.out.println("This is overridden method for swithing off...");
    }
}