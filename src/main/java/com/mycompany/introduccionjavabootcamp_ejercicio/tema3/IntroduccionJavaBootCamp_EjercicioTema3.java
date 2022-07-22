/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.introduccionjavabootcamp_ejercicio.tema3;

/**
 *
 * @author Nefane
 */
public class IntroduccionJavaBootCamp_EjercicioTema3 {

    /*
Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.    
    
Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.*/
    public static void main(String[] args) {
        var resultado = suma(5, 5, 5);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.incPuertas();
        System.out.println(miCoche.cantPuertas);

    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {

    public int cantPuertas = 9;

    public void incPuertas() {
        this.cantPuertas++;
    }
}
