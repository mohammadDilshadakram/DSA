import java.util.*;
public class trapwater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,j,k,trapwater=0;
        System.out.println("Enter the size of element");
        n=sc.nextInt();
        int height[]=new int[n];
        for(i=0;i<n;i++){
            System.out.println("Enter the element");
            height[i]=sc.nextInt();
        }
        // calculating  left boundary
        int leftBoundary[]=new int[n];
        leftBoundary[0]=height[0];
        for(j=1;j<n;j++){
            leftBoundary[j]=Math.max(height[j],  leftBoundary[j-1]);
        }

        //calculating right boundary
        int rightBoundary[]=new int[n];
        rightBoundary[n-1]=height[n-1];
        for(k=n-2;k>=0;k--){
            rightBoundary[k]=Math.max(height[k], rightBoundary[k+1]);
        }

        for(int m=0;m<n;m++){
            int waterLevel=Math.min(leftBoundary[m], rightBoundary[m]);
            trapwater += Math.max(0, waterLevel - height[m]);
        }
System.out.println("the total trapwater is " + trapwater);




        }
}
