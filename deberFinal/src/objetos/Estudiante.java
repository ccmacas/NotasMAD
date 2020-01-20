package objetos;

import datos.Operaciones;

public class Estudiante {

    private String nombre;
    // foro, chat, videocolaboracion
    private double for1;
    private double cha1;
    private double vid1;
    private double tra1;
    private double pre1;
    private double for2;
    private double cha2;
    private double vid2;
    private double tra2;
    private double pre2;
    private double fin1;
    private double fin2;
    private double total;
    private String alerta;
    private String promocion;
    private double total1B;
    private double total2B;

    // constructor
    public Estudiante(String nombre, double for1, double cha1, double vid1, double tra1, double pre1, double for2, double cha2, double vid2, double tra2, double pre2) {
        this.nombre = nombre;
        this.for1 = for1;
        this.cha1 = cha1;
        this.vid1 = vid1;
        this.tra1 = tra1;
        this.pre1 = pre1;
        this.for2 = for2;
        this.cha2 = cha2;
        this.vid2 = vid2;
        this.tra2 = tra2;
        this.pre2 = pre2;
        this.fin1 = 0;
        this.fin2 = 0;
        this.total = 0;
        this.alerta = "";
        this.promocion = "";
        this.total1B = 0;
        this.total2B = 0;

    }

    // metodos set y get 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFor1(double for1) {
        this.for1 = for1;
    }

    public void setCha1(double cha1) {
        this.cha1 = cha1;
    }

    public void setVid1(double vid1) {
        this.vid1 = vid1;
    }

    public void setTra1(double tra1) {
        this.tra1 = tra1;
    }

    public void setPre1(double pre1) {
        this.pre1 = pre1;
    }

    public void setCha2(double cha2) {
        this.cha2 = cha2;
    }

    public void setVid2(double vid2) {
        this.vid2 = vid2;
    }

    public void setTra2(double tra2) {
        this.tra2 = tra2;
    }

    public void setPre2(double pre2) {
        this.pre2 = pre2;
    }
    public void setPromocion(String promocion){
        this.promocion = promocion; 
    }
    public void setTotal(double total){
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public double getFor1() {
        return for1;
    }

    public double getCha1() {
        return cha1;
    }

    public double getVid1() {
        return vid1;
    }

    public double getTra1() {
        return tra1;
    }

    public double getPre1() {
        return pre1;
    }

    public double getFor2() {
        return for2;
    }

    public double getCha2() {
        return cha2;
    }

    public double getVid2() {
        return vid2;
    }

    public double getTra2() {
        return tra2;
    }

    public double getPre2() {
        return pre2;
    }
    public String getPromocion(){
        return promocion;
    }
    public double getTotal(){
        return total;
    }

    // metodo para calcular alerta 
    public int calAlerta() {
        int opcion = 0;
        // en este if va la opcioon 4 ya que si los totales dan cero da reprobado falta de trabajo
        if (total1B + total2B == 0) {
            opcion = 4;
        } else {
            // si el pre1 y pre2 es menor damos la opcion 3 de rendir final 1 y 2 siino solo damos la prueba final 1 o la prueba final 2
            if (pre1 < 8 && pre2 < 8) {
                opcion = 3;
            } else if (pre1 < 8) {
                opcion = 1;
            } else if (pre2 < 8) {
                opcion = 2;
            }
            // si el pre1 es igual a pre2 y total1B ´mas total2B es menor a 28 rendir final 2 sino rendir final 1 o rendir final 2 
            if (pre1 == pre2 && total1B + total2B < 28) {
                opcion = 2;
            } else if (pre1 < 8 && total1B < 28) {
                opcion = 1;
            } else if (pre2 < 8 && total2B < 28) {
                opcion = 2;
            }
        } 
        return opcion;
    }

// calcular total de los bimestres
    public void totalBimestre() {
        total1B = for1 + cha1 + vid1 + tra1 + pre1;
        total2B = for2 + cha2 + vid2 + tra2 + pre2;
    }
// MEODo donde se calcula la promocion

    public void calPromocion() {
        if (total >= 28) {
            promocion = "APROBADO";
        } else {
            promocion = "REPROBADO";
        }
    }

    // metodo calcular 
    public void calcular() {
        totalBimestre();
        switch (calAlerta()) {
            case 0:
                total = total1B + total2B;
               
                break;
            case 1:
                fin1 = Operaciones.numAle(20);
                total = fin1 + total2B;
                 alerta = "Rendir Final 1";
                break;
            case 2:
                 fin2 = Operaciones.numAle(20);
                total = fin2 + total1B;
                 alerta = "Rendir Final 2";
                break;
            case 3:
                 fin1 = Operaciones.numAle(20);
                  fin2 = Operaciones.numAle(20);
                total = fin1 + fin2;
                 alerta = "Rendir Final 1 y 2";
                break;
            case 4:
                total =0;
                alerta = "Reprobado faltar trabajo";
                break;
        }
       if (total >40){
           total = 40;
       }
        calPromocion();
        
    }

    @Override
    public String toString() {
        return String.format("%s;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%s;%s", nombre, for1, cha1, vid1, tra1, pre1, for2, cha2, vid2, tra2, pre2, fin1, fin2, total, alerta, promocion);
    }

}
