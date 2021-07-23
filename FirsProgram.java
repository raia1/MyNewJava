import java.util.Scanner;

public class FirsProgram {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c=9;
        int d=a+b+c;
        System.out.println("sum is: " +d);

        //question second code with harry
//        float subject1=45;
//        float subject2=45;
//        float subject3=45;
//        float cgpa= (subject1+subject2+subject3)/30;
//        System.out.println(cgpa);
        //print greeting with user name
//        System.out.println("What is your name");
//        Scanner sc= new Scanner(System.in);
//        String name= sc.next();
//        System.out.println("Hello " +name+  " have a good day");

        //km to miles
//        double km;
//        System.out.println("Please enter distance in km:");
//        Scanner input = new Scanner(System.in);
//        km= input.nextDouble();
//        double miles= km/1.609;
//        System.out.println("Miles: "+miles);
        //given number is integer
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());

    }
}
