/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

/**
 *
 * @author kroctus
 */
public class Empleado {
    
    String nombre;
    String apellido;
    int numHijos;

    // constructor parametrizado
    public Empleado(String nombre, String apellido, int numHijos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numHijos = numHijos;
    }
    
    // constructor por defecto

    public Empleado() {
        this.nombre="Gabriel";
        this.apellido="payano";
        this.numHijos=0;
    }
    
    
    
    
    
}
