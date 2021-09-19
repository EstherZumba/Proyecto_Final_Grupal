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
public class Vendedor extends Usuario {
//Variables 

    private int codigoVendedor;

    // constructor que llama a la clase padre 
    public Vendedor(int codigoVendedor, String usuario, String apellido, int cedula, int celular, String direccion) {
        //llamar al constructor con datos disponibles en la clase superclase Usurio
        super(usuario, apellido, cedula, celular, direccion);
        this.codigoVendedor = codigoVendedor;
    }

//Métodos get y set
    public int getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(int codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

// Método to string que contendra la informacion 
    @Override
    public String toString() {
        //Math.random() método para que nos de un número aleatorio
        this.codigoVendedor = (int) (Math.random() * 1000000 + 1);
        return "\n* Nombre Empleado: " + this.nombre + "\n* Apellido Empleado:" + this.apellido
                + "\n* Código Vendedor:" + this.codigoVendedor;

    }

}
