package com.refactoring.exercises.ejercicio09;

public class Cliente {

    private boolean vip;
    
    public boolean esVIP() {
        return vip;
    }

	public double calcularDescuento(double monto) {
	    if (esVIP()) {
	        return monto * 0.15;
	    }
	    return monto * 0.05;
	}
}
