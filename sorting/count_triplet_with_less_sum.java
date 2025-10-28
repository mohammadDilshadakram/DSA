import java.util.*;
public class count_triplet_with_less_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int arr[]={-2, 0, 1, 3};
    int sum=2;
    for(int i=0;i<arr.length-2;i++){
        int left=i+1;
        int right=arr.length-1;
        while(left<right){
            if(arr[i]+arr[left]+arr[right]<sum){
                System.out.println("Triplet is "+arr[i]+" "+arr[left]+" "+arr[right]);
                left++;
            }else{
                right--;
            }
        }
    }
    }
    
}
