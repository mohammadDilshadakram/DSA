import java.util.*;
public class chocola_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer hori[]={4, 1, 2};
        Integer verti[]={2, 1, 3, 1, 4};
        Arrays.sort(hori,Collections.reverseOrder());
        Arrays.sort(verti,Collections.reverseOrder());
        int hp=1;
        int h=0,v=0;
        int vp=1;
        int cost=0;
        while (h<hori.length && v<verti.length) {
            if (hori[h]<verti[v]) {
                cost+=(verti[v]*hp);
                v++;
                vp++;
            } else {
                cost+=(hori[h]*vp);
                h++;
                hp++;
            }
        }
        while (h<hori.length) {
            cost+=(hori[h]*vp);
                h++;
                hp++;
        }
        while (v<verti.length) {
             cost+=(verti[v]*hp);
                v++;
                vp++;
        }
        System.out.println(cost);
    }
}
