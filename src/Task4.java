import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Введіть розмір матриці: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rnd.nextInt(10);
            }
        }

        System.out.println("Матриця:");
        print(a);

        System.out.print("Індекс рядка для мінору: ");
        int r = sc.nextInt();
        System.out.print("Індекс стовпця для мінору: ");
        int c = sc.nextInt();

        int[][] minor = minor(a, r, c);

        System.out.println("Мінор:");
        print(minor);
    }

    static void print(int[][] a) {
        for (int[] row : a) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
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