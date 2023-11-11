/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transportep3;

import Terrestre.Autobus;
import Aereo.Avion;
import Maritimo.Barco;
import java.util.Scanner;
/**
 *
 * @author josel
 */
public class TransporteP3 {

    public static void main(String[] args){
        System.out.println("Hola mundo");
        Scanner escaner = new Scanner(System.in);
        
        Avion avi = new Avion();
        System.out.println("Combutible del avion: ");
        avi.setComb(escaner.nextInt());
        System.out.println("Compania del avion: ");
        avi.setCompany(escaner.nextLine());
        if(avi.getComb() > 1)
        {
            System.out.println(avi.encendermotor(avi.getComb()));
            avi.avanzar(avi.getComb());
            avi.velocidad(avi.getComb());
        }
        
        Autobus au = new Autobus();
        System.out.println("Combutible del autobus: ");
        au.setComb(escaner.nextInt());
        System.out.println("Asientos del autobus: ");
        au.setCantAsientos(escaner.nextInt());
        if(au.getComb() > 1)
        {
            System.out.println(au.encendermotor(au.getComb()));
            au.avanzar(au.getComb());
            au.velocidad(au.getComb());
            au.viaje(au.getCantAsientos());
        }
        
        Barco br = new Barco();
        System.out.println("Combutible del barco: ");
        br.setComb(escaner.nextInt());
        System.out.println("Carga del barco: ");
        br.setCantCarga(escaner.nextInt());
        if(br.getComb() > 1)
        {
            System.out.println(br.encendermotor(br.getComb()));
            br.avanzar(br.getComb());
            br.velocidad(br.getComb());
        }
    }
    
}
