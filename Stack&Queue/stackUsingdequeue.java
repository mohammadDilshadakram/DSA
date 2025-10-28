import java.util.*;
public class stackUsingdequeue {

    public static class StackInQueue {
        Deque<Integer> dq=new LinkedList<>();
        public void push(int x){
            dq.addLast(x);
        }
        public int peek(){
            if (dq.isEmpty()) {
               
                System.out.println("Stack is empty");
                return -1;
            }else{
                return dq.getLast();
            }  
        }
        public int pop(){
            if (dq.isEmpty()) {
               
                System.out.println("Stack is empty");
                return -1;
            }else{
                return dq.pollLast();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StackInQueue sq=new StackInQueue();
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
