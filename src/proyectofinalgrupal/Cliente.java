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

public class Cliente extends Usuario {
    //Atributos
    private String correoElectronico;
    
    //Constructor

    public Cliente(String correoElectronico, String nombre, String apellido, int cedula, int celular, String direccion) {
        super(nombre, apellido, cedula, celular, direccion);
        this.correoElectronico = correoElectronico;
    }
    
     //Método get y set
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    
    //Método toString sobreescrito 
    @Override
    public String toString() {
        return "Cliente{" + "correoElectronico=" + correoElectronico + '}';
    }

    
}
