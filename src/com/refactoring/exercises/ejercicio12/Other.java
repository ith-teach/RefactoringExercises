package com.refactoring.exercises.ejercicio12;

public class Other extends Empleado {

	private static final int TARIFA_POR_HORA = 30;

	public Other(double horasTrabajadas) {
		super(horasTrabajadas);
	}

	@Override
	public double calcularSalario() {
		return getHorasTrabajadas() * TARIFA_POR_HORA;
	}
}
