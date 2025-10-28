import java.util.*;
public class min_no_with_given_digit_count_and_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=20;int d=8;
        Character arr[]=new Character[d];

        if (s>9*d || (s==0 && d>1)) {
            System.out.println("-1");
            return;
        }
        
        Arrays.fill(arr, '0');
        arr[0]='1';
        s--;
        for (int i = arr.length-1; i > 0; i--) {
            if (s>9) {
                arr[i]='9';
                s-=9;
            }else{
                arr[i]=(char)('0'+s);
                s=0;
            }
        }
        arr[0]=(char)('1'+s);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
