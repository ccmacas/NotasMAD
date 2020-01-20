package objetos;

import java.util.ArrayList;

public class Informe {

    private String encabezado;
    private ArrayList<Estudiante> estudiantes;

    public Informe(String encabezado, ArrayList<Estudiante> estudiantes) {
        this.encabezado = encabezado;
        this.estudiantes = estudiantes;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;

    }

    public void calcular() {
        for (Estudiante estudiantes : estudiantes) {
            estudiantes.calcular();
        }
    }

    @Override
    public String toString() {
        String reporte = String.format("%s\n", encabezado);
        for (Estudiante estudiante : estudiantes) {
            reporte += String.format("%s\n", estudiante);

        }
        return reporte;
    }

}
