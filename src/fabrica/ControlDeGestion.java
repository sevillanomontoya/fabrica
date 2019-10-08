
package fabrica;

import java.util.Date;


public class ControlDeGestion extends Fabrica{
    
    private int numeroDeControladores;
    private Date fechaDePlanificacion;
    private boolean SistemasFisicos;

    public ControlDeGestion(int numeroDeControladores, Date fechaDePlanificacion, boolean SistemasFisicos, int numeroDeTrabajadores, Date fechaDeIngesoDeLosTrabajadores, String colorDeMaquinas, Boolean exporta) {
        super(numeroDeTrabajadores, fechaDeIngesoDeLosTrabajadores, colorDeMaquinas, exporta);
        this.numeroDeControladores = numeroDeControladores;
        this.fechaDePlanificacion = fechaDePlanificacion;
        this.SistemasFisicos = SistemasFisicos;
    }
         public void entidadesMateriales(){
        this.SistemasFisicos = true;
    
    }   
         public void entidadesMateriales(int Controladores){
        this.SistemasFisicos = true;
        this.numeroDeControladores += controladores;
    }    
         
    public int getNumeroDeControladores(){
        return numeroDeControladores
                
        }
    
    public void  setNumeroDeControladores(int numeroDeControladores){
                this.numeroDeControladores = numeroDeControladores;
         
    }

    public Date getFechaDePlanificacion() {
        return fechaDePlanificacion;
    }

    public void setFechaDePlanificacion(Date fechaDePlanificacion) {
        this.fechaDePlanificacion = fechaDePlanificacion;
    }

    public boolean isSistemasFisicos() {
        return SistemasFisicos;
    }

    public void setSistemasFisicos(boolean SistemasFisicos) {
        this.SistemasFisicos = SistemasFisicos;
    }
    
    
    }
            
            
          
    
    

