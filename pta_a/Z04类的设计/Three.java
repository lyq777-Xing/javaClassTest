package Z04类的设计;

import java.util.Scanner;

/**
 * @author lyq
 * @time 2023/12/7 23:31
 */
public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n-1; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println(arr[j][i]);
        }
    }
}
