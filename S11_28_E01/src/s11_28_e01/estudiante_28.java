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
public class estudiante_28 extends persona_28{

    public estudiante_28(int ciclo, String carrera, String cursoFavorito, int id, String nombre, String Apellidos, int edad) {
        super(id, nombre, Apellidos, edad);
        this.ciclo = ciclo;
        this.carrera = carrera;
        this.cursoFavorito = cursoFavorito;
    }

    private int ciclo;
    private String carrera;
    private String cursoFavorito;
    

    //metodos
    public void estudiar() {

    }

    public void divertirse() {

    }

    public void concursar() {

    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setCursoFavorito(String cursoFavorito) {
        this.cursoFavorito = cursoFavorito;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
