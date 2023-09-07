import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class beecrowd2381 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List <String>names = new ArrayList<String>();
        String[] inputs = sc.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        for (int i = 0; i<n; i++) {
            names.add(sc.nextLine().trim());
        }

        Collections.sort(names);

        System.out.printf("%s\n", names.get(k-1));
        sc.close();

    }

}