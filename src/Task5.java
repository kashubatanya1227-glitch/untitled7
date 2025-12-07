import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Введіть розмір матриці: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int[][] t = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rnd.nextInt(10);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[j][i] = a[i][j];
            }
        }

        System.out.println("Початкова матриця:");
        print(a);

        System.out.println("\nТранспонована матриця:");
        print(t);
    }

    static void print(int[][] a) {
        for (int[] row : a) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}
