/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Itzel Hernandez Hernandez
 * Clase que contiene los datos de una fecha
 */
public class Fecha {
    private int dia, mes, anio;
    /**
     * Constructor vacío de Fecha
     */
    public Fecha() {
    }
    /**
     * Constructor lleno de Fecha
     * @param dia: día de fecha de nacimiento en int
     * @param mes : mes de nacimiento en int
     * @param anio : anio de nacimiento en int
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     * Método que regresa el dia de nacimiento del Alumno
     * @return dia
     */
    public int getDia() {
        return dia;
    }
    /**
     * Metodo que modifica el dia de fecha de nacimiento de Alumno
     * @param dia de nacimiento
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * Metodo que regresa el mes de fecha de nacimiento
     * @return mes
     */
    public int getMes() {
        return mes;
    }
    /**
     * Metodo que modifica el mes de fecha de nacimiento de Alumno
     * @param mes de nacimiento
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
     * metodo que regresa el anio de nacimiento
     * @return anio de nacimiento
     */
    public int getAnio() {
        return anio;
    }
    /**
     * Metodo que modifica el anio de fecha de nacimiento
     * @param anio del Alumno
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    /**
     * Método toString sobreescrito que muestra los valores de los atributos
     * @return concatenación de los  valores de los atributos
     */
    
}
