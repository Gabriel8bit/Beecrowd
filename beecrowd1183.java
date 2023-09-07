import java.util.Scanner;
import java.io.IOException;

public class beecrowd1183 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int aux = 0;
        double resultado = 0;
        char O = sc.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        int j;

        for (int i = 0; i < M.length; i++) {
            for (j = 0; j < M.length; j++) {
                M[i][j] = sc.nextDouble();
            }
        }

        if (O == 'S') {
            for (int i = 0; i < M.length; i++) {
                for (j = i + 1; j < M.length; j++) {
                    resultado += M[i][j];
                }
            }
        } else if (O == 'M') {
            for (int i = 0; i < M.length; i++) {
                for (j = i + 1; j < M.length; j++) {
                    resultado += M[i][j];
                    aux++;
                }
                j = i + 1;
            }
            resultado /= aux;
        }

        System.out.printf("%.1f\n", resultado);
    }
}
