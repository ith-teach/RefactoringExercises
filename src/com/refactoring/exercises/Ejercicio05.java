package com.refactoring.exercises;

//EJERCICIO 5: Extract Local Variable (Extraer Variable Local)
//Extrae las subexpresiones complejas a variables locales

public class Ejercicio05 {

    public double calcularPrecioFinal(double precioBase, double tasaImpuesto, double descuento) {
        double factorImpuesto = 1 + tasaImpuesto;
		double factorDescuento = 1 - descuento;
		double precioConImpuesto = precioBase * factorImpuesto;
		double precioConDescuento = precioConImpuesto * factorDescuento;
		return precioConDescuento;
    }
}
