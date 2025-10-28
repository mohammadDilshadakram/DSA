
import java.util.*;
public class activity_selection{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ans=new ArrayList<>();
        int start[]={1, 3, 0, 5, 8, 5};
        int end[]={2, 4, 6, 7, 9, 9};
        int count=1;
        ans.add(0);
        int ending=end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i]>ending) {
                count++;
                ans.add(i);
                ending=end[i];
            }
        }
        System.out.println(ans);
        System.out.println(count);
    }
}
