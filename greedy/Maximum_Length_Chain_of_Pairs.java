import java.util.*;
public class Maximum_Length_Chain_of_Pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer chains[][]= {{5, 24},
                        {39, 60},
                        {15, 28}, 
                        {27, 40}, 
                        {50, 90} };
        int ans=1;  
        

        Arrays.sort(chains,Comparator.comparingDouble(o->o[1]));
        int start=chains[0][1];
        for (int i = 1; i < chains.length; i++) {
            if (chains[i][0]>start) {
                ans++;
                start=chains[i][1];
            }
        }
        System.out.println(ans);
    }
}
