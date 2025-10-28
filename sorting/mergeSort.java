import java.util.*;
public class mergeSort {

    public static void divide(int si,int ei,int arr[]){
        if (si>=ei) {
            return;
        }
        int mid=si+(ei-si)/2;
        divide(si, mid, arr);
        divide(mid+1, ei, arr);
        sort(si,ei,mid,arr);
    }
    public static void sort(int si,int ei,int mid,int arr[]){
        int i=si;
        int j=mid+1;
        int k=0;
        int temp[]=new int[ei-si+1];
        while (i<=mid&& j<=ei) {
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }

       while(i<=mid){
        temp[k++]=arr[i++];
       }
       while(j<=ei){
         temp[k++]=arr[j++];
       }
        for(k=0;k<temp.length;k++){
           arr[k+si]=temp[k];
        }
    }
    public static void main(String[] args) {
         int arr[]={5,4,7,8,1,2,2,0,3};
         divide(0, arr.length-1, arr);
         for(int m=0;m<arr.length;m++){
           System.out.println(arr[m]);
        }
    }
    
}
