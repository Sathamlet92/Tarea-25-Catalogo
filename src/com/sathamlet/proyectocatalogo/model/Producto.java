package com.sathamlet.proyectocatalogo.model;

import com.sathamlet.proyectocatalogo.interfaces.IProducto;

abstract public class Producto implements IProducto {
    protected int precio;
    public Producto(int precio) {
        this.precio = precio;
    }
    abstract public int getPrecio();
}
