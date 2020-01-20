package archivos;

import java.io.FileNotFoundException;
import java.util.Formatter;


public class EscribirArchivo {
 // variable global
    private Formatter archivo;
 //constructor de la clase
    public EscribirArchivo(String nArchivo){
        try {
            this.archivo = new Formatter(nArchivo,"UTF-8");
        } catch (Exception e) {
            System.out.println("Error al abrir el archivo");
        }
    }
   
    public void escribir (String linea){
        // devuelve una cadena formateada con los parametros recibidos
        archivo.format("%s\n",linea);
    }
    
    public void cerrar (){
        if (archivo !=null){
            archivo.close();
        }
    }
}
