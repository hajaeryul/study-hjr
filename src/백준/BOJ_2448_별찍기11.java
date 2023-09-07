package 백준;
// BOJ_2448_별찍기11

import java.util.Scanner;

public class BOJ_2448_별찍기11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        char[][] starPattern = createStarPattern(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                System.out.print(starPattern[i][j]);
            }
            System.out.println();
        }
    }

    private static char[][] createStarPattern(int n) {
        char[][] pattern = new char[n][n * 2 - 1];

        for (int i = 0; i < n; i++) {
            // 왼쪽 공백
            for (int j = 0; j < n - i - 1; j++) {
                pattern[i][j] = ' ';
            }
            // 별
            for (int j = n - i - 1; j < n + i; j++) {
                pattern[i][j] = '*';
            }
            // 오른쪽 공백
            for (int j = n + i; j < n * 2 - 1; j++) {
                pattern[i][j] = ' ';
            }
        }
        return pattern;
    }
}
