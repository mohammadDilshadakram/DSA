import java.util.*;
public class min_cost_for_accq_all_coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int coin[] = {1, 2, 5, 10, 20, 50};
        int k=3;
        Arrays.sort(coin);
        int ans=0;
        for (int i = 0; i < coin.length-k-1; i++) {
            ans+=coin[i];
        }
        System.out.println(ans);
    }
}
