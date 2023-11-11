/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

/**
 *
 * @author josel
 */
public class Transportes {

    private float combustible;
    private int numPasajeros;
    
    /**
     * @return the combustible
     */
    public float getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(float combustible) {
        this.combustible = combustible;
    }

    /**
     * @return the numPasajeros
     */
    public int getNumPasajeros() {
        return numPasajeros;
    }

    /**
     * @param numPasajeros the numPasajeros to set
     */
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    
    public String encenderMotor(){
        return "Motor Encendido";
    }
    
}
