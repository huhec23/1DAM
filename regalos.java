package programacion.ejercicios.comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Niño {
    int bondad;
    int peso;

    public Niño(int bondad, int peso) {
        this.bondad = bondad;
        this.peso = peso;
    }
}

public class regalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce el número de niños (0 para terminar): ");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            ArrayList<Niño> niños = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.print("Introduce la bondad y el peso del niño " + (i + 1) + ": ");
                int bondad = scanner.nextInt();
                int peso = scanner.nextInt();
                niños.add(new Niño(bondad, peso));
            }

            Collections.sort(niños, new Comparator<Niño>() {
                public int compare(Niño n1, Niño n2) {
                    if (n1.bondad != n2.bondad) {
                        return n2.bondad - n1.bondad;
                    } else {
                        return n1.peso - n2.peso;
                    }
                }
            });

            System.out.println("Orden de reparto de regalos:");
            for (Niño niño : niños) {
                System.out.println(niño.bondad + " " + niño.peso);
            }
            System.out.println();
        }

        scanner.close();
    }
}
