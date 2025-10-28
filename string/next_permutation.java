import java.util.*;
public class next_permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,6,5,4};
        int n=arr.length;
        int pivot=-1;
        for(int i=n-2;i>0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
             
            
        }
        for(int i=n-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                int temp=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp;
                break;
            }
        }
        int left=pivot+1;
        int right=n-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
