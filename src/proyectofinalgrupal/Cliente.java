/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalgrupal;

/**
 *
 * @author Ivonne Ramirez
 */
public class Cliente extends Usuario {

//Variables
    private String correoElectronico;

// constructor que llama a la clase padre 
    public Cliente(String nombre, String apellido, int cedula, int celular, String direccion) {
        super(nombre, apellido, cedula, celular, direccion);
    }

//Métodos get y set
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

// Método to string que contendra la informacion 
    @Override
    public String toString() {
        return "* Cliente *" + "\n*Correo Electrónico: " + correoElectronico + '.';
    }

}
