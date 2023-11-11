/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica6;

/**
 *
 * @author josel
 */
import java.util.ArrayList;
import personas.*;

/**
 *
 * @author josel
 */
public class Practica6 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        float prom;
        
        Estudiante std = new Estudiante("Juan");
        System.out.println(std.getNombre() + " corre: " + std.run());
        Doctor doc = new Doctor("Jaime");
        System.out.println(doc.getNombre() + " corre: " + doc.run());
        Abogado abo = new Abogado("Jorge");
        System.out.println(abo.getNombre() + " corre: " + abo.run());
        Ingeniero ing = new Ingeniero("Jose");
        System.out.println(ing.getNombre() + " corre: " + ing.run());
        
        Persona std2 = new Estudiante("Lucas");
        System.out.println(std2.getNombre() + " corre: " + std2.run());
        Persona doc2 = new Doctor("Lorana");
        System.out.println(doc2.getNombre() + " corre: " + doc2.run());
        Persona abo2 = new Abogado("Lilia");
        System.out.println(abo2.getNombre() + " corre: " + abo2.run());
        Persona ing2 = new Ingeniero("Luis");
        System.out.println(ing2.getNombre() + " corre: " + ing2.run());
        
        prom = (std.run() + doc.run() + abo.run() + ing.run() + std2.run() + doc2.run() + abo2.run() + ing2.run()) / 8;
        System.out.println("El promedio de los corredores es: " + prom);
        
        // Practica 6
        Persona p = new Estudiante("jp");
        
        ArrayList lst = new ArrayList(5);
        lst.add("hola");
        lst.add("Mundo");
        lst.add(1);
        lst.add(2.0);
        lst.add("23534F");
        
        for(Object item: lst){
            System.out.println(item.getClass().getName());
            
            System.out.println(item.toString());
        }
        // Generics
        ArrayList <Persona> pLst = new ArrayList <Persona>(5);
        pLst.add(std);
        pLst.add(doc);
        pLst.add(ing);
        pLst.add(new Estudiante("Jorge"));
        pLst.add(new Doctor("Alberto"));
        int j = 0;
        int promedio = 0;
        for(Persona elem: pLst){
            System.out.println("For Each Elem");
            System.out.println(elem.getNombre());
            j = j + elem.run();
            System.out.println(elem.run());
        }
        promedio = j / pLst.size();
        System.out.println("El promedio de Run es: " + Integer.toString(promedio));
        
    }
}
