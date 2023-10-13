/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Itzel Hernandez Hernandez
 * clase que almacena los datos de alumno
 */
public class Alumno {
    private String nombre, apellido, carrera, escuela;
    private int edad, semestre;
    private Fecha fNacimiento;
    /**
     * Constructor vacío de alumno
     */
    public Alumno() {
    }
    /**
     * Constructor lleno de alumno
     * @param nombre: nombre del alumno en String
     * @param apellido: apellido del alumno en String
     * @param carrera: nombre de la carrera en String
     * @param escuela: nombre de la facultad en String
     * @param edad: edad del alumno en int
     * @param fNacimiento : fecha de nacimiento en Fecha
     */
    public Alumno(String nombre, String apellido, String carrera, String escuela, int edad, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.escuela = escuela;
        this.edad = edad;
        this.semestre = semestre;
        this.fNacimiento = fNacimiento;
    }
    /**
     * Método get Nombre
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo modifica el nombre del alumno
     * @param nombre nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método que regresa el apellido
     * @return regreesa el apellido
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Método que modifica el apellido
     * @param apellido del alumno
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Método que regresa la carrera
     * @return carrera del alumno
     */
    public String getCarrera() {
        return carrera;
    }
    /**
     * Método que modifica la carrera
     * @param carrera del alumno
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    /**
     * Método que regresa la facultad
     * @return escuela del alumno
     */
    public String getEscuela() {
        return escuela;
    }
    /**
     * Método que modifica la escuela
     * @param escuela del alumno
     */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    /**
     * Método que regresa la edad del alumno
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Método que modifica la edad del alumno
     * @param edad del alumno
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Método que regresa el semestre que cursa el alumno
     * @return semestre
     */
    public int getSemestre() {
        return semestre;
    }
    /**
     *  Método que modifica el semestre actual del alumno
     * @param semestre del alumno
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    /**
     * Método que regresa la fecha de nacimiento
     * @return fecha de nacimiento
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    /**
     * Método que modifica la fecha de nacimiento
     * @param fNacimiento del alumno
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    /**
     * Imprime la variable dormir, en el que regresa una cadena "zzz"
     */
    public void dormir(){
        System.out.println("Zzz");
    }
    /**
     * Imprime la variable comer, en el que regresa una cadena "ñam ñam"
     */
    public void comer(){
        System.out.println("Ñam ñam");
    }
    /**
     * Imprime la variable estudiar, en el que regresa una cadena "Estoy estudiando"
     */
    public void estudiar(){
        System.out.println("Estoy estudiando");
    }
    /**
     * Imprime la variable trabajar, regresa una cadena "Estoy trabajando"
     */
    public void trabajar(){
        System.out.println("Estoy trabajando");
    }
    /**
     * Imprime la variable jugar, y regresa una cadena "Estoy jugando"
     */
    public void jugar(){
        System.out.println("Estoy jugando");
    }
   
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", carrera=" + carrera + ", escuela=" + escuela + ", edad=" + edad + ", semestre=" + semestre + ", fNacimiento=" + fNacimiento + '}';
    }
    /**
     * Método toString sobreescrito que muestra los valores de los atributos
     * @return concatenación de los  valores de los atributos
     */
}
