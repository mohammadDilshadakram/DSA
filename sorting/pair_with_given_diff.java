import java.util.*;
public class pair_with_given_diff{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[] = {5, 20, 3, 2, 50, 80};
        //[2,3,5,20,50,80]
        int x=78;
        Arrays.sort(arr);
        int j=1;
        for(int i=0;i<arr.length;i++){
            while(j<arr.length && arr[j]-arr[i]<x){
                j++;
            }
            if(j<arr.length && arr[j]-arr[i]==x){
                System.out.println("The pairs are "+arr[j]+" and "+arr[i]);
            }
        }

        
    }
}