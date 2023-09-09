import java.io.IOException;
import java.util.Scanner;

public class beecrowd1541 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A, B, C, X;

        while (true) {
            A = sc.nextInt();

            if (A == 0) {
                break; // Saia do loop quando encontrar um valor igual a 0
            }

            B = sc.nextInt();
            C = sc.nextInt();

            // Calcule o tamanho mínimo do terreno com base na área da casa e no percentual
            // máximo permitido
            X = (int) Math.sqrt((A * B * 100) / C);

            System.out.println(X);
        }
    }
}
