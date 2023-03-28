package com.example.demo.Entidades;

public class Productos {

    private int codigo;
    private String nombre;
    private String categoria;
    private double precio;
    private int cantidad;
    private double total;
    private double totalDesc;
    private double preciofinal;

    public double getPreciofinal() {
        return preciofinal;
    }

    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalDesc() {
        return totalDesc;
    }

    public void setTotalDesc(double totalDesc) {
        this.totalDesc = totalDesc;
    }

    public Productos(int codigo, String nombre, String categoria, double precio, int cantidad, double total, double totalDesc, double preciofinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = total;
        this.totalDesc = totalDesc;
        this.preciofinal = preciofinal;
    }
}
