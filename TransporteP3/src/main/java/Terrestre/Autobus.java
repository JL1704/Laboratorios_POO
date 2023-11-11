/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Terrestre;

import Transporte.VehiculosTransporte;

/**
 *
 * @author josel
 */
public class Autobus extends VehiculosTransporte{
    
    private int cantAsientos;
    
    @Override
    public String encendermotor(int combustible) {
        String msg = null;
        if(combustible > 1)
            msg = "Motor del autobus encendido presionando un boton y acelerando";
        else
            msg = "No hay gasolina";
        return msg;
    }
    
    public void viaje(int cantAsi){
        System.out.println(this.pasajero(cantAsi));
    }
    
    private String pasajero(int cantAsiento){
        if(cantAsiento > 1)
            return "El autobus puede llevar pasajeros";
        else
            return "El autobus no puede llevar pasajeros";
    }

    @Override
    public void avanzar(int combustible) {
        System.out.println("Vehiculo avanzando");
        
    }
    
    @Override
    public void velocidad(int combustble) {
        System.out.println("La velocidad del carro es 75 km/h");
    }

    /**
     * @return the cantAsientos
     */
    public int getCantAsientos() {
        return cantAsientos;
    }

    /**
     * @param cantAsientos the cantAsientos to set
     */
    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }
    
}
