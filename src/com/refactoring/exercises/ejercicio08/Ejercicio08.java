package com.refactoring.exercises.ejercicio08;

//EJERCICIO 8: Extract Interface (Extraer Interfaz)
//Extrae una interfaz "Reproducible" con los métodos públicos

public class Ejercicio08 implements Reproducible {

    @Override
	public void reproducir() {
        System.out.println("Reproduciendo");
    }
    
    @Override
	public void pausar() {
        System.out.println("Pausando");
    }
    
    @Override
	public void detener() {
        System.out.println("Deteniendo");
    }
    
    private void cargarArchivo() {
        System.out.println("Cargando archivo");
    }
}
