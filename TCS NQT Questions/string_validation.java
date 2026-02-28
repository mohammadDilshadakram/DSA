import java.util.*;
public class string_validation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of S");
        String s=sc.nextLine();//###**
        int star=0,hash=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='*'){
                star++;
            }if(ch=='#'){
                hash++;
            }
        }
        System.out.println(star-hash);

    }
}
