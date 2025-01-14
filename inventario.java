package programacion.ejercicios.comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Objeto {
    String nombre;
    int valor;
    int peso;
    int orden;

    public Objeto(String nombre, int valor, int peso, int orden) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
        this.orden = orden;
    }
}

public class inventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce el número de objetos encontrados en la tumba (0 para terminar): ");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            ArrayList<Objeto> objetos = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.print("Introduce el nombre, valor histórico y peso del objeto " + (i + 1) + ": ");
                String nombre = scanner.next();
                int valor = scanner.nextInt();
                int peso = scanner.nextInt();
                objetos.add(new Objeto(nombre, valor, peso, i));
            }

            Collections.sort(objetos, new Comparator<Objeto>() {
                public int compare(Objeto o1, Objeto o2) {
                    if (o1.valor != o2.valor) {
                        return o2.valor - o1.valor;
                    } else if (o1.peso != o2.peso) {
                        return o1.peso - o2.peso;
                    } else {
                        return o1.orden - o2.orden;
                    }
                }
            });

            System.out.println("Orden de extracción de objetos:");
            for (int i = 0; i < objetos.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(objetos.get(i).nombre);
            }
            System.out.println();
        }

        scanner.close();
    }
}
