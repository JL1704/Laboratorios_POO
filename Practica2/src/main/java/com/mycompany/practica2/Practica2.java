/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica2;

import Aereo.Avion;
import Terrestre.Automovil;
import Aereo.Helicoptero;
import java.util.Scanner;
/**
 *
 * @author joseluisCalderonGalarza
 */
public class Practica2 {

    public static void main(String[] args) {
        
        
        Avion av = new Avion();
        Automovil auto = new Automovil();
        Helicoptero hp = new Helicoptero();
        Scanner escaner = new Scanner(System.in);
        int op;
        
        System.out.println("***Procesos de un  avion***");
        System.out.println("Compania del avion:");
        av.setCiArea(escaner.nextLine());
        System.out.println("Combustible del avion:");
        av.setCombustible(escaner.nextFloat());
        if(av.getCombustible()> 10){
            System.out.println(av.encenderMotor());
            System.out.println(av.volar(av.getCombustible()));
            System.out.println("1. Ascender - 2. Descender - 3. Giro Derecha - 4. Giro izquierda");
            op = escaner.nextInt();
            switch(op){
                case 1 -> av.ascender();
                case 2 -> av.descender();
                case 3 -> av.giroDer();
                case 4 -> av.giroIzq();
            }
        }else{
            System.out.println("El motor no ha encendido");
        }
        
        System.out.println("***Procesos de un Helicoptero***");
        System.out.println("Combustible del helicoptero:");
        hp.setCombustible(escaner.nextFloat());
        if(hp.getCombustible()> 10){
            System.out.println(hp.encenderMotor());
            System.out.println(hp.volar(hp.getCombustible()));
            System.out.println("1. Ascender - 2. Descender - 3. Giro Derecha - 4. Giro izquierda");
            op = escaner.nextInt();
            switch(op){
                case 1 -> hp.ascender();
                case 2 -> hp.descender();
                case 3 -> hp.giroDer();
                case 4 -> hp.giroIzq();
            }
        }else{
            System.out.println("El motor no ha encendido");
        }
        
        System.out.println("***Procesos de un  auto***");
        
        System.out.println("Color del auto: " + auto.getColor());
        System.out.println("Numero de pasajeros:");
        auto.setNumPasajeros(escaner.nextInt());
        System.out.println("Numero de cinturonos de seguridad");
        auto.setCintSeguridad(escaner.nextInt());
        System.out.println("Numero de bolsas de aire");
        auto.setCantBolAire(escaner.nextInt());
        if(auto.getCantBolAire() >= auto.getNumPasajeros() && auto.getCintSeguridad() >=  auto.getNumPasajeros()){
            System.out.println("El auto es seguro");
        }else{
            System.out.println("El auto no es seguro");
        }
        System.out.println("Combustible del auto:");
        auto.setCombustible(escaner.nextFloat());
        if(auto.getCombustible()> 10){
            System.out.println(auto.encenderMotor());
            System.out.println(auto.arrancar(auto.getCombustible()));
        }else{
            System.out.println("El motor no ha encendido");
        }
        
    }
}
