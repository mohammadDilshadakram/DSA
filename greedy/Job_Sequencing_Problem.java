import java.util.*;
public class Job_Sequencing_Problem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int deadline[]={2, 1, 2, 1, 1};
        int profit[]={100, 19, 27, 25, 15};
        int n=profit.length;
        Integer jobs[][]=new Integer[n][3];
        ArrayList<Integer> result=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            jobs[i][0]=i;
            jobs[i][1]=deadline[i];
            jobs[i][2]=profit[i];
        }
        Arrays.sort(jobs,Comparator.comparingInt((Integer[] o)->o[2]).reversed());
        
        int count=0;
        System.out.println(jobs[0][2]);
        int profits=0;
        int end=0;
        for (int i = 0; i < n; i++) {
            if (jobs[i][1]>end) {
                profits+=jobs[i][2];
                count++;
                end++;
                
            }
        }
        System.out.println(count+" "+profits);

    }
}
