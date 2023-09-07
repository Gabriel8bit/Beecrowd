import java.util.Scanner;
import java.io.IOException;

public class beecrowd1179 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int x;
        int[] vetorPar = new int[5];
        int[] vetorImpar = new int[5];
        int auxpar = 0;
        int auximpar = 0;

        for (int i = 0; i < 15; i++) {
            x = sc.nextInt();
            if (x % 2 == 0) {
                vetorPar[auxpar] = x;
                auxpar++;
            } else {
                vetorImpar[auximpar] = x;
                auximpar++;
            }
            if (auxpar == 5) {
                for (int j = 0; j < vetorPar.length; j++) {
                    System.out.printf("par [%d] = %d\n", j, vetorPar[j]);

                }
                auxpar = 0;
            }
            if (auximpar == 5) {
                for (int j = 0; j < vetorImpar.length; j++) {
                    System.out.printf("impar [%d] = %d\n", j, vetorImpar[j]);

                }
                auximpar = 0;
            }
        }
        for (int i = 0; i < auximpar; i++) {
            System.out.printf("impar [%d] = %d\n", i, vetorImpar[i]);
        }
        for (int i = 0; i < auxpar; i++) {
            System.out.printf("par [%d] = %d\n", i, vetorPar[i]);
        }
    }
}