import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = 5;
        double[][] arr = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rnd.nextDouble() * 10;
            }
        }

        System.out.println("Початкова матриця:");
        print(arr);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                arr[i][j] = 0;
            }
        }

        System.out.println("\nПісля заміни:");
        print(arr);
    }

    static void print(double[][] arr) {
        for (double[] row : arr) {
            for (double x : row) {
                System.out.printf("%.2f ", x);
            }
            System.out.println();
        }
    }
}