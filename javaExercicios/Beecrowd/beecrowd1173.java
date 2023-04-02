package Beecrowd;

import java.util.Scanner;

public class beecrowd1173 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        int aux = 2;
        n[0] = sc.nextInt();
        for (int i = 1; i < n.length; i++) {
            n[i] = aux * n[0];
            aux *= 2;
        }
        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[%d] = %d\n", i, n[i]);
        }
    }

}