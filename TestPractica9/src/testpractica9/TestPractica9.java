/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testpractica9;

import Libs.*;
/**
 *
 * @author josel
 */
public class TestPractica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyLib ml = new MyLib(10,20);
        System.out.println(ml.resta(30, 75));
        System.out.println(ml.div(50, 10));
        ml.mult(5, 10);
    }
    
}
