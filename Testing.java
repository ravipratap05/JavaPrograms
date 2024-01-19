class One{
    public String fname = "Ravi";
    String mname = "Pratap";
    protected String lname = "Singh";
    private String fullname = "ABC";
    private String name = "Ram";
    String setFullName(){
        // this.name = name;
        return name;
    }
    String getFullName(){
        
        // System.out.println("Full Name : " + fullname);
        return fullname;
    }
    void getData(){
        System.out.println("This method is in same class.");
        System.out.println("First Name : "+fname);
        System.out.println("Middle Name : "+mname);
        System.out.println("Last Name : "+lname);
        System.out.println("Full Name : "+fullname);
        
        System.out.println("-----------------------------------");
    }

}

class Two extends One{
    void getDetails(){
        System.out.println("This method is in subclass.");
        // super.getData();
        One obj = new One();
        // obj.getData();
        System.out.println(obj.setFullName());
        System.out.println(obj.getFullName());
    }
}

public class Testing{
    public static void main(String[] args) {
        One o = new One();
        o.getData();

        Two t = new Two();
        t.getDetails();
    }
}