import java.util.Scanner;

public class rat {

    public static boolean isSafe(int arr[][], int i, int j) {
        if (i >= 0 && i < arr.length && j >= 0 && j < arr[0].length && arr[i][j] != 0) {
            return true;
        }
        return false;
    }

    public static boolean maze(int arr[][], int i, int j, int n, int m, int path[][]) {
        if (i == m - 1 && j == n - 1) {
            path[i][j] = 1;  // Mark the destination cell
            return true;
        }
        if (isSafe(arr, i, j)) {
            path[i][j] = 1;  // Mark this cell as part of the path

            // Move down
            if (maze(arr, i + 1, j, n, m, path)) {
                return true;
            }
            // Move right
            if (maze(arr, i, j + 1, n, m, path)) {
                return true;
            }
            // Move up
            if (maze(arr, i - 1, j, n, m, path)) {
                return true;
            }
            // Move left
            if (maze(arr, i, j - 1, n, m, path)) {
                return true;
            }

            // If none of the above movements work, unmark this cell as part of the path
            path[i][j] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3, m = 3;
        int arr[][] = new int[n][m];

        // Initialize the maze with 1s (open path)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = 1;
            }
        }

        // Mark some cells as blocked (0s) for testing
        arr[1][1] = 0;

        int path[][] = new int[n][m];
        if (maze(arr, 0, 0, n, m, path)) {
            System.out.println("Path found:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(path[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No path found");
        }

        sc.close();
    }
}
