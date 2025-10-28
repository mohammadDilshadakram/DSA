import java.util.*;
public class triplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,k,l,n;
        System.out.println("Enter the size of an array");
        n=sc.nextInt();
        int nums[]=new int[n];
        for(i=0;i<n;i++){
            System.out.println("Enter the element");
            nums[i]=sc.nextInt();

        }
        for(j=0;j<n;j++){
           for(k=j+1;k<n;k++){
            for(l=k+1;l<n;l++){
                if(nums[j]+nums[k]+nums[l]==0){
                    System.out.println(nums[j]+","+nums[k]+","+nums[l]);
                }

            }
        }

    }
}
}