import java.util.*;

public class find_permutation_in_string {

    static boolean isSame(int arr1[], int arr2[]) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String s1 = "ab", s2 = "eidboooo";
        int freq[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            freq[ch - 'a']++;
        }

        int winLen = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            int winIdx = 0;
            int idx = i;
            int winFreq[] = new int[26];
            while (winIdx < winLen && idx < s2.length()) {
                char ch = s2.charAt(idx);
                winFreq[ch - 'a']++;
                winIdx++;
                idx++;
            }

            if (isSame(freq, winFreq)) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");

    }
}
