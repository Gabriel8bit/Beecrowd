import java.io.IOException;
import java.util.Scanner;

public class beecrowd1160 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int years = 0;
            int populationA = sc.nextInt();
            int populationB = sc.nextInt();
            double growthRateA = sc.nextDouble();
            double growthRateB = sc.nextDouble();

            while (populationA <= populationB) {
                populationA += (int) (populationA * (growthRateA / 100));
                populationB += (int) (populationB * (growthRateB / 100));
                years++;

                if (years > 100) {
                    break;
                }
            }

            if (years > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(years + " anos.");
            }
        }
    }
}
