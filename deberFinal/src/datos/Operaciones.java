package datos;

import java.util.ArrayList;
import java.util.Random;
import objetos.Estudiante;

public class Operaciones {

    public static final String NOMBRE = "Estudiante";
    public static final String ENCABEZADO = "NOMBRES;FOR1;CHA1;VID1;TRA1;PRE1;FOR2;CHA2;VID2;TRA2;PRE2;FIN1;FIN2;TOTAL;ALERTA;PROMOCION";
    public static final double MAXPRE = 14;
    public static final double MAXACTIVIDADES = 1;
    public static final double MAXTRABAJOS = 6;

    // metodo para dar numeros aleatorios (
    public static double numAle(double maxNum) {
        return Math.random() * maxNum;
    }

    // metodo para generar valores de la clase estudiantes.
    public static ArrayList<Estudiante> generarValores(int numEstudiantes) {
        // creamos un ArrayList deestudiantes 
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        for (int i = 0; i < numEstudiantes; i++) {
            estudiantes.add(new Estudiante(String.format("%s %d", NOMBRE, i + 1), numAle(MAXACTIVIDADES), numAle(MAXACTIVIDADES), numAle(MAXACTIVIDADES), numAle(MAXTRABAJOS), numAle(MAXPRE), numAle(MAXACTIVIDADES), numAle(MAXACTIVIDADES), numAle(MAXACTIVIDADES), numAle(MAXTRABAJOS), numAle(MAXPRE)));

        }
        return estudiantes;

    }
    public static double decimal(String numero){
        double num=0;
        numero = numero.replace(",", ".");
        try {
          num =  Double.parseDouble(numero);
        } catch (Exception e) {
            System.out.println("Error al convertir decimal");
        }
        return num;
    }
    
}
