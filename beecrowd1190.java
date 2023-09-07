import java.util.Scanner;
import java.io.IOException;

public class beecrowd1190 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        char O = sc.next().toUpperCase().charAt(0);
        double M[][] = new double[12][12];
        double soma = 0;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (j > i && j > M.length - i - 1)
                    soma += M[i][j];

            }
        }
        if (O == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (O == 'M') {
            soma /= 30;
            System.out.printf("%.1f\n", soma);
        }

    }
}