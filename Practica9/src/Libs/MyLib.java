/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libs;

/**
 *
 * @author josel
 */
public class MyLib extends Calculadora{

    public MyLib(double a, double b){
        System.out.println(this.suma(a, b));
    }
    
    private double suma(double a, double b) {
        return a + b;
    }
    
    public double resta(double a, double b) {
        return a - b;
    }

    @Override
    public double div(double a, double b) {
        return a / b;
    }
    
}