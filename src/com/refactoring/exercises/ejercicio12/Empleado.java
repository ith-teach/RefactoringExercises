package com.refactoring.exercises.ejercicio12;

public abstract class Empleado {

    private double horasTrabajadas;
    
    public Empleado(double horasTrabajadas) {
        this.setHorasTrabajadas(horasTrabajadas);
    }
    
    public abstract double calcularSalario();

	protected double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	protected void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
}
