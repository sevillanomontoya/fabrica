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
    private final String colorDeMaquinas;
    private Boolean exporta;        
    private Date fechaDeInauguracion;
                
    public Fabrica(int numeroDeTrabajadores, Date fechaDeIngesoDeLosTrabajadores, String colorDeMaquinas, Boolean exporta) {
        this.numeroDeTrabajadores = numeroDeTrabajadores;
        this.fechaDeIngesoDeLosTrabajadores = fechaDeIngesoDeLosTrabajadores;
        this.colorDeMaquinas = colorDeMaquinas;
        this.exporta = exporta;
        this.fechaDeInauguracion;
    
        
        
    }      
       public void VenderMercanciaAlExtranjero() {
           exporta = true;                            
       }
       public void AumentoDePersonal() {
           numeroDeTrabajadores += 200;        
         } 
        
        
    public void fabricar (int numeroDeEmpleados,int diasDeIngresoAdicionales)   
        if(numeroDeEmpleados<0) {
            System.out.println("Valor invalido");
        }else{
        int numeroDeEmpleados = 0;
            if(numeroDeTrabajadores<numeroDeEmpleados){
                System.out.println("Valor invalido");
            }else{  
                numeroDeTrabajadores = numeroDeEmpleados;
                fechaDeIngesoDeLosTrabajadores += diasDeIngresoAdicionales;           
                                                        
}   
      

