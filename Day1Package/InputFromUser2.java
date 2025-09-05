package Day1Package;
import java.util.Scanner;

public class InputFromUser2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Float value=");
        float a = sc.nextFloat();
        System.out.println("First Float value is:" + a);
        System.out.print("Enter Second Float value=");
        float b = sc.nextFloat();
        System.out.println("Second Float value is:" + b);
        float c = a + b;
        System.out.println("Sum Of These Two Float No. is:" + c);
        boolean b1=sc.hasNextInt();
        System.out.println(b1);
        String str1=sc.next();
        System.out.println(str1);
        String str2=sc.nextLine();
        System.out.println(str2);

    }
}
