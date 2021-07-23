import java.util.Scanner;

public class percentage_sub {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter marks in English: ");
        int English= scan.nextInt();
        System.out.println("Enter marks in Maths: ");
        int Maths= scan.nextInt();
        System.out.println("Enter marks in Science: ");
        int science= scan.nextInt();
        System.out.println("Enter marks in Hindi: ");
        int Hindi= scan.nextInt();
        System.out.println("Enter marks in Punjabi: ");
        int Punjabi= scan.nextInt();

        float percentage = ((English+Maths+science+Hindi+Punjabi)/500.0f)*100;
        System.out.println("Percentage= " + percentage);
    }
}
