import java.util.*;
public class stack_permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3};
        int b[]={3,1,2};
        int j=0;
        Stack<Integer> s=new Stack<>();
        for (int i = 0; i < a.length; i++) {
            s.push(a[i]);
            while(!s.isEmpty() && s.peek()==b[j]) {
                s.pop();
                j++;
            }
        }
        if (s.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
