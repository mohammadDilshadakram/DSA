import java.util.*;
public class validParanthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="()[]}";
       Stack<Character> s = new Stack<>();
       
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }else{
                if (s.isEmpty()) {
                    System.out.println("Not Valid");
                    return;
                    
                }
                 if (str.charAt(i)==')' && s.peek()=='('|| 
                 str.charAt(i)=='}' && s.peek()=='{' 
                 || str.charAt(i)==']' && s.peek()=='[') {
                    s.pop();
                 }else{
                    System.out.println("Not Valid");
                 }
                 
            }
        }
        if (s.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }

    }
}
