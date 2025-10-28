import java.util.*;
public class min_no_of_coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=121;
        int count=0;
        Integer currency[]={1, 2, 5, 10};
        Arrays.sort(currency,Comparator.reverseOrder());
        for (int i = 0; i < currency.length; i++) {
            int price=currency[i];
            while (n>=price) {
                n-=price;
                count++;
            }
        }
        System.out.println(count);
    }
}
