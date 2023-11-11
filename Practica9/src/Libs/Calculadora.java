/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libs;

/**
 *
 * @author josel
 */
public abstract class Calculadora {

    public abstract double div(double a, double b);
    
    public void mult(double a, double b){
        double c;
        c = a * b;
        System.out.println(Double.toString(c));
    }
}
