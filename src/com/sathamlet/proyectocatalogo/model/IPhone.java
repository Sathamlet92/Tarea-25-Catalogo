package com.sathamlet.proyectocatalogo.model;

public class IPhone extends Electronico {
    private String modelo;
    private String color;

    public IPhone(int precio, String fabricante) {
        super(precio, fabricante);
    }

    public IPhone(int precio, String fabricante, String modelo, String color) {
        this(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public double getPrecioVenta() {
        return (this.getPrecio()) + (this.getPrecio() * this.IMPUESTO);
    }

    @Override
    public String toString() {
        return this.getModelo() + ", "
                + this.getColor()
                + "\nFabricante: " + this.getFabricante()
                + "\nPrecio venta: " + this.getPrecioVenta();
    }
}
