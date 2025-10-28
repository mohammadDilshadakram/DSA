import java.util.*;

public class stackUsingQueue {

    public static class queue {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public void push(int x) {

            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.poll());
            }
            Queue<Integer> temp = q2;
            q2 = q1;
            q1 = temp;
        }

       int peek() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return q1.peek();
        }

    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return q1.poll();
        }
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue s = new queue();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek());
        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());
        System.out.println("Top element: " + s.peek());

    }
}
