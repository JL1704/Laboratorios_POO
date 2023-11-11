/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica8;
import Form.Metodos;
import java.util.Scanner;
/**
 *
 * @author josel
 */
public class Practica8 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner escaner = new Scanner(System.in);
        Metodos eje = new Metodos();
        
        //Ejercicio 1
        System.out.println("Ingrese un caracter: ");
        eje.setCadena(escaner.nextLine());
        System.out.println("Ingrese una cadena de caracteres: ");
        eje.setCadena2(escaner.nextLine());
        eje.ejercicio1(eje.getCadena(), eje.getCadena2());
        
        //Ejercicio 2
        System.out.println("Ingrese una cadena de caracteres: ");
        eje.setCadena(escaner.nextLine());
        eje.ejercicio2(eje.getCadena());

        //Ejercicio 3a
        System.out.println("Ingrese una cadena de caracteres: ");
        eje.setCadena(escaner.nextLine());
        eje.ejercicio3a(eje.getCadena());
        
        //Ejercicio 3b
        System.out.println("Ingrese una cadena de caracteres: ");
        eje.setCadena(escaner.nextLine());
        eje.ejercicio3b(eje.getCadena());
        
        //Ejercicio 4
        System.out.println("Ingrese una cadena de caracteres: ");
        eje.setCadena(escaner.nextLine());
        eje.ejercicio4(eje.getCadena());
        
        //Ejercicio 5
        System.out.println("Ingrese una cadena de caracteres: ");
        eje.setCadena(escaner.nextLine());
        eje.ejercicio5(eje.getCadena());
        
        //Ejercicio 6
        System.out.println("Ingrese una cadena de caracteres: ");
        eje.setCadena(escaner.nextLine());
        System.out.println("Ingrese otra cadena de caracteres: ");
        eje.setCadena2(escaner.nextLine());
        System.out.println("Ingrese otra cadena de caracteres: ");
        eje.setCadena3(escaner.nextLine());
        eje.ejercicio6(eje.getCadena(), eje.getCadena2(), eje.getCadena3());
        
        
        
        
    }
}
