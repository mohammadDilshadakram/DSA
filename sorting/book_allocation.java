import java.util.*;
public class book_allocation {
    public static boolean isValid(int arr[],int mid,int m){
        int pages=0;
        int st=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mid){
                return false;
            }if(pages+arr[i]>mid){
                st++;
                pages=arr[i];
            }else{
                pages+=arr[i];
            }
        }
        if(st>m){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int arr[]={2,1,3,4};
        int m=2;
        int si=0;
        int ei=0;
        for(int i=0;i<arr.length;i++){
            ei+=arr[i];
        }
        int ans=-1;
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
