import java.util.*;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string");
        str = sc.nextLine();
        int i, count = 0;
        char c;
        for (i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
                    || c == 'u') {
                if (Character.isLowerCase(c)) {
                    count++;
                }
            }

        }

        System.out.println("total number of times lower case vowel is"+count);
        sc.close();
    }
    
}
