package com.refactoring.exercises.ejercicio09;

//EJERCICIO 9: Move Method (Mover Método)
//Mueve el método "calcularDescuento" a la clase Cliente

public class Pedido {

    private Cliente cliente;
    private double monto;
    
	public double calcularDescuento() {
		return cliente.calcularDescuento(monto);
	}

	double getMonto() {
		return monto;
	}

	void setMonto(double monto) {
		this.monto = monto;
	}

}
