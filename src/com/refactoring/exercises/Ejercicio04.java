package com.refactoring.exercises;

//EJERCICIO 4: Inline Method (Método en línea)
//Aplica inline al método "esMayor" ya que solo se usa una vez

public class Ejercicio04 {

    public int obtenerMaximo(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}
