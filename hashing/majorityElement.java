import java.util.*;
public class majorityElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]={1,4,3,2,3,3,5,1,3,1,5,2};
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        
        
        for(Integer i:map.keySet()){
            if (map.get(i)>=arr.length/3) {
                System.out.println(i);
            }       
        }
    }
}
