package com.sathamlet.proyectocatalogo.model;

public class TvLcd extends Electronico {
    private int pulgada;

    public TvLcd(int precio, String fabricante) {
        super(precio, fabricante);
    }
    public TvLcd(int precio, String fabricante, int pulgada) {
        this(precio, fabricante);
        this.pulgada = pulgada;
    }
    public int getPulgada() {
        return pulgada;
    }

    public void setPulgada(int pulgada) {
        this.pulgada = pulgada;
    }
    @Override
    public String getFabricante() {
        return this.fabricante;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() + (this.getPrecio() * this.IMPUESTO);
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "Pantalla de la marca " + this.getFabricante()
                + "\nPulgadas " + this.getPulgada()
                + "\nPrecio: " +this.getPrecioVenta();
    }
}
