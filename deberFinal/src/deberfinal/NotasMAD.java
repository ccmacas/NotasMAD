package deberfinal;

import archivos.EscribirArchivo;
import archivos.LecturaArchivo;
import datos.ComparaNombres;
import datos.ComparaPromocion;
import datos.ComparaTotal;
import datos.Operaciones;
import java.util.ArrayList;
import java.util.Collections;
import objetos.Estudiante;
import objetos.Informe;

public class NotasMAD {

    public static void main(String[] args) {
        
        // creo un arraylist para guardar la clase estudiante y escribir el archivo
        ArrayList<Estudiante> estudiantes = Operaciones.generarValores(25);
        Informe infor = new Informe(Operaciones.ENCABEZADO, estudiantes);
        EscribirArchivo salida = new EscribirArchivo("datos.csv");
        salida.escribir(infor.toString());
        salida.cerrar();
        
        // leemos el archivo 
        LecturaArchivo entrada = new LecturaArchivo("datos.csv");
        estudiantes = entrada.obtenerEstudiantes();
        
        // sobreescribimos la variable informe con los datos leidos del archivo datos
        infor = new Informe (Operaciones.ENCABEZADO,estudiantes);
        infor.calcular();
       
        //ordena por nombre 
        Collections.sort(estudiantes, new ComparaNombres());
       // escribe el archivo con la lista ordenada por nombre
        salida = new EscribirArchivo("usernameBdEst_OrdenNomb.csv");
        salida.escribir(infor.toString());
        salida.cerrar();
        
        // ordena por total
        Collections.sort(estudiantes, new ComparaTotal());
        // escribe el archivo con la lista ordenada por total
        salida = new EscribirArchivo("usernameBdEst_OrdenTOTAL.csv");
        salida.escribir(infor.toString());
        salida.cerrar();
        
        // ordena por promocion
        Collections.sort(estudiantes, new ComparaPromocion());
        // escribe el archivo con la lista ordenada por promocion 
        salida = new EscribirArchivo("usernameBdEst_OrdenPromo.csv");
        salida.escribir(infor.toString());
        salida.cerrar();
        
        
    }
    

}
