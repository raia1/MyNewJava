import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

public class stringif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String webSitr=sc.next();
        if (webSitr.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if (webSitr.endsWith(".org")) {
            System.out.println("Organisational Website");
        }
        else if (webSitr.endsWith(".in")) {
            System.out.println("Indian Website");
        }
    }
}
