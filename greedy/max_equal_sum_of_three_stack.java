import java.util.*;
public class max_equal_sum_of_three_stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s1[]={3, 2, 1, 1, 1};
        int s2[]={2, 3, 4};
        int s3[]={1, 4, 2, 5};

        int sum1=0,sum2=0,sum3=0;
        for (int i = 0; i < s3.length; i++) {
            sum3+=s3[i];
        }
        for (int i = 0; i < s1.length; i++) {
            sum1+=s1[i];
        }
        for (int i = 0; i < s2.length; i++) {
            sum2+=s2[i];
        }

        int top1=0,top2=0,top3=0;
        while (true) {

            if (top1==s1.length || top2==s2.length || top3==s3.length) {
                System.out.println(0);
                break;
            }

            if (sum1==sum2 && sum2==sum3) {
                System.out.println(sum1);
                break;
            }

            if (sum1>=sum2 && sum1>=sum3) {
                sum1-=s1[top1++];
            } else if (sum2>=sum3 && sum2>=sum1) {
                sum2-=s2[top2++];
            }else{
                sum3-=s3[top3++];
            }
        }

    }
}
