package beecrowd.ex1021;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class exercise1021 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();

        long totalCents = Math.round(n * 100);

        int[] notes = {10000, 5000, 2000, 1000, 500, 200};
        int[] coins = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int note : notes) {
            long count = totalCents / note;
            System.out.printf("%d nota(s) de R$ %.2f\n", count, note / 100.0);
            totalCents %= note;
        }

        System.out.println("MOEDAS:");
        for (int coin : coins) {
            long count = totalCents / coin;
            System.out.printf("%d moeda(s) de R$ %.2f\n", count, coin / 100.0);
            totalCents %= coin;
        }

        sc.close();

    }
}
