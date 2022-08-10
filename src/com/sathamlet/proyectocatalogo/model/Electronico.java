package com.sathamlet.proyectocatalogo.model;

import com.sathamlet.proyectocatalogo.interfaces.IElectronico;
import com.sathamlet.proyectocatalogo.interfaces.IProducto;

abstract public class Electronico extends Producto implements IElectronico {
    protected String fabricante;
    protected final double IMPUESTO = 0.15;
    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }
}
