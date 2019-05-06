/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familia;

/**
 *
 * @author USUARIO
 */
public class Familia {
     private String apellido;
     private Persona miembro;

    public Familia(String apellido, Persona miembro) {
        this.apellido = apellido;
        this.miembro = miembro;
    }
    
     
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public String getApellido() {
        return apellido;
    }

    public Familia getFamilia() {
        return familia;
    }
     
     
    
}
