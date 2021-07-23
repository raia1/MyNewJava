import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        String str=sc.next();
//        String reverseStr="";
//        String j=str.length();
//        for(int i=j-1;i>=0;i--){
//           reverseStr=reverseStr+str.charAt(i);}
//
//        if (str.equals(reverseStr)){
//               System.out.println("YES");
//           }else{
//               System.out.println("NO");
//           }
            Scanner INT=new Scanner(System.in);
            int num1= INT.nextInt();
            int temp=num1;
            int sum=0;
            while(num1>0){
                int r=num1%10;
                sum=(sum*10)+r;
                num1=num1/10;
            }if(temp==sum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }



    }
}
