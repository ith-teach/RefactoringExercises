package com.refactoring.exercises.ejercicio14;

public class Gerente extends Empleado {

	public Gerente(String nombre) {
		super(nombre);
	}

	@Override
    public void calcularSalario() {
        System.out.println("Calculando salario de gerente");
    }
}
