package datos;

import java.util.Comparator;
import objetos.Estudiante;

// clase creada para ordenar por nombre utilizando el metodo abstracto compare de la clase comparator.
public class ComparaNombres implements Comparator <Estudiante> {
     @Override
     public int compare(Estudiante e1, Estudiante e2){
        Integer a = Integer.parseInt(e1.getNombre().split(" ")[1]);
         Integer b = Integer.parseInt(e2.getNombre().split(" ")[1]);
        
        return a.compareTo(b);
     }

    
}
