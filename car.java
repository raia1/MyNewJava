import java.util.Scanner;

public class car {
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
    public static void main(String[] args) {
        car myCar = new car();
        myCar.fullThrottle();
        System.out.print("Enter Speed: ");
        Scanner sc= new Scanner(System.in);
        int maxSpeed=sc.nextInt();
        myCar.speed(maxSpeed);
    }
}

