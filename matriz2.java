import java.util.Scanner;
import java.util.Random;

public class matriz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas = sc.nextInt();
        int colunas = sc.nextInt();

        int[][] m = gerarMatriz(linhas, colunas);
        imprimir(m);
        int maior = maiorElemento(m);
        System.out.println("O maior número é : " + maior);
    }

    public static int[][] gerarMatriz(int linhas, int colunas) {
        Random r = new Random();
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[1].length; j++) {
                matriz[i][j] = r.nextInt(100);

            }
        }
        return matriz;
    }

    public static void imprimir(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[1].length; j++) {
                System.out.printf("%5d", m[i][j]);

            }
            System.out.println();
        }
    }

    public static int maiorElemento(int[][] m) {
        int maior = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[1].length; j++) {
                if (maior < m[i][j]) {

                    maior = m[i][j];
                }
            }
        }
        return maior;
    }
}