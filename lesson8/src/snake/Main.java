package snake;

public class Main {

    public static void main(String[] args) {

        int s = 5; // Введите любое значение (Определяет велечину массива)

        int m = s * s;
        int r = 4;
        int[] x = new int[r];
        int[] y = new int[r];
        int[][] arr = new int[s][s];

        for (int i = 0; i < r; i++) {
            x[i] = y[i] = 0;
        }
        x[1] = y[1] = s - 1;
        x[3] = 1;

        for (int i = 0; i < m; i++) {
            arr[x[2]][y[2]] = i + 1;
            x[2] = x[2] + x[3];
            y[2] = y[2] + y[3];
            if (y[3] == 0) {
                if ((x[2] > x[0]) && (x[3] > 0)) {
                    x[3] = 1;
                }
                if ((x[2] < x[1]) && (x[3] < 0)) {
                    x[3] = -1;
                }
                if ((x[2] == x[1]) && (x[3] > 0)) {
                    x[3] = 0; x[1]--; y[3] = 1;
                }
                if ((x[2] == x[0]) && (x[3] < 0)) {
                    x[3] = 0; x[0]++; y[3] = -1;
                }
            }
            if (x[3] == 0) {
                if ((y[2] > y[0]) && (y[3] > 0)) {
                    y[3] = 1;
                }
                if ((y[2] < y[1]) && (y[3] < 0)) {
                    y[3] = -1;
                }
                if ((y[2] == y[1]) && (y[3] > 0)) {
                    y[3] = 0; y[1]--; x[3] = -1;
                }
                if ((y[2] == x[0]) && (y[3] < 0)) {
                    y[3] = 0; y[0]++; x[3] = 1;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.format("%4d", arr[j][i]);
            }
            System.out.println();
        }
    }
}
