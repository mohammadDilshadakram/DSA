import java.util.*;

public class oddeven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=0, i, evenSum = 0, oddSum = 0;
        for (i = 0; n >= 0; i++) {
            System.out.println("Enter the no of strings you want to enter");
            n = sc.nextInt();
            if (n % 2 == 0) {
                evenSum = evenSum + n;
            } else
                oddSum = oddSum + n;
        }
        System.out.println("The sum of even number is "+evenSum);
        System.out.println("The sum of even number is "+oddSum);

    }
}
