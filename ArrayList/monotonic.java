import java.util.ArrayList;

public class monotonic {

    public static boolean mono(ArrayList<Integer> arr) {
        if (arr.size() <= 1) {
            return true; // A list with 0 or 1 element is monotonic by definition
        }

        int a = 0;

        // Determine the trend of the list by comparing the first two different elements
        while (a < arr.size() - 1 && arr.get(a) == arr.get(a + 1)) {
            a++;
        }

        if (a == arr.size() - 1) {
            return true; // All elements are the same
        }

        boolean increasing = arr.get(a) < arr.get(a + 1);

        if (increasing) {
            for (int i = a + 1; i < arr.size() - 1; i++) {
                if (arr.get(i) > arr.get(i + 1)) {
                    return false;
                }
            }
        } else {
            for (int i = a + 1; i < arr.size() - 1; i++) {
                if (arr.get(i) < arr.get(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
        System.out.println(mono(arr)); // Output should be true

        arr = new ArrayList<>(Arrays.asList(3, 2, 2, 1));
        System.out.println(mono(arr)); // Output should be true

        arr = new ArrayList<>(Arrays.asList(1, 3, 2));
        System.out.println(mono(arr)); // Output should be false
    }
}
