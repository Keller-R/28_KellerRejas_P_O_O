/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s11_28_e01;

/**
 *
 * @author Usuario
 */
public class persona_28 {
    
    //CLASE PADFRE
    //atributos
    public persona_28(int id, String nombre, String Apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.edad = edad;
    }
   
    
    protected int id;
    protected String nombre;
    protected String Apellidos;
    protected int edad;
    
    //metodos
    
    public void presentarse(){
    
}
    public void comer(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
