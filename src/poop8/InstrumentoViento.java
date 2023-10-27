/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Angel Zenteno
 * Clase que simula un instrumento de viento
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {

    public InstrumentoViento() {
    }
    /**
     * sobrescritura del metodo tipo de instrumento
     * @return el tipo de instrumento tocado
     */
    @Override
    public String tipoInstrumento(){
       return "Instrumento de viento";  
    }
    /**
     * sobrescritura del metodo tipo de tocar
     * imprime que esta tocando un instrumento de viento
     */
    @Override
    public void tocar() {
        System.out.println("Tocar instrumento de viento");
    }
    /**
     * sobrescritura del metodo tipo de afinar
     * imprime que esta afinando un instrumento de viento
     */
    @Override
    public void afinar() {
        System.out.println("Afinar instrumento de viento");
    
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
}
