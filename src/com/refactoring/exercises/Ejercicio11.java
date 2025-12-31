package com.refactoring.exercises;

//EJERCICIO 11: Encapsulate Field (Encapsular Campo)
//Genera getters y setters para los campos públicos

public class Ejercicio11 {

    private String nombre;
    private int edad;
    private String email;
    
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if (email != null && email.contains("@")) {
			this.email = email;
		}
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
