/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1;

/**
 *
 * @author usuario
 */
public class Fraccion {
    
   int numerador;
    int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void imprimir() {
        System.out.println(numerador + "/" + denominador);
    }

    public void invertirSigno() {
        numerador *= -1;
    }

    public void invertir() {
        int temp = numerador;
        numerador = denominador;
        denominador = temp;
    }

    public double aDouble() {
        return (double) numerador / denominador;
    }

    public void reducir() {
        int mcd = mcd(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

    public static Fraccion producto(Fraccion q1, Fraccion q2) {
        int numerador = q1.numerador * q2.numerador;
        int denominador = q1.denominador * q2.denominador;
        int mcd = mcd(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
        return new Fraccion(numerador, denominador);
    }

    public static Fraccion suma(Fraccion q1, Fraccion q2) {
        int numerador = q1.numerador * q2.denominador + q2.numerador * q1.denominador;
        int denominador = q1.denominador * q2.denominador;
        int mcd = mcd(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
        return new Fraccion(numerador, denominador);
    }

    private static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }
    
    
}
