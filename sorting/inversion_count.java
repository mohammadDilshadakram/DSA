import java.util.*;
public class inversion_count{

    public static int mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return 0;
        }
        int mid=si+(ei-si)/2;
        int leftInversion=mergeSort(arr, si, mid);
        int rightInversion=mergeSort(arr, mid+1, ei);
        int currInversion=merge(arr,si,ei,mid);

        return (leftInversion + rightInversion + currInversion);
    }

    public static int merge(int arr[],int si,int ei,int mid){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        int inversion=0;
        while (i<=mid && j<=ei) {
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
                inversion+=(mid-i+1);
            }

        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=ei) {
            temp[k++]=arr[j++];
        }

        for(int idx=0; idx<temp.length;idx++){
            arr[idx+si]=temp[idx];
        }

        return inversion;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[] = {6,3,5,2,7};
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]>arr[j]){
        //             System.out.println("The pairs are "+arr[i]+"and "+arr[j]);
        //         }
        //     }
        // }
        
        System.out.println(mergeSort(arr,0,arr.length-1));
        

    }
}