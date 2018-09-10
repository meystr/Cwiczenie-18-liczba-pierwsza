//18. Napiszcie program, który sprawdzi czy podana liczba jest liczbą pierwszą
// (tj. dzieli się tylko przez 1 i samą siebie).
package pl.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę całkowitą: ");
        Scanner sc = new Scanner(System.in);
        int primeNumber = sc.nextInt();

        if (primeNumber <= 1) {
            System.out.println("Błędna liczbna!!!");
        } else {
            for (int i = 1; i <= primeNumber; i++) {
                if (primeNumber % i == 0) {
                    System.out.println("Liczba " + primeNumber + " nie jest liczbą pierwszą");
                break;
                } else {
                    System.out.println("Liczba " + primeNumber + " jest liczbą pierwszą");
                    break;
                }
            }
        }
    }
}


