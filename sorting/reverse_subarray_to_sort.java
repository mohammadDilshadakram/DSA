import java.util.*;

public class reverse_subarray_to_sort {

    public static void reverse(int arr[], int sp, int ep) {
        while (sp < ep) {
            int t = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = t;
            sp++;
            ep--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 5, 4, 3};

        int n = arr.length;
        int i = 0;
        int sp = -1;
        int ep = -1;
        // step1-find the first decreasing element from the left side

        for (i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sp = i;
                break;
            }
        }
        for (i = n - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                ep = i;
                break;
            }
        }
        reverse(arr, sp, ep);
        int flag = 1;
        for (int m = 0; m < arr.length-1; m++) {
            if (arr[m] > arr[m + 1]) {
                flag = 0;

            }
        }
        if (flag == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
