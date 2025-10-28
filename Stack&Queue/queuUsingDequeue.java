import java.util.*;
public class queuUsingDequeue {
    public static class QueueInDequeue {
        Deque<Integer> dq=new LinkedList<>();
        public void push(int x){
            dq.addLast(x);
        }
        public int peek(){
            if (dq.isEmpty()) {
               
                System.out.println("Stack is empty");
                return -1;
            }else{
                return dq.getFirst();
            }  
        }
        public int pop(){
            if (dq.isEmpty()) {
               
                System.out.println("Stack is empty");
                return -1;
            }else{
                return dq.pollFirst();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        QueueInDequeue sq=new QueueInDequeue();
        sq.push(1);
        sq.push(2);
        sq.push(3);
        sq.push(4);
        sq.push(5);
        System.out.println(sq.peek());//5
        System.out.println(sq.pop());
        System.out.println(sq.pop());
         System.out.println(sq.peek());//3


    }
}


