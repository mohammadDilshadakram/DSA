import java.util.*;
public class keypad {
    public static void english(String digits,int index){
        if(index==digits.length()){
            return;
        }
        String[] number={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int digit=digits.charAt(index)-'0';
        System.out.print(number[digit] +" ");

        english(digits, index+1);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        english("9330071153", 0);
    }
}
