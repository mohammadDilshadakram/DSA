import java.util.*;
public class reverse_first_k_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        Stack<Integer> s=new Stack<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        System.out.println(q);
        int k=3;
        for (int i = 0; i < k; i++) {
            s.push(q.poll());

        }
        //1,2,3,4,5
        for (int i = 0; i < k; i++) {   
            q.add(s.pop());
        }
       for (int i = 0; i < q.size()-k; i++) {
            q.add(q.poll());
       }

        System.out.println(q);

    }
}
