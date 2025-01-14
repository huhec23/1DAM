package programacion.ejercicios.flujos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenid@ al programa");

// Declaramos variables.

    int numero = 0;
    List<Integer> numeros = new ArrayList<>();

    System.out.println("Introduce numeros, cuando se introduzca un numero negativo se dejara de pedir entradas al usuario");
    while(true){
        if(numero >= 0){
            numero = sc.nextInt();
            numeros.add(numero);
            System.out.println("Introduce otro numero: ");

        }else{
            break;
        }
    }

    List<Integer> numerosfiltrados =  numeros.stream()
            .filter(n -> n>=1 && n<=5)
            .toList();

    System.out.println(numerosfiltrados);





    }
}
