package programacion.ejercicios.estructurasbasicas;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Altura {
    public static void main(String[] args) {
        System.out.println("Bienvenid@ al programa");

        // Declaramos variables.
        ArrayList<Double> alturas = new ArrayList<>();

        // Obtenemos el número de alumnos.
        int alum = numeroAlumnos();

        // Leemos las alturas.
        leerAlturas(alturas, alum);

        // Mostramos las alturas ingresadas.
        System.out.println("Alturas ingresadas: " + alturas);

        // Media e altura de los alumnos-
        double media = calcularMedia(alturas, alum);
        System.out.println("La media de altura de la clase es " + calcularMedia(alturas, alum) + " cm");
        System.out.println("La cantidad de alumnos que superan la altura media de la clase es de : " + calcularAlumnosAlturaSuperior(media,alturas));
        System.out.println("La cantidad de alumnos que no superan la altura media de la clase es de : " + calcularAlumnosAlturaInferior(media,alturas));
        System.out.print(alturas);

    }

    public static int numeroAlumnos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de alumnos que hay en la clase: ");
        int alum = sc.nextInt();
        System.out.println("Perfecto, la clase tiene " + alum + " alumnos");
        return alum; // Devuelve el número de alumnos
    }

    public static void leerAlturas(ArrayList<Double> alturas, int alum) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las alturas de los alumnos en centimetros: ");
        for (int i = 0; i < alum; i++) {
            System.out.print("Altura del alumno " + (i + 1) + ": ");
            double altura = sc.nextDouble();
            alturas.add(altura); // Añade la altura a la lista
        }
    }

    public static double calcularMedia(ArrayList<Double> alturas, int alum){
        double suma = 0;
            for(Double alturaz : alturas){
            suma += alturaz;
            }
            double media = suma/alum;
            return media;
    }

    public static int calcularAlumnosAlturaSuperior(double media, ArrayList<Double> alturas){
        int cont = 0;
        for(Double altmax : alturas){
            if(altmax>media){
               cont++;
            }
        }
        return cont;

    }

    public static int calcularAlumnosAlturaInferior(double media, ArrayList<Double> alturas){
        int cont = 0;
        for(Double altmax : alturas){
            if(altmax<media){
                cont++;
            }
        }
        return cont;
    }
}

