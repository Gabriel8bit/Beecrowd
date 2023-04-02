import java.util.Scanner;
import java.util.Random;

public class matriz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Linhas: ");
        int linhas = sc.nextInt();
        System.out.println("Colunas: ");
        int colunas = sc.nextInt();
        int[][] m = declararMatriz(linhas, colunas);

        imprimir(m);
    }

    public static int[][] declararMatriz(int linhas, int colunas) {
        Random r = new Random();
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(101);
            }
        }
        return matriz;
    }

    public static void imprimir(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%5d ", m[i][j]);
            }
            System.out.println();
        }
    }

}