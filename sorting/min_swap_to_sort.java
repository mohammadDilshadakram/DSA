import java.util.*;
public class min_swap_to_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1, 3, 4, 5, 6};
        int temp[]=arr.clone();
        Arrays.sort(temp);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=temp[i]){
                count++;
            }
        }
        System.out.println(count/2);
    }
}

