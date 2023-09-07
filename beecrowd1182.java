import java.io.IOException;
import java.util.Scanner;

public class beecrowd1182 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        double soma = 0;
        char T = sc.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = sc.nextDouble();
            }
        }

        for (int j = 0; j < M.length; j++) {
            soma = soma + M[j][L];
        }
        if (T == 'M')
            soma = soma / M.length;
        System.out.printf("%.1f\n", soma);
    }
}