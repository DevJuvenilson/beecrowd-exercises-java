package beecrowd.ex2473;

import java.util.Scanner;
import java.io.IOException;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int[] drawnNumbers = new int[6];
        int[] betNumbers = new int[6];

        for (int i = 0; i < 6; i++) {
            drawnNumbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            betNumbers[i] = scanner.nextInt();
        }

        int count = 0;

        for (int drawnNumber : drawnNumbers) {
            for (int betNumber : betNumbers) {
                if (betNumber == drawnNumber){
                    count++;
                }
            }
        }

        if (count == 6) {
            System.out.println("sena");
        } else if (count == 5) {
            System.out.println("quina");
        } else if (count == 4) {
            System.out.println("quadra");
        } else if (count == 3) {
            System.out.println("terno");
        } else {
            System.out.println("azar");
        }

        scanner.close();
    }
}
