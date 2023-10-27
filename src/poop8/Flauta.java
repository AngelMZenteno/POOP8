/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Angel Zenteno
 * Clase que simula una flauta
 */
public class Flauta extends InstrumentoViento {
     /**
     * sobreescritura del metodo tipo de instrumento
     * @return el tipo de instrumento tocado
     */
    @Override
    public String tipoInstrumento() {
        return "Flauta";
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
    
}
