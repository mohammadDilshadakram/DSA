import java.util.*;
public class reverseQueue {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
          Stack<Integer> s=new Stack<>();
        int n=0;
        while(!q.isEmpty()){
            
            s.push(q.peek());
            q.remove();
            n++;
        }
        for(int i=0;i<n;i++){
            q.add(s.peek());
            s.pop();
        }
        System.out.println(q);
    }
}
