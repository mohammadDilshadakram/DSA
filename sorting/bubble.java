import java.util.*;

public class bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int i, n;
        // System.out.println("ebter the size of array");
        // n = sc.nextInt();
        // int arr[] = new int[n];
        // for (i = 0; i < n; i++) {
        //     System.out.println("Enter the elemnt in an array");
        //     arr[i] = sc.nextInt();
        // }
        // for (int j = 0; j <= n - 1; j++) {
        //     for(int k=0;k<n-i-1;k++){
        //         if(arr[j]<arr[j+1]){
        //            int t=arr[j+1];
        //             arr[j+1]=arr[j];
        //             arr[j]=t;



        //         }
                
        //     }

        // }

        // for(int m=0;m<n;m++){
        //     System.out.println(arr[m]);
        // }

        int arr[]={5,4,7,8,1,2,2,0,3};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]) {
                    //swap
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
         for(int m=0;m<arr.length;m++){
             System.out.println(arr[m]);
         }

    }

}


