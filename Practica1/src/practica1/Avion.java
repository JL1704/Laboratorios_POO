/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author josel
 */
public class Avion extends Transportes{

    private int numAlas;
    private float cantComb;
            
    /**
     * @return the numAlas
     */
    public int getNumAlas() {
        return numAlas;
    }

    /**
     * @param numAlas the numAlas to set
     */
    public void setNumAlas(int numAlas) {
        this.numAlas = numAlas;
    }

    /**
     * @return the cantComb
     */
    public float getCantComb() {
        return cantComb;
    }

    /**
     * @param cantComb the cantComb to set
     */
    public void setCantComb(float cantComb) {
        this.cantComb = cantComb;
    }
    
    private String capPlaneo(int numAlas){
            if(numAlas >= 2){
                System.out.println("El transporte si tiene capacidad de planeo");
            }else{
                System.out.println("El transporte no tiene capacidad de planeo");
           }
        return null;
    }

    
    
    
}
