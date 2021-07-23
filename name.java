public class name {
    String fname="Akanhsa";
    String lname="rai";
    int age=24;
    static void mystaticMethod(){
        System.out.println("Static Method");
    }
    public void myPublicMethod(){
        System.out.println("My Public method");
    }
    public static void main(String[] args) {
        name myObj= new name();
        System.out.println("First Name: "+myObj.fname);
        System.out.println("Last Name: "+myObj.lname);
        System.out.println("my age: "+myObj.age);
        mystaticMethod();
        myObj.myPublicMethod();

    }

}

