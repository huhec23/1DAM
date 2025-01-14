package programacion.ejercicios.estructurasbasicas;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class PaisCapital {
    public static void main(String[] args){
        Map<String, String> capital = new HashMap<>();
        capital.put("FRANCIA", "PARIS");
        capital.put("PORTUGAL", "LISBOA");
        capital.put("ESPAÑA", "MADRID");
        capital.put("ALEMANIA", "BERLIN");
        capital.put("ITALIA", "ROMA");

        Scanner sc = new Scanner(System.in);

// Desarrollamos el algoritmo.

        System.out.println("Listado completo de valores");
        for (String valor : capital.values())
            System.out.print(valor + "-");
        System.out.println();

        System.out.println("Listado completo de claves");
        for (String clave : capital.keySet())
            System.out.print(clave + "-");
        System.out.println();

        System.out.println("Introduce un pais europeo y si esta disponible el programa te dira su capital ");
        String res = sc.nextLine().toUpperCase();

        if(capital.containsKey(res)){
            System.out.println("La capital es " + capital.get(res));
        }else{
            System.out.println("El pais introducido no esta disponible");
        }
    }
}
