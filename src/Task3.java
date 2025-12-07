import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[5][5];

        System.out.println("Введіть 25 чисел:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Матриця:");
        print(a);

        int det = determinant(a);
        System.out.println("Визначник = " + det);
    }

    static void print(int[][] a) {
        for (int[] r : a) {
            for (int x : r) System.out.print(x + " ");
            System.out.println();
        }
    }

    static int determinant(int[][] m) {
        int n = m.length;
        if (n == 1) return m[0][0];
        if (n == 2) return m[0][0]*m[1][1] - m[0][1]*m[1][0];

        int det = 0;
        for (int k = 0; k < n; k++) {
            det += Math.pow(-1, k) * m[0][k] * determinant(minor(m, 0, k));
        }
        return det;
    }

    static int[][] minor(int[][] m, int row, int col) {
        int n = m.length;
        int[][] res = new int[n-1][n-1];
        int r = 0, c;

        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            c = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) continue;
                res[r][c++] = m[i][j];
            }
            r++;
        }
        return res;
    }
}
