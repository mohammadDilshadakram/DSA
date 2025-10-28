import java.util.*;
public class syockSpan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int stock[]={100, 80, 60, 120};
        int span[]=new int[stock.length];
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for (int i = 1; i < span.length; i++) {
            while (!s.isEmpty() && stock[s.peek()]<=stock[i] ) {
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]=i-s.peek();
            }
            
            s.push(i);
        }
        for (int j = 0; j < span.length; j++) {
            System.out.println(span[j]);
        }
    }
}
