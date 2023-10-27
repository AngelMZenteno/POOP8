/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Zenteno Loyola Angel Maurice
 * Simula una interfaz de un poligono
 */
public abstract class Poligono extends Object {
    /**
     * constructor
     */
    public Poligono() {
    }
    /**
     * Metodo para obtener el area del poligono
     * @return el area del poligono
     */
    public abstract int area();
    
    /**
     * Metodo para obtener el perimetro del poligono
     * @return el perimetro del poligono
     */
    public abstract int perimetro();
    
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
 
}
