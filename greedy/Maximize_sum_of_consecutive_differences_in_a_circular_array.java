import java.util.*;
public class Maximize_sum_of_consecutive_differences_in_a_circular_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {4, 2, 1, 8 };
        int sum=0;
        Arrays.sort(arr);   //1 2 4 8
        int result[]=new int[arr.length];
        int lp=0;
        int rp=arr.length-1;
        int idx=0;
        int n=arr.length;
        while (lp<=rp) {
            if (idx<n) {
                result[idx++]=arr[lp++];
            }if (idx<n) {
                result[idx++]=arr[rp--];
            }
        }
        for (int i = 0; i < result.length; i++) {
            sum+=Math.abs(result[i]-result[(i+1)%n]);
        }
        System.out.println(sum);

    }
}
