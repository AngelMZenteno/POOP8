/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Zentneo Loyola Angel Maurice
 * Programa que simula un cuadrilatero 
 */
public class Cuadrilatero extends Poligono {
    private int alfa,beta,a,b,base,alt;
    /**
     * constructor vacio
     */
    public Cuadrilatero() {
    }
    /**
     * 
     * @param alfa=angulo alfa del cuadrilatero
     * @param beta=angulo beta del cuadrilatero
     * @param a= lado a del cuadrilatero 
     * @param b=lado b del cuadrilatero 
     * @param base= base del cuadrilatero
     * @param alt = altura del cuadrilatero
     */
    public Cuadrilatero(int alfa, int beta, int a, int b, int base, int alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.alt = alt;
    }
    /**
     * Metodo getAlfa
     * @return el valor del angulo alfa del cuadrilatero 
     */
    public int getAlfa() {
        return alfa;
    }
    /**
     * Metodo setAlfa
     * @param alfa Modifica el valor del angulo alfa del cuadrilatero 
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }
    /**
     * Metodo getBeta
     * @return el valor del angulo beta del cuadrilatero 
     */
    public int getBeta() {
        return beta;
    }
    /**
     * Metodo setBeta
     * @param beta Modifica el valor del angulo beta del cuadrilatero 
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * Metodo getA
     * @return el valor del lado a del cuadrilatero 
     */
    public int getA() {
        return a;
    }
    /**
     * Metodo setA
     * @param a Modifica el valor del lado a del cuadrilatero 
     */
    public void setA(int a) {
        this.a = a;
    }
    /**
     * Metodo getB
     * @return el valor del lado b del cuadrilatero 
     */
    public int getB() {
        return b;
    }
    /**
     * Metodo setB
     * @param b Modifica el valor del lado b del cuadrilatero   
     */
    public void setB(int b) {
        this.b = b;
    }
    /**
     * Metodo getBase
     * @return el valor de la base del cuadrilatero 
     */
    public int getBase() {
        return base;
    }
    /**
     * Metodo setBase
     * @param base Modifica el valor de la base del cuadrilatero  
     */
    public void setBase(int base) {
        this.base = base;
    }
    /**
     * Metodo getAlt
     * @return el valor de la altura del cuadrilatero 
     */
    public int getAlt() {
        return alt;
    }
    /**
     * Metodo setAlt
     * @param alt Modifica el valor de la alura del cuadrilatero  
     */
    public void setAlt(int alt) {
        this.alt = alt;
    }
    /**
     * Sobreescritura del método perimetro
     * @return el perimetro del cuadrilatero
     */
    @Override
    public int perimetro() {
        return 2*a+2*b;
    }
    /**
     * Sobreescritura del método area
     * @return el area cuadrilatero
     */
    @Override
    public int area() {
        return base*alt;
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return super.toString()+"Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", alt=" + alt + '}';
    }
    
    
    
}
