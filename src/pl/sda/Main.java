//18. Napiszcie program, który sprawdzi czy podana liczba jest liczbą pierwszą
// (tj. dzieli się tylko przez 1 i samą siebie).
package pl.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę całkowitą: ");
        Scanner sc = new Scanner(System.in);
        int primeNumber = sc.nextInt();

        if (primeNumber <= 1) System.out.println("Błędna liczbna!!!");
            for (int i = 1;i <= primeNumber ;i++ ) {
                if (primeNumber % i == 0) {
                    System.out.println("Liczba " + primeNumber + " nie jest liczbą pierwszą");

            } else {
                        System.out.println("Liczba " + primeNumber +" jest liczbą pierwszą");
                        break;
                    }
                }
            }
            //System.out.println(numOfDividers);
        }

