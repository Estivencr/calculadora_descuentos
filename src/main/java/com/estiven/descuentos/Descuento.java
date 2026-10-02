package com.estiven.descuentos;

public class Descuento {

    public static double calcular(double precio, double porcentaje) {
        if(precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        if(porcentaje < 0 || porcentaje > 100) {
            throw  new IllegalArgumentException("El porcentaje debe de estar entre 0 y 100");
        }
        return precio - (precio * porcentaje / 100);
    }
}
