import java.util.Scanner;

public class beecrowd1180 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tamanho = sc.nextInt();
        int[] n = new int[tamanho];
        int menor = 0;
        int posicao = 0;

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        for (int i = 0; i < n.length; i++) {
            if (i == 0) {
                menor = n[i];
                posicao = i;

            } else if (n[i] < menor) {
                menor = n[i];
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posiçao: " + posicao);
    }
}