import java.util.*;
public class single_element_in_sorted_array {

    public static void element(int si,int ei,int arr[]) {
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
            System.out.println(arr[mid]);
        }
        if(mid%2==0){
            if(arr[mid]==arr[mid-1]){
            element(si, mid-1, arr);
        }else{
            element(mid+1, ei, arr);
        }
        }else{
            if(arr[mid]==arr[mid-1]){
            element(mid+1, ei, arr);
        }else{
            element(si, mid-1, arr);

        }
    }
        
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,1,2,3,3,4,4,8,8};
        element(0,arr.length-1,arr);

    }
}
