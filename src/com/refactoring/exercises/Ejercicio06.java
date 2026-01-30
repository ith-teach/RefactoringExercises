package com.refactoring.exercises;

//EJERCICIO 6: Convert Local Variable to Field (Convertir Variable Local a Campo)
//Convierte la variable "tasaInteres" en un campo de la clase

public class Ejercicio06 {

    private double tasaInteres;

	public Ejercicio06() {
		tasaInteres = 0.05;
	}

	public double calcularInteres(double capital, int meses) {
        return capital * tasaInteres * meses;
    }
}
