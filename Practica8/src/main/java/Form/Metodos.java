/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Form;

/**
 *
 * @author josel
 */
public class Metodos {
    
    private String cadena;
    private String cadena2; 
    private String cadena3;

    /**
     * @return the caracter
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the caracter to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    /**
     * @return the cadena
     */
    public String getCadena2() {
        return cadena2;
    }

    /**
     * @param cadena2 the cadena to set
     */
    public void setCadena2(String cadena2) {
        this.cadena2 = cadena2;
    }
    
    /**
     * @return the cadena3
     */
    public String getCadena3() {
        return cadena3;
    }

    /**
     * @param cadena3 the caracter to set
     */
    public void setCadena3(String cadena3) {
        this.cadena3 = cadena3;
    }
    
    public void ejercicio1(String a, String b) {
        long contador = b.chars().filter(ch -> ch == a.charAt(0)).count();
        System.out.println("Existen " + contador + " letras " + a + " en la cadena " + b);
    }
    
    public void ejercicio2(String a) {
        
        System.out.println("Digitos: ");
        for (int i = 0; i < a.length(); i++) {
            char character = a.charAt(i);
            if (Character.isDigit(character)) {
                System.out.print(character);
            } 
        }
        System.out.println("\nLetras: ");
        for (int i = 0; i < a.length(); i++) {
            char character = a.charAt(i);
            if (Character.isLetter(character)) {
            System.out.print(character);
            }
        }
    }
    
    public void ejercicio3a(String a){
        System.out.println("La longitud de la cadena es: " + a.length());
    }
    
    public void ejercicio3b(String a) {
        int count = 0;
    
        for (char character : a.toCharArray()) {
            count++;
        }
    
        System.out.println("La longitud de la cadena es: " + count);
    }
    
    public void ejercicio4(String a) {
        System.out.println("Vocales: ");
        for (int i = 0; i < a.length(); i++) {
            char character = Character.toLowerCase(a.charAt(i));
            switch (character) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                System.out.print(character);
                break;
            }
        }
    }
    
    public void ejercicio5(String a) {
        
        System.out.println("Cadena invertida: ");
        for (int i = a.length() -1 ; i >= 0; i--) {
            char character = a.charAt(i);
            System.out.print(character);
        }  
    }
    
    public void ejercicio6(String a, String b, String c){
        System.out.println("La longitud de la cadena 1 es: " + a.length());
        System.out.println("La longitud de la cadena 2 es: " + b.length());
        System.out.println("La longitud de la cadena 3 es: " + c.length());
        
        if(a.length() >= b.length() && a.length() >= c.length()){
            System.out.println("La cadena mayor es: " + a);
        }else{
            if(b.length() >= a.length() && a.length() >= c.length()){
            System.out.println("La cadena mayor es: " + b);
            }else{
                System.out.println("La cadena mayor es: " + c);
            }
        }
    }


    
    
    


}
