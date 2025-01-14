package programacion.ejercicios.estructurasbasicas;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Coches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenid@ al programa");

// Declaramos variables.

        ArrayList<String> coches = new ArrayList<String>();
        System.out.println("Introduce marcas de coche: ");

        while (true) {
            String marca = sc.nextLine();
            if (marca.isBlank()) {
                break;
            }
            coches.add(marca);
        }
        Collections.sort(coches);

        System.out.println("Marcas de coches ordenadas:");
        for (String marca : coches) {
            System.out.println(marca);
        }
    }
}