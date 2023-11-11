/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aereo;

import Transporte.VehiculosTransporte;

/**
 *
 * @author josel
 */
public class Avion extends VehiculosTransporte{
    
    private String Company;

    @Override
    public String encendermotor(int combustible) {
        return "Motor del avion encendido presionando un boton rojo";
    }

    private String compan(){
        return "\nDisfrute su vuelo";
    }
    
    
    @Override
    public void avanzar(int combustible) {
        System.out.println("Quitamos freno, aceleramos y avanzamos");
    }

    @Override
    public void velocidad(int combustble) {
        System.out.println("El avion tiene una velocidad de 0.77 M");
        System.out.println(this.compan());
    }

    /**
     * @return the Company
     */
    public String getCompany() {
        return Company;
    }

    /**
     * @param Company the Company to set
     */
    public void setCompany(String Company) {
        this.Company = Company;
    }
    
}
