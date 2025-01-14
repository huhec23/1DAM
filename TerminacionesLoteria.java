package programacion.ejercicios.estructurasbasicas;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TerminacionesLoteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Declaramos las variables

    System.out.println("Introduce la cantidad de boletos:");
        int cantidad = sc.nextInt();
        int[] boletos = new int[cantidad];

    System.out.println("Introduce los boletos:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Boleto " + (i + 1) + ": ");
            boletos[i] = sc.nextInt();
        }

// Mapa para contar las terminaciones

    Map<Integer, Integer> terminaciones = new HashMap<>();

// Contamos las terminaciones

        for (int boleto : boletos) {
            int terminacion = boleto % 10; // Obtenemos el último dígito
            terminaciones.put(terminacion, terminaciones.getOrDefault(terminacion, 0) + 1);
        }


        System.out.println("\nRepeticiones de cada terminación:");
        for (Map.Entry<Integer, Integer> entry : terminaciones.entrySet()) {
            System.out.println("Terminación " + entry.getKey() + ": " + entry.getValue() + " veces");
        }

        sc.close();
    }
}
