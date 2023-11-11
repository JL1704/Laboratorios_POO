/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aereo;

import com.mycompany.practica2.Transportes;
import com.mycompany.practica2.Volar;

/**
 *
 * @author josel
 */
public class Helicoptero extends Transportes implements Volar{
    
    private int cantJetA;
    private int numRotores;
    private int numHelices;
    
    /**
     * @return the cantJetA
     */
    public int getCantJetA() {
        return cantJetA;
    }

    /**
     * @param cantJetA the cantJetA to set
     */
    public void setCantJetA(int cantJetA) {
        this.cantJetA = cantJetA;
    }

    /**
     * @return the numRotores
     */
    public int getNumRotores() {
        return numRotores;
    }

    /**
     * @param numRotores the numRotores to set
     */
    public void setNumRotores(int numRotores) {
        this.numRotores = numRotores;
    }

    /**
     * @return the numHelices
     */
    public int getNumHelices() {
        return numHelices;
    }

    /**
     * @param numHelices the numHelices to set
     */
    public void setNumHelices(int numHelices) {
        this.numHelices = numHelices;
    }

    @Override
    public void ascender() {
        System.out.println("El piloto mueve el cíclico hacia arriba");
        System.out.println("El helicoptero asciende");
    }

    @Override
    public void descender() {
        System.out.println("El piloto mueve el cíclico hacia abajo");
        System.out.println("El helicoptero desciende");
    }

    @Override
    public void giroIzq() {
        System.out.println("El piloto mueve el cíclico hacia la izquierda");
        System.out.println("El helicoptero giro a la izquierda");
    }

    @Override
    public void giroDer() {
        System.out.println("El piloto mueve el cíclico hacia la derecha");
        System.out.println("El helicoptero giro a la derecha");
    }

    public boolean volar(float combustible) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    
}
