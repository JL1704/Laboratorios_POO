/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica4;

import Vehiculos.Autobus;
import Vehiculos.Avion;

/**
 *
 * @author josel
 */
public class Practica4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        Avion av = new Avion();
        Avion av2 = new Avion(100);
        Avion av3 = new Avion(100, 20);
        
        av.setModelo("Jet Privado");
        av2.avanzar(100);
        av3.volar(100);
        System.out.println(av.getModelo());
        
        Autobus bus = new Autobus();
        Autobus bus2 = new Autobus(100);
        Autobus bus3 = new Autobus(100, 200);
        
        bus.setModelo("Standard");
        bus3.avanzar(100);
        System.out.println(bus.getModelo());
        
    }
}
