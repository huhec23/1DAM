package programacion.ejercicios.estructurasbasicas;
import java.util.HashMap;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args){
        System.out.println("Bienvenid@ al programa");
        Scanner sc = new Scanner(System.in);

// Declaramos las variables.

    HashMap<String, Integer> tlf = new HashMap<>();
        tlf.put("HECTOR", 610058849);
        tlf.put("GABRIEL", 635486818);
        tlf.put("DEUSDAD", 964050678);
        tlf.put("IAN", 667890656);
        tlf.put("DAVID", 964556689);

    System.out.println("Listado completo de claves");
        for (String clave : tlf.keySet())
            System.out.print(clave + "-");
        System.out.println();

    System.out.println("Introduce un nombre de contacto y el programa mostrara su numero de telefono");
    String nom = sc.nextLine().toUpperCase();

        if(tlf.containsKey(nom)){
            System.out.println("El numero es " + tlf.get(nom));
        }else {
            System.out.println("El nombre introducido no esta en la base de datos");
        }

    }
}
