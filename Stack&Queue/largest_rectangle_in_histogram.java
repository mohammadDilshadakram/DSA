import java.util.*;
public class largest_rectangle_in_histogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height[]={2,1,5,6,2,3};
        int n=height.length;
        Stack<Integer> s=new Stack<>();
        //right smaller value
        int right[]=new int[n];
        right[n-1]=-1;
        for (int i = n-2; i >=0; i--) {
            while (!s.isEmpty() && height[s.peek()]>=height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                right[i]=-1;
            } else {
                right[i]=s.peek();
            }
            s.push(i);
        }
        //left smaller value
        int left[]=new int[n];
        left[0]=-1;
        for (int i = 1; i <n-1; i++) {
            while (!s.isEmpty() && height[s.peek()]>=height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                left[i]=-1;
            } else {
                left[i]=s.peek();
            }
            s.push(i);
        }
        int area=0;
        int maxarea=0;
        for (int i = 0; i < n; i++) {
            area=height[i]*(right[i]-left[i]-1);
            maxarea=Math.max(maxarea, area);
        }
        System.out.println(maxarea);
    }
}
