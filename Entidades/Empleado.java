/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5.Entidades;

/**
 *
 * @author Estudiante
 */
public class Empleado extends Persona{

    /**
     * @return the codempleado
     */
    public String getCodempleado() {
        return codempleado;
    }

    /**
     * @param codempleado the codempleado to set
     */
    public void setCodempleado(String codempleado) {
        this.codempleado = codempleado;
    }

    public Empleado(String codempleado){
        this.codempleado = codempleado;
    }

    public Empleado(){}
    
    
    private String codempleado;
    
    @Override
     public String getText(){
        return " Empleado: " + 
                this.getNombre()+ " " + 
                this.getApellido()+ " | DNI :" + 
                this.getDni();

               
    }
     
     public static Empleado 
            fromPersona(Persona per){
                
                Empleado emp=new Empleado();
                emp.setNombre(per.getNombre());
                 emp.setApellido(per.getApellido());
                  emp.setDni(per.getDni());
                  return emp;
                 
            }

   
    
}
