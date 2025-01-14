package programacion.ejercicios.estructurasbasicas;
import java.io.*;
import java.util.*;

class Anagramas {
    public static void main(String[] args) throws IOException {
        Map<String, List<String>> anagramas = new HashMap<>();

        BufferedReader reader = new BufferedReader(new FileReader("/home/hecgoznos/Documentos/anagramas.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String word = palabra(line);
            anagramas.computeIfAbsent(word, _ -> new ArrayList<>()).add(line);
        }
        reader.close();

        // Pedir al usuario el tamaño mínimo del grupo

        Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el tamaño mínimo del grupo:");
            int minGroupSize = sc.nextInt();
        sc.close();

        // Imprimir grupos que cumplen el tamaño mínimo

        for (Map.Entry<String, List<String>> entrada : anagramas.entrySet()) {
            if (entrada.getValue().size() >= minGroupSize) {
                System.out.println(entrada.getValue());
            }
        }
    }

    // Metodo para ordenar las letras
    private static String palabra(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
