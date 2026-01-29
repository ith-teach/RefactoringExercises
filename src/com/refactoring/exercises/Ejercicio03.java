package com.refactoring.exercises;

//EJERCICIO 3: Extract Constant (Extraer Constante)
//Extrae los números mágicos a constantes con nombres descriptivos

public class Ejercicio03 {

    private static final int MONTO_MINIMO = 0;
	private static final int MONTO_MAXIMO = 10000;
	private static final double TASA_IVA = 0.21;

	public double calcularImpuesto(double monto) {
        return monto * TASA_IVA;
    }
    
    public boolean esMontoValido(double monto) {
        return monto >= MONTO_MINIMO && monto <= MONTO_MAXIMO;
    }
}
