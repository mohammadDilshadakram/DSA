import java.util.*;
public class validAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="care";
        String t="race";
        if (s.length()!=t.length()) {
            System.out.println("False");
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);

        }
        for (int i = 0; i < t.length(); i++) {
            char ch=t.charAt(i);
            if (map.get(ch)!=null) {
                if (map.get(ch)==1) {
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch)-1);
                }
            }else{
                System.out.println("False");
            }
        }
        System.out.println(map.isEmpty());
    }
}
