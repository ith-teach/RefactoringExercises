package com.refactoring.exercises.ejercicio07;

//EJERCICIO 7: Extract Superclass (Extraer Superclase)
//Extrae los atributos y métodos comunes a una superclase "Vehiculo"

public class Auto extends Vehicle {

    public void arrancar() {
        System.out.println("Arrancando auto");
    }	
}
