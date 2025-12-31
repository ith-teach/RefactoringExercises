package com.refactoring.exercises.ejercicio14;

//EJERCICIO 14: Pull Up Method/Field (Subir Método/Campo)
//Sube los métodos comunes a la clase base "Empleado"

abstract public class Empleado {

	private String nombre;

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public String obtenerNombre() {
	    return nombre;
	}

    public abstract void calcularSalario();
}
