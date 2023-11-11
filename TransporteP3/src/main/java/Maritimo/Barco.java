/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maritimo;

import Transporte.VehiculosTransporte;

/**
 *
 * @author josel
 */
public class Barco extends VehiculosTransporte{
    
    private int cantCarga;

    @Override
    public String encendermotor(int combustible) {
        return "Motor del barco encendido jalando una palanca";
    }
    
    private void cargaLista(){
        System.out.println("Carga Lista para avanzar");
    }
    
    private void elevarAncla(){
        System.out.println("Elevando ancla");
    }
    
    @Override
    public void avanzar(int combustible) {
        this.cargaLista();
        this.elevarAncla();
        System.out.println("Quitamos freno, aceleramos y avanzamos");
    }
    
    @Override
    public void velocidad(int combustble) {
        System.out.println("El barco tiene una velocidad de 20 nudos");
    }

    /**
     * @return the cantCarga
     */
    public int getCantCarga() {
        return cantCarga;
    }

    /**
     * @param cantCarga the cantCarga to set
     */
    public void setCantCarga(int cantCarga) {
        this.cantCarga = cantCarga;
    }
}
