package com.refactoring.exercises.ejercicio09;

public class Cliente {

    private static final double DESCUENTO_REGULAR = 0.05;
	private static final double DESCUENTO_VIP = 0.15;
	private boolean vip;
    
    public boolean esVIP() {
        return vip;
    }

	public double calcularDescuento(double monto) {
	    if (esVIP()) {
	        return monto * DESCUENTO_VIP;
	    }
	    return monto * DESCUENTO_REGULAR;
	}
}
