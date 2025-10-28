import java.util.*;
public class Lexicographically_smallest_array_after_at_most_K_consecutive_swaps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {7, 6, 9, 2, 1};
        int n=arr.length;
        int k=1;
        for (int i = 0; i<n && k>0; i++) {
            int pos=i;
            for (int j = i+1; j < arr.length && j<=i+k; j++) {
                if (arr[j]<arr[pos]) {
                    pos=j;
                }
            }
            for(int j=pos;j>i;j--){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
            k-=(pos-i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        
    }
}
