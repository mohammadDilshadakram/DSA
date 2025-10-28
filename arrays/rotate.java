import java.util.*;

public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, k, j, r = 0;
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        int nums[] = new int[n];
        int newNum[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter the elemnts in an array");
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the index to around to pivot");
        k = sc.nextInt();

        for (j = 0; j < n - k; j++) {
            newNum[j] = nums[k + j];
        }

        // for(int m=k+1;m<n;m++){

        // newNum[m]=nums[r];
        // r++;

        // }

        for (int m = n - k; m < n; m++) {
            newNum[m] = nums[m - (n - k)];
        }

        // printing the pivoted array

        for (int q = 0; q < n; q++) {
            System.out.print(newNum[q] + ",");
        }

    }
}
