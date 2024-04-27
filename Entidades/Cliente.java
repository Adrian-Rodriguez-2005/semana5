/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5.Entidades;

/**
 *
 * @author Estudiante
 */
public class Cliente extends Persona{

    /**
     * @return the codcliente
     */
    public String getCodcliente() {
        return codcliente;
    }

    /**
     * @param codcliente the codcliente to set
     */
    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }

    public Cliente(String codcliente){
        this.codcliente=codcliente;
    }

    public Cliente() {
    }
    private String codcliente;
    
    public static Cliente 
            fromPersona(Persona per){
                
                Cliente cli=new Cliente();
                cli.setNombre(per.getNombre());
                 cli.setApellido(per.getApellido());
                  cli.setDni(per.getDni());
                  return cli;
                 
            }
    
    @Override
    public String getText(){
        return " Cliente: " + 
                this.getNombre()+" "+
                this.getApellido()+ " | DNI :" + 
                this.getDni();

               
    }
    
}

