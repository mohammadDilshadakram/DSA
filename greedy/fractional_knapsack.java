    import java.util.*;
    public class fractional_knapsack {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int capacity=50;
            int val[]={60, 100, 120};
            int wt[]={10, 20, 30};
            double ratio[][]=new double[val.length][2];
            double ans=0;

            for (int i = 0; i < ratio.length; i++) {
                ratio[i][0]=i;
                ratio[i][1]=(double) val[i]/wt[i];
            }
            Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
            for (int i = ratio.length-1; i >=0; i--) {

                int idx=(int)ratio[i][0];
                if (wt[idx]<=capacity) {
                    
                    ans+=val[idx];
                    capacity-=wt[idx];

                }else{
                    ans+=capacity*ratio[i][1];
                    capacity=0;
                    break;

                }
            
            }
            System.out.println(ans);

        }
    }
