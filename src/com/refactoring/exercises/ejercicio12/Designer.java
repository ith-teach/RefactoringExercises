package com.refactoring.exercises.ejercicio12;

public class Designer extends Empleado {

	private static final int TARIFA_POR_HORA = 40;

	public Designer(double horasTrabajadas) {
		super(horasTrabajadas);
	}

	@Override
	public double calcularSalario() {
		return getHorasTrabajadas() * TARIFA_POR_HORA;
	}

}
