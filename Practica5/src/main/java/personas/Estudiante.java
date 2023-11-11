/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author josel
 */
public class Estudiante extends Persona implements IVolar{

    public Estudiante(String nombre) {
        super(nombre);
    }

    @Override
    public int run() {
        
        return 30;
        
    }
    
}
