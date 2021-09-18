/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalgrupal;

/**
 *
 * @author Usuario
 */
public class Usuario {
      //Atributos
    protected String nombre;
    protected String apellido;
    protected int cedula;
    protected int celular;
    protected String direccion;

    public Usuario(String nombre, String apellido, int cedula, int celular, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.celular = celular;
        this.direccion = direccion;
    }
    
}
