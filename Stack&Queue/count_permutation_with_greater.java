import java.util.*;
public class count_permutation_with_greater{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=100;
        int count=0;
        Stack<Integer> s=new Stack<>();
        for (int i = 1; i <=9; i++) {

            if (i<=n) {
                s.push(i);
                count++;
            }
            while (!s.isEmpty()) {
                int ele=s.pop();
                for (int j = ele%10; j<=9; j++) {
                    if (ele*10+j <=n) {
                        
                        s.push(ele*10+j);
                        count++;
                    }
                }
            }
        }

       
        System.out.println(count);
    }
}