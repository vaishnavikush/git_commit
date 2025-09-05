package Day1Package;
import java.util.Scanner;
public class InputFromUser {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First value=");
        int a=sc.nextInt();
        System.out.println("First value is:"+a);
        System.out.print("Enter Second value=");
        int b=sc.nextInt();
        System.out.println("Second value is:"+b);
        int c=a+b;
        System.out.println("Sum Of These Two No. is:"+c);
    }
}
