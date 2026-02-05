package com.refactoring.exercises.ejercicio09;

//EJERCICIO 9: Move Method (Mover Método)
//Mueve el método "calcularDescuento" a la clase Cliente

public class Pedido {

    private Cliente cliente;
    double monto;
    
    /**
	 * @deprecated Use {@link com.refactoring.exercises.ejercicio09.Cliente#calcularDescuento(com.refactoring.exercises.ejercicio09.Pedido)} instead
	 */
	public double calcularDescuento() {
		return cliente.calcularDescuento(monto);
	}
}
