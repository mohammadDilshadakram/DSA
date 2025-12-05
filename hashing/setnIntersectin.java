import java.util.*;
public class setnIntersectin {

    public static int union(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        return set.size();

    }
    public static int intersection(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            if (set.contains(arr1[i])) {
                count++;
                set.remove(arr1[i]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]={7,3,9,0,2,4,6,8};
        int arr2[]={1,3,5,7,9};
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        //union
        int union=union(arr1,arr2);
        int intersection=intersection(arr1,arr2);
        System.out.println("The union of two array is "+union+" and the intersection is "+intersection);

    }
}
