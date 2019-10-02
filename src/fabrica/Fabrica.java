/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import java.util.Date;

public class Fabrica {
    
    private int numeroDeTrabajadores;
    private Date fechaDeIngesoDeLosTrabajadores;
    private String colorDeMaquinas;
    private Boolean exporta;        

    public Fabrica(int numeroDeTrabajadores, Date fechaDeIngesoDeLosTrabajadores, String colorDeMaquinas, Boolean exporta) {
        this.numeroDeTrabajadores = numeroDeTrabajadores;
        this.fechaDeIngesoDeLosTrabajadores = fechaDeIngesoDeLosTrabajadores;
        this.colorDeMaquinas = colorDeMaquinas;
        this.exporta = exporta;
    }

    public int getNumeroDeTrabajadores() {
        return numeroDeTrabajadores;
    }

    public void setNumeroDeTrabajadores(int numeroDeTrabajadores) {
        this.numeroDeTrabajadores = numeroDeTrabajadores;
    }

    public Date getFechaDeIngesoDeLosTrabajadores() {
        return fechaDeIngesoDeLosTrabajadores;
    }

    public void setFechaDeIngesoDeLosTrabajadores(Date fechaDeIngesoDeLosTrabajadores) {
        this.fechaDeIngesoDeLosTrabajadores = fechaDeIngesoDeLosTrabajadores;
    }

    public String getColorDeMaquinas() {
        return colorDeMaquinas;
    }

    public void setColorDeMaquinas(String colorDeMaquinas) {
        this.colorDeMaquinas = colorDeMaquinas;
    }

    public Boolean getExporta() {
        return exporta;
    }

    public void setExporta(Boolean exporta) {
        this.exporta = exporta;
    }

}
