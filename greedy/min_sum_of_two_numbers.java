import java.util.*;
public class min_sum_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={5, 3, 0, 7, 4};
        int num1=0;
        int num2=0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                num1=num1*10+arr[i];
            }else{
                num2=num2*10+arr[i];
            }
        }
        System.out.println(num1);
        System.out.println(num2);

        System.out.println(num1+num2);
    }
}
