/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_1;

/**
 *
 * @Autores Equipo 4: Omar Alejandro Bazar, Julia Avalos, Eduardo Arizza, Gonzalo Arizza
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 1 Equipo 4: Fraccion!");

    Fraccion fraccion = new Fraccion(3, 4);
    fraccion.imprimir(); // Imprime "3/4"
    fraccion.invertirSigno();
    fraccion.imprimir(); // Imprime "-3/4"
    fraccion.invertir();
    fraccion.imprimir(); // Imprime "4/-3"
    double resultado = fraccion.aDouble();
    System.out.println(resultado); // Imprime "-1.3333333333333333"
    fraccion.reducir();
    fraccion.imprimir(); // Imprime "-4/3"
    Fraccion q1 = new Fraccion(3, 4);
    Fraccion q2 = new Fraccion(1, 2);
    Fraccion producto = Fraccion.producto(q1, q2);
    producto.imprimir(); // Imprime "3/8"
    Fraccion suma = Fraccion.suma(q1, q2);
    suma.imprimir(); // Imprime "5/4 
        
        
    
    }
}
