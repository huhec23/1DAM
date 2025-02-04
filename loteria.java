package programacion.ejercicios.comparables;
import java.util.Scanner;

public class loteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de localidades que participan en la loteria ");
        while (true) {
            int participantes = sc.nextInt();
            if (participantes == 0) {
                break;
            }

            double[] rango = new double[participantes];
            boolean esJusta = true;

            System.out.println("Ahora, introduce el dinero invertido por cada localidad seguido de los premios obtenidos" );
            for (int i = 0; i < participantes; i++) {
                int dineroInvertido = sc.nextInt();
                int premiosObtenidos = sc.nextInt();

                if (dineroInvertido == 0) {
                    rango[i] = 0;
                } else {
                    rango[i] = (double) premiosObtenidos / dineroInvertido;
                }

                if (i > 0 && rango[i] != rango[0]) {
                    esJusta = false;
                }
            }

            System.out.println(esJusta ? "SI" : "NO");
        }

        sc.close();

    }
}

