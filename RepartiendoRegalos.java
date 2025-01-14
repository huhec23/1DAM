package programacion.ejercicios.estructurasbasicas;
import java.util.ArrayList;
import java.util.Scanner;

public class RepartiendoRegalos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mensaje de bienvenida
        System.out.println("Bienvenid@ al programa de reparto de regalos de Papá Noel.");

        // Solicitar portal inicial
        System.out.print("¿En qué portal aterriza Papá Noel? ");
        int portalInicio = sc.nextInt();

        // Pedir la cantidad de portales
        System.out.print("¿Cuántos portales va a visitar Papá Noel? ");
        int cantidadPortales = sc.nextInt();

        // Lista para guardar los portales
        ArrayList<Integer> portales = new ArrayList<>();
        System.out.println("Introduce los números de los portales:");
        for (int i = 0; i < cantidadPortales; i++) {
            System.out.print("Portal " + (i + 1) + ": ");
            portales.add(sc.nextInt());
        }

        // Mostrar los portales a visitar
        System.out.println("Papá Noel visitará los siguientes portales: " + portales);

        // Determinar el orden de visita
        ArrayList<Integer> ordenVisita = calcularOrden(portales, portalInicio);

        // Mostrar el orden final
        System.out.println("El orden en que visitará los portales es: " + ordenVisita);
    }

    public static ArrayList<Integer> calcularOrden(ArrayList<Integer> portales, int portalInicio) {
        ArrayList<Integer> orden = new ArrayList<>();
        while (!portales.isEmpty()) {
            int masCercano = -1;
            int distanciaMinima = Integer.MAX_VALUE;

            // Buscar el portal más cercano
            for (int portal : portales) {
                int distancia = Math.abs(portal - portalInicio);
                if (distancia < distanciaMinima || (distancia == distanciaMinima && portal > masCercano)) {
                    masCercano = portal;
                    distanciaMinima = distancia;
                }
            }

            // Añadir el más cercano al orden y eliminarlo de los restantes
            orden.add(masCercano);
            portales.remove(Integer.valueOf(masCercano));
            portalInicio = masCercano;
        }

        return orden;
    }
}
