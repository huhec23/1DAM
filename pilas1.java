package programacion.ejercicios;
import java.util.Scanner;
import java.util.Stack;

public class pilas1 {
    public static void main(String[] args) {
        System.out.println("Bienvenid@ al programa");
        Scanner sc = new Scanner(System.in);

// Desarrollamos el algoritmo

        System.out.println("Esto es un ejemplo de cadena no equilibrada: (()()())))) ");
        System.out.println("Esto es un ejemplo de cadena bien equilibrada: ()()");
        System.out.println("Introduce una frase y el programa dira si lo que has introducido esta bien balanceado");
        String frase = sc.nextLine();
        System.out.println(verificarParentesis(frase));

    }

    public static String verificarParentesis(String frase) {
        Stack<String> pila = new Stack<String>();
        Stack<String> pila2 = new Stack<String>();
        Stack<String> pila3 = new Stack<String>();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == '(') {
                pila.push("(");
            } else if (frase.charAt(i) == ')') {
                if (!pila.isEmpty()) {
                    pila.pop();

                } else {
                    pila.push(")");
                    break;
                }
            }
            if (frase.charAt(i) == '{') {
                pila.push("{");
            } else if (frase.charAt(i) == '}') {
                if (!pila.isEmpty()) {
                    pila.pop();

                } else {
                    pila.push("}");
                    break;
                }
            }

            if (frase.charAt(i) == '[') {
                pila.push("[");
            } else if (frase.charAt(i) == ']') {
                if (!pila.isEmpty()) {
                    pila.pop();

                } else {
                    pila.push("]");
                    break;
                }
            }

        }

        if (pila.isEmpty() && pila2.isEmpty() && pila3.isEmpty()) {
            return "La frase esta equilibrada";
        } else {
            return "La frase no esta bien equilibrada";
        }

    }
}