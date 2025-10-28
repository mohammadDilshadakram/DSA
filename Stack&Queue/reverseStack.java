import java.util.*;
public class reverseStack {

    public static void bottomAdd(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        bottomAdd(s,data);
        s.push(top);
    }

    public static void reverse(Stack<Integer>s){
        if (s.isEmpty()) {
            return;
        }
        int top=s.pop();
        reverse(s);
        bottomAdd(s,top);
        
        
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
         Stack<Integer> s=new Stack<>();
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);
        s.push(10);
        System.out.println(s);
        reverse(s);
        System.out.println(s);

    }
}
