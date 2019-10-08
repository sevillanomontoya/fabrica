
package fabrica;

import java.util.Date;


public class Maquinaria extends Fabrica{
    
    private int numeroDeMotores;
    private Date fechaDeRenovacionDeMaquinaria;
    private String colorDeMaquinaria;

    public Maquinaria(int numeroDeMotores, Date fechaDeRenovacionDeMaquinaria, String colorDeMaquinaria, int numeroDeTrabajadores, Date fechaDeIngesoDeLosTrabajadores, String colorDeMaquinas, Boolean exporta) {
        super(numeroDeTrabajadores, fechaDeIngesoDeLosTrabajadores, colorDeMaquinas, exporta);
        this.numeroDeMotores = numeroDeMotores;
        this.fechaDeRenovacionDeMaquinaria = fechaDeRenovacionDeMaquinaria;
        this.colorDeMaquinaria = colorDeMaquinaria;
    }

    public void recolorearMaquinaria(String nuevoColor){
        this.colorDeMaquinaria = nuevoColor;
    
    }
    public void recolorearMaquinaria(String nuevoColor, String especialidad){
        this.colorDeMaquinaria = nuevoColor + "de" + especialidad;
    
    }
    public int getNumeroDeMotores() {
        return numeroDeMotores;
    }

    public void setNumeroDeMotores(int numeroDeMotores) {
        this.numeroDeMotores = numeroDeMotores;
    }

    public Date getFechaDeRenovacionDeMaquinaria() {
        return fechaDeRenovacionDeMaquinaria;
    }

    public void setFechaDeRenovacionDeMaquinaria(Date fechaDeRenovacionDeMaquinaria) {
        this.fechaDeRenovacionDeMaquinaria = fechaDeRenovacionDeMaquinaria;
    }

    public String getColorDeMaquinaria() {
        return colorDeMaquinaria;
    }

    public void setColorDeMaquinaria(String colorDeMaquinaria) {
        this.colorDeMaquinaria = colorDeMaquinaria;
    }
            
            
    
    
    
    
    
    
    
    
    
    
}
