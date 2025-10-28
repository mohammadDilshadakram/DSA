import java.util.*;
public class duplicateParanthesis {

    public static boolean check(String str){
        Stack<Character>s=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch==')') {
                int count=0;
                while ( s.peek()!='(') {
                    s.pop();
                    count++;
                    
                }
                if (count<1) {
                    return true;
                }
            } else {
                s.push(ch);
            }
        } 
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="(a+b)";
        if (check(str)) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
        
        
    }
}
