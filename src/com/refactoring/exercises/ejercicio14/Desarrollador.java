package com.refactoring.exercises.ejercicio14;

public class Desarrollador extends Empleado {

	public Desarrollador(String nombre) {
		super(nombre);
	}

	@Override
    public void calcularSalario() {
        System.out.println("Calculando salario de desarrollador");
    }
}
