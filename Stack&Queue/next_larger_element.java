import java.util.*;

public class next_larger_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={6, 8, 0, 1, 3};
        int ans[]=new int[arr.length];
        int ArrayList ans1=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        int n=arr.length;
        ans[n-1]=-1;
        ans1.s
        s.push(arr[n-1]);
        for (int i = n-2; i >= 0; i--) {
            while (!s.isEmpty() && arr[i]>s.peek()) {
                s.pop();

            }
            if(s.isEmpty()){
                s.push(-1);
            }
            ans[i]=s.peek();
            s.push(arr[i]);

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(ans[i]);
        }
        
    }    
}
