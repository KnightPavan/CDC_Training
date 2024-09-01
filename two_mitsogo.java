import java.util.*;
public class two_mitsogo {
    public static int countInvertedTriangles(int input1, int input2, int[][] input3) {
        int row = input1;
        int cols = input2;
        int[][] dp = new int[row][cols];
        int count = 0;

        for (int i = row - 1; i >= 0; i--) {
            for (int j = 0; j < cols; j++) {
                if (input3[i][j] == 1) {
                    if (i == row - 1) {
                        dp[i][j] = 1; // Base case for the bottom row
                    } else {
                        int left = (j > 0) ? dp[i + 1][j - 1] : 0;
                        int down = dp[i + 1][j];
                        int right = (j < cols - 1) ? dp[i + 1][j + 1] : 0;
                        dp[i][j] = 1 + Math.min(down, Math.min(left, right));
                    }
                    count += dp[i][j];
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example input
        int input1 = 4;
        int input2 = 4;
        int[][] input3 = {
                {1, 0, 1, 0},
                {1, 0, 0, 0},
                {1, 0, 0, 0},
                {1, 1, 0, 0}
        };

        // Calculate the number of inverted right-angled triangles
        int result = countInvertedTriangles(input1, input2, input3);
        System.out.println(result); // Output should be 5
    }
}