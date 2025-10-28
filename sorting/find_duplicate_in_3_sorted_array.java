import java.util.*;
public class find_duplicate_in_3_sorted_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[] = {1, 5, 10, 20, 30};
        int arr2[] = {5, 13, 15, 20}, arr3[] = {5, 20};
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length && k<arr3.length){
            if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                System.out.println(arr1[i]);
                i++;
                j++;
                k++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else if(arr2[j]<arr3[k]){
                j++;
            }else{
                k++;
            }
        }
    }
}
