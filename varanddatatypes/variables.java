import java.util.*;

public class variables {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a, b, c, avg;

        System.out.println("Enter first number");
        a = sc.nextInt();

        System.out.println("Enter Secind number");
        b = sc.nextInt();

        System.out.println("Enter third number");
        c = sc.nextInt();

        avg = (a + b + c)/3;

        System.out.println("Hello world  "+avg);
      
    }
}
