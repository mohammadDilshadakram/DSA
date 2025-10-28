import java.util.*;

public class selectionSort {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,k;
        int arr[]={5,4,1,3,2};
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        for(k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }

    }
}







