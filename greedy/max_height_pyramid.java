import java.util.*;
public class max_height_pyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[] = {10, 20, 30, 50, 60, 70};
        Arrays.sort(arr);
        int ans=1;
        int prevWeight=arr[0];
        int prevCount=1;
        int currWt=0;
        int currCount=0;
        
        for (int i = 0; i < arr.length; i++) {

           currWt=arr[i];
           currCount++;
           if (currCount>prevCount && currWt>prevWeight) {
            ans++;
            prevCount=currCount;
            prevWeight=currWt;
            currCount=0;
            currCount=0;
           }

        }
        System.out.println(ans);

    }
}
 