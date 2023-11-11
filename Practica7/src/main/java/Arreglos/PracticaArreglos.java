/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

import Transportes.Automoviles;
import java.util.Scanner;

/**
 *
 * @author josel
 */
public class PracticaArreglos {
    
    public void readArray(){
        
        String[] name = new String[5];
        Scanner escaner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre " + (i+1) + " : ");
            name[i] = escaner.nextLine();
        }
        
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        
    }
    
    public void leerAutoArray(){
        Automoviles[] auLst = new Automoviles[5];
        for (int i = 0; i < auLst.length; i++) {
            Scanner escaner = new Scanner(System.in);
            auLst[i] = new Automoviles();
            System.out.println("Ingresa la marca del auto " + (i+1) + " : ");
            auLst[i].setMarca(escaner.nextLine());
            System.out.println("Ingresa el modelo del auto " + (i+1) + " : ");
            auLst[i].setModelo(escaner.nextLine());
            System.out.println("Ingresa el color del auto " + (i+1) + " : ");
            auLst[i].setColor(escaner.nextLine());
            System.out.println("Ingresa el precio del auto " + (i+1) + " : ");
            auLst[i].setPrecio(escaner.nextFloat());
        }
        
        for (Automoviles e : auLst) {
            System.out.println(e.getMarca());
            System.out.println(e.getModelo());
            System.out.println(e.getColor());
            System.out.println(e.getPrecio());
            System.out.println(e.encenderAuto());
            System.out.println(e.avanzarAuto());
            e.apagarAuto();
        }
    }
    
}
