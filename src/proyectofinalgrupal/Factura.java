/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalgrupal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Factura {
    private int codigoFactura;
    private double iva;
    private double subTotal;
    private double total;
    private Cliente cliente;
    private Producto producto;
    private int cantidadProducto;
    private Vendedor vendedor;
    private List<Cliente> clientes; // las lista o arreglos siempre deben inicializar en el constructor
    private List<Vendedor> vendedores;
    private List<Factura> facturas;
    private List<Producto> productos;

    public Factura() {
        clientes = new ArrayList<>();

    }

    public Factura(int codigoFactura, double iva, double subTotal, double total, Cliente cliente, Producto producto, int cantidadProducto) {
        this.codigoFactura = codigoFactura;
        this.iva = iva;
        this.subTotal = subTotal;
        this.total = total;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    //metodos
    public double subtTotalCompra() {
        double precio = 0;
//        if (producto.getCodigoProducto().equals(codigoP)) {
            precio = cantidadProducto * producto.getPrecioProducto();
        
            //poner un jotaoption
       
        return precio;

    }

    public double ivaProducto(double base, double porcentaje) {
        double iva = 0;
        iva = base * (porcentaje / 100);
        return iva;

    }

    public double totalCompra() {
        double precioFinal = ivaProducto(this.iva,subTotal)+subtTotalCompra();
        return precioFinal;

    }

    // Método ingresar cliente
    public void IngresarClientes(Cliente cliente) {
        clientes.add(cliente);
    }

    // Método mostrar clientes
    public List<Cliente> mostrarCliente() {
        List<Cliente> clientesAux = new ArrayList<>();
        for (Cliente client : clientes) {
            clientesAux.add(client);
        }
        return clientesAux;
    }

    // Método ingresar a la lista los vendedores
    public void IngresarVendedor(Vendedor vend) {
        vendedores.add(vend);
    }

    //mostrar lista de vendedores
    public List<Vendedor> mostrarVebndedores() {
        List<Vendedor> vendedoresAux = new ArrayList<>();
        for (Vendedor vende : vendedores) {
            vendedoresAux.add(vende);
        }
        return vendedoresAux;
    }

    //ingresar a la lista los vendedores
    public void IngresarProducto(Producto pro) {
        productos.add(pro);
    }



    // ingresar Factura
    public void facturacion(Factura fac) {
        facturas.add(fac);

    }
    
    
}
