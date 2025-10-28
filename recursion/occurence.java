import java.util.*;
public class occurence{
    public static void occur(int arr[],int key,int index){
        if(index==arr.length){
            return;

        }

        if(arr[index]==key){
            System.out.print(index +" ");
            occur(arr,key,index+1);
        }
        else{
            occur(arr, key, index+1);
        }
    }
      public static int first=-1;
       public static int last=-1;
    public static void firstLastOccur(int arr[],int key,int index){
     
        if(index==arr.length){
            System.out.println("first is"+first+" and last is"+last);
            return;
        }
        if(arr[index]==key){
            if(first==-1){
                 first=index;
            }else{
                last=index;
            }
        }
        firstLastOccur(arr, key, index+1);


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={9,3,3,0,0,3,7,1,1,5,3};
        occur(arr,3 ,0);
        System.out.println();
        firstLastOccur(arr, 3, 0);
    }
}