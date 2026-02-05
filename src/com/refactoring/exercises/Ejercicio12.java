package com.refactoring.exercises;

import com.refactoring.exercises.ejercicio12.Designer;
import com.refactoring.exercises.ejercicio12.Developer;
import com.refactoring.exercises.ejercicio12.Empleado;

//EJERCICIO 12: Replace Conditional with Polymorphism (Reemplazar Condicional con Polimorfismo)
//Reemplaza el switch con polimorfismo usando herencia

public class Ejercicio12 {

    public double calcularSalario(String tipo, double horasTrabajadas) {
    	Empleado empleado;
        switch (tipo) {
            case "DESARROLLADOR":
            	empleado = new Developer(horasTrabajadas);
                return empleado.calcularSalario();
            case "DISEÑADOR":
            	empleado = new Designer(horasTrabajadas);
                return empleado.calcularSalario();
            case "TESTER":
                return horasTrabajadas * 35;
            default:
                return horasTrabajadas * 30;
        }
    }
}
