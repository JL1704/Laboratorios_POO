/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Terrestre;

import com.mycompany.practica2.Transportes;

/**
 *
 * @author josel
 */
public class Automovil extends Transportes{

    private String color;
    private int cantBolAire;
    private int cintSeguridad;
    
    public String arrancar(float gasol){
        if(gasol > 14){
           return "El auto arranco";
        }else{
           return "El auto no arranco";
        }
    }
    
    /**
     * @return 
     */
    public String getColor() {    
       return "Azul"; 
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the cantBolAire
     */
    public int getCantBolAire() {
        return cantBolAire;
    }

    /**
     * @param cantBolAire the cantBolAire to set
     */
    public void setCantBolAire(int cantBolAire) {
        this.cantBolAire = cantBolAire;
    }

    /**
     * @return the cintSeguridad
     */
    public int getCintSeguridad() {
        return cintSeguridad;
    }

    /**
     * @param cintSeguridad the cintSeguridad to set
     */
    public void setCintSeguridad(int cintSeguridad) {
        this.cintSeguridad = cintSeguridad;
    }   
    
}
