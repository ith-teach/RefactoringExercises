package com.refactoring.exercises.ejercicio07;

public class Moto extends Vehiculo {
    
	public Moto(String marca, String modelo, int año) {
		super(marca, modelo, año);
	}

	public void arrancar() {
        System.out.println("Arrancando moto");
    }
    
    public void detener() {
        System.out.println("Deteniendo moto");
    }
}
