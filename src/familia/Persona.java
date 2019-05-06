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
public class Persona {
     private String nombre1;
     private String nombre2;
     private String apellido1;
     private String apellido2;
     private int edad;
     private String sexo;
     private String rol;

    public Persona(String nombre1, String nombre2, String apellido1, String apellido2, int edad, String sexo, String rol) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.sexo = sexo;
        this.rol = rol;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

     
     
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getRol() {
        return rol;
    }
     
     
}
