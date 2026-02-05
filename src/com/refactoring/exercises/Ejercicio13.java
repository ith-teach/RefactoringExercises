package com.refactoring.exercises;

//EJERCICIO 13: Introduce Parameter Object (Introducir Objeto de Parámetros)
//Agrupa los parámetros relacionados en un objeto "DatosPersonales"

public class Ejercicio13 {

    public void registrarPersona(DatosPersonales datos) {
    	System.out.println("Registrando persona: " + datos.getNombre() + " " + datos.getApellido());
	}
}
