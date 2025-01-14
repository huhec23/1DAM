package programacion.ejercicios.estructurasbasicas;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequenzy {
    public static void main(String[] args){
        System.out.println("Bienvenid@ al programa");
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> frecuencia = new HashMap<>();

        System.out.println("Introduce palabras separadas por espacios. Deja una línea en blanco para finalizar:");

        while (true) {
            String linea = sc.nextLine().trim();

            if (linea.isEmpty()) {
                break;
            }

            String[] palabras = linea.split("\\s+");
            for (String palabra : palabras) {
                frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
            }
        }

        System.out.println("\nFrecuencia de palabras:");
        for (Map.Entry<String, Integer> entrada : frecuencia.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }

        sc.close();
    }
}


