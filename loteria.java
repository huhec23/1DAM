import java.io.*;
import java.util.*;

class Vehiculo {
    private String matricula;
    private String modelo;
    private List<Double> precios;

    public Vehiculo(String matricula, String modelo, List<Double> precios) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.precios = precios;
    }

    public double getMaxPrecio() {
        return precios.stream().max(Double::compare).orElse(0.0);
    }
}

public class CalculoReparacionMaxima {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader("vehiculos.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String matricula = parts[0].trim();
                String modelo = parts[1].trim();
                List<Double> precios = new ArrayList<>();
                for (int i = 2; i < parts.length; i++) {
                    precios.add(Double.parseDouble(parts[i].trim()));
                }
                vehiculos.add(new Vehiculo(matricula, modelo, precios));
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
        
        for (Vehiculo v : vehiculos) {
            System.out.println("Máximo precio de reparación: " + v.getMaxPrecio());
        }
    }
}
