import java.util.*;
public class longest_valid_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="(()())";
        Stack<Integer> s=new Stack<>();
        int maxlength=-1;
        s.push(-1);
        for (int i = 0; i < str.length();i++) {
            char ch=str.charAt(i);
            if (ch=='(') {
                s.push(i);
            } else {
                s.pop();
                if (s.isEmpty()) {
                    s.push(i);
                }else{
                    maxlength=Math.max(maxlength, i-s.peek());

                }

                
            }
        }
        System.out.println(maxlength);
    }
}
