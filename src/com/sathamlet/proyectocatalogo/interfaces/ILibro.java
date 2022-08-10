package com.sathamlet.proyectocatalogo.interfaces;

import java.util.Date;

public interface ILibro {
    double IMPUESTO_LIBRO = 0.19;
    Date getFechaPublicacion();
    String getAutor();
    String getTItulo();
    String getEditorial();
}
