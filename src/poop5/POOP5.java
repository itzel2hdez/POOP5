/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author poo08alu21
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno = new Alumno ();
        alumno.setNombre ("Pedro");
        alumno.setApellido("Gomez");
        
        Fecha fecha = new Fecha (31,1,2002);
        Alumno alu2= new Alumno("Itzel", "Hdz", "Compu", "UNAM", 21, fecha);
        String var = alumno.toString();
        System.out.println(var);
        System.out.println(alumno.toString());
        System.out.println(alu2);
    }
    
}
