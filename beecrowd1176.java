import java.util.Scanner;

public class beecrowd1176 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, finobacci;
        long fib[] = new long[61];
        n = sc.nextInt();

        fib[0] = 0;
        fib[1] = 1;
        for(int j = 2; j <= 60; j++){
            fib[j] = fib[j-2] + fib[j-1];
        }

        for(int i = 0; i < n; i++){
            finobacci = sc.nextInt();
            System.out.printf("Fib(%d) = %d\n", finobacci, fib[finobacci]);
        }
    }
}