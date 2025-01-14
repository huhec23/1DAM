package programacion.ejercicios.estructurasbasicas;
import java.util.HashMap;
import java.util.Map;


    public class Botin {
    public static void main(String[] args) {
        System.out.println(distribuir(2, 10, 20, 50, 200, 500)); // 2 participantes
        System.out.println(distribuir(3, 50, 20, 100, 200, 500, 10, 50)); // 3 participantes
    }

    public static String distribuir(int numParticipantes, int... valoresBilletes) {
        // Mapa para almacenar el reparto de cada participante
        Map<Integer, String> asignaciones = new HashMap<>();

        for (int i = 0; i < valoresBilletes.length; i++) {
            int participante = i % numParticipantes;
            String asignacionActual = asignaciones.getOrDefault(participante, "");
            asignaciones.put(participante, asignacionActual + (asignacionActual.isEmpty() ? "" : " ") + valoresBilletes[i]);
        }

        return asignaciones.toString();
    }
}
