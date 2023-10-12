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
public class profesor_28 extends persona_28{

    public profesor_28(int tiempoEnseñando, String areaEspecilida, int horaTrabajo, int id, String nombre, String Apellidos, int edad) {
        super(id, nombre, Apellidos, edad);
        this.tiempoEnseñando = tiempoEnseñando;
        this.areaEspecilida = areaEspecilida;
        this.horaTrabajo = horaTrabajo;
    }
 
    private int tiempoEnseñando;
    private String areaEspecilida;
    private int horaTrabajo;
    

    //metodos
    public void enseñar() {

    }

    public void revisarTareas() {

    }

    public void prepararClases() {

    }

    public int getTiempoEnseñando() {
        return tiempoEnseñando;
    }

    public void setTiempoEnseñando(int tiempoEnseñando) {
        this.tiempoEnseñando = tiempoEnseñando;
    }

    public String getAreaEspecilida() {
        return areaEspecilida;
    }

    public void setAreaEspecilida(String areaEspecilida) {
        this.areaEspecilida = areaEspecilida;
    }

    public int getHoraTrabajo() {
        return horaTrabajo;
    }

    public void setHoraTrabajo(int horaTrabajo) {
        this.horaTrabajo = horaTrabajo;
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
