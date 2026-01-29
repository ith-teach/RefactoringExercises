package com.refactoring.exercises;

//EJERCICIO 5: Extract Local Variable (Extraer Variable Local)
//Extrae las subexpresiones complejas a variables locales

public class Ejercicio05 {

    public double calcularPrecioFinal(double precioBase, double tasaImpuesto, double descuento) {
        double factorTasaImpuesto = 1 + tasaImpuesto;
		double factorDescuento = 1 - descuento;
		double precioConImpuestos = precioBase * factorTasaImpuesto;
		double precioConDescuento = precioConImpuestos * factorDescuento;
		return precioConDescuento;
    }
}
