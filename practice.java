import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        float sum=(sub1+sub2+sub3)/3.0f;
         if (sum>40&&sub1>=33&&sub2>=33&&sub3>=33)
         {
            System.out.println("Congratulations!");
         }
         else{
            System.out.println("Sorry!");
         }

    }
}
