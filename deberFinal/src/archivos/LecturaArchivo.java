package archivos;

import datos.Operaciones;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import objetos.Estudiante;

public class LecturaArchivo {
// private Scanner global

    private Scanner archivo;

    public LecturaArchivo(String nArchivo) {
        try {
            this.archivo = new Scanner(new File(nArchivo));
        } catch (Exception e) {
            System.out.println("Error al cargar el archivo");
        }

    }

    public ArrayList<Estudiante> obtenerEstudiantes() {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        int numLinea = 0;
        while (archivo.hasNext()) {
            String[] linea = archivo.nextLine().split(";");
            if (numLinea != 0) {
                estudiantes.add(new Estudiante(linea[0], Operaciones.decimal(linea[1]), Operaciones.decimal(linea[2]), Operaciones.decimal(linea[3]), Operaciones.decimal(linea[4]), Operaciones.decimal(linea[5]), Operaciones.decimal(linea[6]), Operaciones.decimal(linea[7]), Operaciones.decimal(linea[8]), Operaciones.decimal(linea[9]), Operaciones.decimal(linea[10])));
            }
            numLinea++;
        }
        cerrar();
        return estudiantes;
        
    }
    public void cerrar(){
        if(archivo !=null);
        archivo.close();
    }
}
