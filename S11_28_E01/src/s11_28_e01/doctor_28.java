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
public class doctor_28 extends persona_28{

    public doctor_28(int AniosExperiencia, String especialidad, int horasTrabajo, int id, String nombre, String Apellidos, int edad) {
        super(id, nombre, Apellidos, edad);
        this.AniosExperiencia = AniosExperiencia;
        this.especialidad = especialidad;
        this.horasTrabajo = horasTrabajo;
    }

    
    
    private int AniosExperiencia;
    private String especialidad;
    private int horasTrabajo ;
    

    //metodos
    public void ejercerCarrera() {

    }

    public void Atender() {

    }

    public void prepararce() {

    }

    public int getAniosExperiencia() {
        return AniosExperiencia;
    }

    public void setAniosExperiencia(int AniosExperiencia) {
        this.AniosExperiencia = AniosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }
    
}
