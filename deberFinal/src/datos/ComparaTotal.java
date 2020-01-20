package datos;

import java.util.Comparator;
import objetos.Estudiante;

// clase creada para ordenar por nombre utilizando el metodo abstracto compare de la clase comparator.
public class ComparaTotal implements Comparator <Estudiante> {
     @Override
     public int compare(Estudiante e1, Estudiante e2){
        Double a = e1.getTotal();
        Double b = e2.getTotal();
        return a.compareTo(b);
     }

    
}
