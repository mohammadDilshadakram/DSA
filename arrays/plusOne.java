// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

import java.util.*;

public class plusOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        double number=0;
        int digits[]=new int[]{1,2,3};
        for(i=0;i<digits.length;i++){
            number=number+(Math.pow(10, digits.length-i-1)*digits[i]);
        }
        ++number;
        for(int j=0;j<digits.length;j++){
            digits[digits.length-j-1]=number%(Math.pow(10, digits.length-i-1));
        }

        for(int k=0;k<digits.length;k++){
            System.out.println(digits[k]);
        }








        
    }
}