import java.util.*;
public class smallestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    int arr[] = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10}, k = 4;
    for(int i=0;i<arr.length;i++){
        pq.add(arr[i]);
    }
   
    for(int i=0;i<k-1;i++){
        pq.poll();
    }
    System.out.println(pq.poll());
    }
    
}
