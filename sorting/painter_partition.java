import java.util.*;
public class painter_partition {
    public static boolean isValid(int arr[],int mid,int m){
        int painter=1;
        int area=0;
        for(int i=0;i<arr.length;i++){
               if(arr[i]>mid){
            return false;
        }
            if (arr[i]+area>mid) {
                painter++;
                area=arr[i];
            }else{
                area+=arr[i];
            }
        }
        if(painter>m){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={40,30,10,20};
        int m=2;
        int si=0;
        int ei=0;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>si){
                si=arr[i];
            }
            ei+=arr[i];
        }
        
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(isValid(arr,mid,m)){
                ei=mid-1;
                ans=mid;
            }else{
                si=mid+1;
            }
        }
        System.out.println(ans);
    }
}
