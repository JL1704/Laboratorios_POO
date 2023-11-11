/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

import Transportes.*;

/**
 *
 * @author josel
 */
public class Avion extends Transportes implements IVolar{

    public Avion(){
        
    }
    
    public Avion(int gas){
        System.out.println(this.encenderMotor(gas));
    }

    public Avion(int gas, int numPass){
        if(gas > 10)
            System.out.println(this.encenderMotor());
        else
            System.out.println("No hay gasolina");
    }

    
    private String encenderMotor(int gas) {
        String msg;
        if(gas > 10)
            msg = "Motor del Avion Encendido";
        else
            msg = "No hay gasolina";
        return msg;
    }
    
    private String encenderMotor() {
        return "Motor del Avion Encendido";
    }

    @Override
    public void volar(int gas) {
        System.out.println("Avion Volando");
    }
    
}
