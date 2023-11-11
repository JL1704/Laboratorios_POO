/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author josel
 */
public abstract class VehiculosTransporte {
    
    private String modelo;
    private int comb;
    
    public abstract String encendermotor(int combustible);
    public abstract void avanzar(int combustible);
    public abstract void velocidad(int combustble);
    
    public void vueltaIzquierda(int combustible){
        System.out.println("Vehiculo girando a la izquierda");
    }
    
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the comb
     */
    public int getComb() {
        return comb;
    }

    /**
     * @param comb the comb to set
     */
    public void setComb(int comb) {
        this.comb = comb;
    }
    
}
