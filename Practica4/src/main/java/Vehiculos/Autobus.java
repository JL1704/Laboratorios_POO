/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

import Transportes.Transportes;

/**
 *
 * @author josel
 */
public class Autobus extends Transportes {
    
    
    
    public Autobus() {
        
    }
    
    public Autobus(int gas){
        System.out.println(this.encenderMotor(gas));
    }

    public Autobus (int gas, int numPass){
        if(gas > 10)
            System.out.println(this.encenderMotor());
        else
            System.out.println("No hay gasolina");
    }

    
    private String encenderMotor(int gas) {
        String msg;
        if(gas > 10)
            msg = "Motor del Autobus Encendido";
        else
            msg = "No hay gasolina";
        return msg;
    }
    
    private String encenderMotor() {
        return "Motor del Autobus Encendido";
    }
}
