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
public class Producto {
    private String codigoProducto;
    private String nombreProducto;
    private double precioProducto;
    private String marcaProducto;

    public Producto() {
    }

    public Producto(String nombreProducto, double precioProducto, String marcaProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.marcaProducto = marcaProducto;
    }

    
    public Producto(String codigoProducto, String nombreProducto, double precioProducto, String marcaProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.marcaProducto = marcaProducto;
    }

    
    
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }
    
      
    
    
}
