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
public class Avion extends Transportes implements Volar{

    private String ciArea;
    
    public String volar(float comb){
        if(comb > 15){
           return "El avion empieza a volar";
        }else{
           return "El avion no puede volar"; 
        }
    }
    
    /**
     * @return the ciArea
     */
    public String getCiArea() {
        return ciArea;
    }

    /**
     * @param ciArea the ciArea to set
     */
    public void setCiArea(String ciArea) {
        this.ciArea = ciArea;
    }

    @Override
    public void ascender() {
        System.out.println("El piloto eleva el morro del avión al tirar hacia sí el yugo o control yoke (volante)");
        System.out.println("El avion asciende");
    }

    @Override
    public void descender() {
        System.out.println("El piloto desciende el morro del avión al tirar hacia adelante el yugo o control yoke (volante)");
        System.out.println("El avion desciende");
    }

    @Override
    public void giroIzq() {
        System.out.println("El piloto mueve hacia la izquierda el morro del avión al girar el yugo o control yoke (volante)");
        System.out.println("El avion giro a la izquierda");
    }

    @Override
    public void giroDer() {
        System.out.println("El piloto mueve hacia la derecha el morro del avión al girar el yugo o control yoke (volante)");
        System.out.println("El avion giro a la derecha");
    }
    
    
    
}
