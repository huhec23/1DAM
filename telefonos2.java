package programacion.ejercicios.estructurasbasicas;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class telefonos2 {
    public static void main(String[] args) {
        System.out.println("Bienvenid@ al programa");
        Scanner sc = new Scanner(System.in);

// Declaramos variables.

        HashMap<String, ArrayList<String>> agenda = getStringArrayListHashMap();

        System.out.println("Listado completo de claves");
        for (String clave : agenda.keySet())
            System.out.print(clave + "-");
        System.out.println();


        System.out.println("Introduce un nombre de contacto y el programa mostrara sus numero de telefono");
        String nom = sc.nextLine().toUpperCase();

        if(agenda.containsKey(nom)){
            System.out.println("Los numeros disponibles son " + agenda.get(nom));
        }else {
            System.out.println("El nombre introducido no esta en la base de datos");
        }
    }

    private static HashMap<String, ArrayList<String>> getStringArrayListHashMap() {
        HashMap<String, ArrayList<String>> agenda = new HashMap<>();
        ArrayList<String> telefonos = new ArrayList<>();

        telefonos.add("610058849");
        telefonos.add("635486818");
        agenda.put("HECTOR", telefonos);

        telefonos = new ArrayList<>();

        telefonos.add("94884");
        telefonos.add("34535");
        agenda.put("GABRIEL", telefonos);

        telefonos = new ArrayList<>();

        telefonos.add("964050678");
        telefonos.add("667890656");
        agenda.put("IAN", telefonos);
        return agenda;
    }


}
