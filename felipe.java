package programacion.ejercicios.comparables;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Tarea {
    int prioridad;
    int duracion;

    public Tarea(int prioridad, int duracion) {
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    public String toString() {
        return "Tarea{" +
                "prioridad=" + prioridad +
                ", duracion=" + duracion +
                '}';
    }
}

public class felipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Tarea> tareitas = new ArrayList<>();

        System.out.println("Introduce el numero de tareas que tiene que realizar Felipe: ");
        while(true) {
            int tareas = sc.nextInt();
            if (tareas == 0) {
                break;
            }


            for (int i = 0; i < tareas; i++) {
                System.out.println("Introduce la prioridad y duración de la tarea " + (i + 1) + ":");
                int prior = sc.nextInt();
                int dur = sc.nextInt();
                tareitas.add(new Tarea(prior, dur));
            }


            tareitas.sort((tarea1, tarea2) -> {
                if (tarea1.prioridad != tarea2.prioridad) {
                    return Integer.compare(tarea1.prioridad, tarea2.prioridad);
                }
                return Integer.compare(tarea1.duracion, tarea2.duracion);
            });

            for (Tarea tarea : tareitas) {
                System.out.println(tarea.prioridad + " " + tarea.duracion);
            }

            System.out.println("---");
        }
    }
}
