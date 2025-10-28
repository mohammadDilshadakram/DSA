import java.util.*;
public class addBottom {

    public static void bottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;

        }
        int top=s.pop();
        bottom(s, data);
        s.push(top);
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
        bottom(s, 0);
        System.out.println(s);

    }
}
