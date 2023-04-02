import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        verificarParidade(5);
        boolean imprimir = verificarParidade(0);

    }

    public static boolean verificarParidade(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}