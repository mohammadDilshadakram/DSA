import java.util.*;

public class greater_prior_element {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();//7,4,8,2,9   answer 3
        }
        int count=1;
        int maxi=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
                count++;
            }

        }
        System.out.println(count);


    }
}
