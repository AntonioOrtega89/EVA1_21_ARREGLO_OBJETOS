/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_21_arreglo_objetos;

/**
 *
 * @author JOSE ALBERTO PEREZ
 */
public class EVA1_21_ARREGLO_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] aPersonas = new Persona[10];//ARREGLO TAMAÑO 10 QUE ALMACENA OBJETOS DE TIPO PERSONA
        //PARA USAR OBJETO, DEBEN CREARLO
        //PARA CREAR UN OBJETO USAN NEW
        //SI NO LO CREAN, NO EXISTE
        for (int i = 0; i < aPersonas.length; i++) {
            aPersonas[i] = new Persona(); //CREO UN OBJETO DE TIPO PERSONA EN LA POSICION i
           
            
        }
        for (int i = 0; i < aPersonas.length; i++) {
            System.out.println("Nombre: " + aPersonas[i].getNombre());
        }
    }
    
}

class Persona{
    private String nombre;
    
    String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
