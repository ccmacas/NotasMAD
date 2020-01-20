package datos;

import java.util.Comparator;
import objetos.Estudiante;

// clase creada para ordenar por nombre utilizando el metodo abstracto compare de la clase comparator.
public class ComparaPromocion implements Comparator <Estudiante> {
     @Override
     public int compare(Estudiante e1, Estudiante e2){
        String a = e1.getPromocion();
        String b = e2.getPromocion();
        return a.compareTo(b);
     }

    
}
