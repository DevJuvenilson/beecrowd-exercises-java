package beecrowd.ex1001;

import java.io.IOException;
import java.util.Scanner;

public class exercise1001 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a + b;

        System.out.println("X = " + x);

        sc.close();

    }

}
