package com.sathamlet.proyectocatalogo.model;

import com.sathamlet.proyectocatalogo.interfaces.ILibro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Libro extends Producto implements ILibro {
    private Date fechaPublicacion;
    private String fechaFormater;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio) {
        super(precio);
    }

    public Libro(int precio, String fechaPublicacion, String autor, String titulo, String editorial) {
        this(precio);
        this.fechaPublicacion = formatDate(fechaPublicacion);
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        this(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        fechaFormater = dateToS(fechaPublicacion);
    }

    private String dateToS(Date date){
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
        String dateFormatter = df.format(date);
        return dateFormatter;
    }
    private Date formatDate(String fecha){
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaPub;
        try {
            fechaPub = df.parse(fecha);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        this.fechaFormater = df.format(fechaPub);
        return fechaPub;
    }

    public String getFechaFormater(){
        return this.fechaFormater;
    }

    @Override
    public Date getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getTItulo() {
        return this.titulo;
    }

    @Override
    public String getEditorial() {
        return this.editorial;
    }

    @Override
    public double getPrecioVenta() {
        return this.precio + (this.precio * this.IMPUESTO_LIBRO);
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "El libro: " + this.getTItulo()
                + "\nEditorial " + this.getEditorial()
                + " " + this.getFechaFormater()
                + "\nAutor " + this.getAutor()
                + "\nPrecio: " + this.getPrecioVenta();
    }
}
