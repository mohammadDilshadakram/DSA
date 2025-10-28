import java.util.*;
public class next_smaller_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={13, 7, 6, 12};
        int n=arr.length;
        Stack<Integer> s=new Stack<>();
        int ans[]=new int[arr.length];
        ans[n-1]=-1;
        for (int i = n-2; i >=0; i--) {
            while (!s.isEmpty() && arr[i]<s.peek()) {
                s.pop();
            }
            if (s.isEmpty()) {
                s.push(-1);
            }
            ans[i]=s.peek();
            s.push(arr[i]);
        }
        for (int j = 0; j < ans.length; j++) {
            System.out.println(ans[j]);
        }
        
    }
}
