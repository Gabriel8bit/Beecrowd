import java.util.Scanner;
import java.util.Random;

public class beecrowd1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] matriz = new double[11][11];
        Random r = new Random(100);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = r.nextDouble();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j]);
            }
            System.out.println();
        }
    }
}