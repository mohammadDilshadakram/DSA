import java.util.*;
public class sort_0_1_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={0,1,2,0,1,2};
        int mid=0;
        int low=0;
        int high=arr.length-1;
        while(mid<high){
            if(arr[mid]==1){
                mid++;
            }if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
