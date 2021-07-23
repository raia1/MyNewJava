import java.security.SecureRandom;
import java.util.Scanner;

public class CH3_STRINGS {
    public static void main(String[] args) {
        String name= new String(name="Akansha");
        System.out.println(name);
        Scanner sc= new Scanner(System.in);
//        String st= sc.next();
        String st= sc.nextLine();
        System.out.println(st);

        int value=name.length();
        System.out.println(value);
    }
}
