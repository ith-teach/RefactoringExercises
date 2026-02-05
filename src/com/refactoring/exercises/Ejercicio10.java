package com.refactoring.exercises;

//EJERCICIO 10: Change Method Signature (Cambiar Firma del Método)
//Cambia el orden de los parámetros y agrega un parámetro con valor por defecto

public class Ejercicio10 {

    /**
	 * @deprecated Use {@link #crearMensaje(int,String,String,String)} instead
	 */
	public String crearMensaje(String nombre, String apellido, int edad) {
		return crearMensaje(edad, nombre, apellido, "Sr./Sra.");
	}

	public String crearMensaje(int edad, String nombre, String apellido, String titulo) {
        return "Nombre: " + nombre + " " + apellido + ", Edad: " + edad;
    }
}
