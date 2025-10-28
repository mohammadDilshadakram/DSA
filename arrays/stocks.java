import java.util.*;


public class stocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//         int i,n,size,l=0,j,k,m;
//         int small = Integer.MAX_VALUE;
//         System.out.println("enter the size of array");
//         n=sc.nextInt();
//         size=(n*(n-1))/2;
//         int prices[]=new int[n];
//         int diff[]=new int[size];
//         for(i=0;i<n;i++){
//             System.out.println("enter the element");
//             prices[i]=sc.nextInt();
//         }
//         for(j=0;j<n;j++){
//             for(k=j+1;k<n;k++){
//             diff[l]=prices[j]-prices[k];
//             // System.out.println(diff[l]);
//             l++;
//             }
//         }

//         for(m=0;m<size;m++){
//             if (diff[m] < small) {
//                 small = diff[m];
//             }
//         }
// System.out.println("The maximum profit can be  "+Math.abs(small));







// alternate method



int bp=Integer.MAX_VALUE;
int i,n,j,profit,maxProfit=0;
System.out.println("Enter the size of array");
n=sc.nextInt();
int prices[]=new int[n];
for(i=0;i<n;i++){
    System.out.println("Enter the elements");
    prices[i]=sc.nextInt();
}


for(j=0;j<n;j++){
    if(bp<prices[j]){
        profit=prices[j]-bp;
        maxProfit=Math.max(profit, maxProfit);
    }else{
        bp=prices[j];
    }
}

System.out.println("the max profit you can get is " maxProfit);



    }
}
