import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        
       
        System.out.println("Enter first string");
        str1 = sc.nextLine();
        System.out.println("Enter second string");
        str2 = sc.nextLine();
        // Remove any whitespace and convert strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        char char1[]=new char[str1.length()];
        char char2[]=new char[str2.length()];
        if (str1.length() == str2.length()) {

            char1 = str1.toCharArray();
            char2 = str2.toCharArray();
            Arrays.sort(char2);
            Arrays.sort(char1);

            if (Arrays.equals(char1, char2)) {
                System.out.println("the given strings are anagram");
            } else {
                System.out.println("The given strings are not anagram");
            }
        }
        else{
            System.out.println("The given strings are not anagram");
        }
        sc.close();

    }
}
