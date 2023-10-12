/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s11_28_e01;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class S11_28_E01 {
    
    public static ArrayList<persona_28> persona = new ArrayList<persona_28>();
    
    public static void main(String[] args) {
        
        estudiante_28 keller = new estudiante_28(2, " Analisis de Sistemas", " Programacion Orientada a Objetos", 28, " Keller", " Rejas", 18);
        
        profesor_28 carlos = new profesor_28(3, " programacion", 5, 5, " carlos", " Alzamora", 0);
        
        doctor_28 javier = new doctor_28(5, " cirujano Plastico", 12, 57, " Javier", " Morales Pineda", 34);
        
        persona.add(keller);
        persona.add(carlos);
        persona.add(javier);
        
        
        for(persona_28 persona : persona){
            System.out.println(persona.getNombre()+ "" + persona.getApellidos());
        };
    }
    
}
