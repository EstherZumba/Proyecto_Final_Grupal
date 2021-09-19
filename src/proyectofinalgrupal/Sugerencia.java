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
public class Sugerencia {
//Variables

    private String mensaje;

// constructor vacio 
    public Sugerencia() {
    }

// constructor con String mensaje
    public Sugerencia(String mensaje) {
        this.mensaje = mensaje;
    }

    //Métodos get y set
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

// Método to string que contendra la informacion 
    @Override
    public String toString() {
        return "* Sugerencia *" + "\n*Mensaje: " + mensaje + '.';
    }
}