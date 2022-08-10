package com.sathamlet.proyectocatalogo.model;

import java.util.Date;

public class Comic extends Libro{
    private String personaje;

    public Comic(int precio, String fechaPublicacion,
                 String autor, String titulo, String editorial) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
    }

    public Comic(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Titulo:" + this.getTItulo()
                +"\nEditorial " + this.getEditorial()
                +"\nPersonaje " + this.getPersonaje()
                +"\nFecha de publicacion: " + this.getFechaFormater()
                +"\nAutor: " + this.getAutor()
                +"\nPrecio " + this.getPrecioVenta();
    }
}
