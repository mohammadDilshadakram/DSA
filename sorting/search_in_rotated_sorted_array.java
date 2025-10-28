import java.util.*;
public class search_in_rotated_sorted_array{

    public static void binarySearch(int si,int ei,int arr[],int tar){
        if (si>=ei) {
            return;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            System.err.println("Found at indes"+mid);
        }
        if(arr[mid]>=arr[si]){
            if(arr[si]<=tar && arr[mid]>=tar){
                binarySearch(si, mid-1, arr,tar);
            }else{
                binarySearch(mid+1, ei, arr,tar);
            }
        }else{
            if (tar<=arr[ei]&& arr[mid+1]<=tar) {
                binarySearch(mid+1, ei, arr,tar);
            }else{
                binarySearch(si, mid-1, arr,tar);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={3,4,5,6,7,0,1,2};
        int tar=0;
        binarySearch(0,arr.length-1,arr,tar);
    }
}