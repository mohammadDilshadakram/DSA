import java.util.*;

public class knight {

    // Method to print the board
    public static void printArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to check if the move is valid
    public static boolean isValid(int arr[][], int x, int y) {
        int n = arr.length;
        return x >= 0 && x < n && y >= 0 && y < n && arr[x][y] == 0;
    }

    // Method to solve the Knight's Tour problem
    public static void maze(int arr[][], int i, int j, int digit) {
        int n = arr.length;

        // Base case: If all cells are visited, print the board
        if (digit == n * n) {
            printArr(arr);
            return;
        }

        // Knight moves: directly specified
        int[] dx = {1, 1, 2, 2, -1, -1, -2, -2};
        int[] dy = {2, -2, 1, -1, 2, -2, 1, -1};

        for (int k = 0; k < 8; k++) {
            int nextX = i + dx[k];
            int nextY = j + dy[k];

            if (isValid(arr, nextX, nextY)) {
                arr[nextX][nextY] = digit + 1; // Mark the move
                maze(arr, nextX, nextY, digit + 1); // Recursive call
                arr[nextX][nextY] = 0; // Backtrack
            }
        }
    }

    public static void main(String[] args) {
        int n = 5; // Size of the board
        int arr[][] = new int[n][n];
        arr[0][0] = 1; // Starting position of the knight
        maze(arr, 0, 0, 1);
    }
}
