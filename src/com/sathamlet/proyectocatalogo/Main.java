package com.sathamlet.proyectocatalogo;

import com.sathamlet.proyectocatalogo.interfaces.IProducto;
import com.sathamlet.proyectocatalogo.model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        IPhone iphone11 = new IPhone(15999,
                    "Apple", "Iphone 11 Plus","Plateado");
        LeerDatos(iphone11);
        System.out.println();
        TvLcd aoc = new TvLcd(9356, "AOC", 24);
        Libro quijote = new Libro(234, "4/02/1605", "Miguel de Cervantes",
                "El ingenioso hidalgo don Quijote de la Mancha", "Gavilan");

        Comic spiderman1 = new Comic(21, new Date(), "Stan Lee", "Spiderman vs Venom",
                "Marvel Comics", "Spiderman" );

        IProducto[] productos = new IProducto[4];
        productos[0] = iphone11;
        productos[1] = aoc;
        productos[2] =quijote;
        productos[3] = spiderman1;
        for (var producto: productos
             ) {
            LeerDatos(producto);
        }

    }
    public static void LeerDatos(IProducto producto){
        System.out.println(producto);
        System.out.println();
    }
}
