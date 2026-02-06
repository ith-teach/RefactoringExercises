package com.refactoring.exercises.ejercicio12;

//EJERCICIO 12: Replace Conditional with Polymorphism (Reemplazar Condicional con Polimorfismo)
//Reemplaza el switch con polimorfismo usando herencia

public class Ejercicio12 {

    public double calcularSalario(String tipo, double horasTrabajadas) {
    	Empleado empleado;
    	
        switch (tipo) {
            case "DESARROLLADOR":
            	empleado = new Developer(horasTrabajadas);
            case "DISEÑADOR":
            	empleado = new Designer(horasTrabajadas);
            case "TESTER":
            	empleado = new Tester(horasTrabajadas);
            default:
            	empleado = new Others(horasTrabajadas);
        }
        return empleado.calcularSalario();
    }
}
