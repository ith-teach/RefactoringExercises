package com.refactoring.exercises.ejercicio12;

public class Developer extends Empleado {

	private static final int TARIFA_POR_HORA = 50;

	public Developer(double horasTrabajadas) {
		super(horasTrabajadas);
	}

	@Override
	public double calcularSalario() {
		return getHorasTrabajadas() * TARIFA_POR_HORA;
	}
}
