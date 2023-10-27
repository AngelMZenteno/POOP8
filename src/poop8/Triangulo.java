/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Zenteno Loyola Angel Maurice
 * Clase que simula un triangulo
 */
public class Triangulo extends Poligono{
    private int alfa,beta,gamma;
    private float a,b,c,base,alt;
    /**
     * constructor vacio
     */
    public Triangulo() {
    }
    /**
     * 
     * @param alfa=angulo alfa del triangulo
     * @param beta=angulo beta del triangulo
     * @param gamma=anguno gamma del triangulo
     * @param a= lado a del triangulo
     * @param b=lado b del triangulo 
     * @param c= lado c del triangulo
     * @param base= base del triangulo
     * @param alt = altura del triangulo
     */
    public Triangulo(int alfa, int beta, int gamma, float a, float b, float c, float base, float alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.alt = alt;
    }

    /**
     * Metodo getAlfa
     * @return el valor del angulo alfa del triangulo 
     */
    public int getAlfa() {
        return alfa;
    }
    /**
     * Metodo setAlfa
     * @param alfa Modifica el valor del angulo alfa del triangulo 
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }
    /**
     * Metodo getBeta
     * @return el valor del angulo beta del triangulo
     */
    public int getBeta() {
        return beta;
    }
    /**
     * Metodo setBeta
     * @param beta Modifica el valor del angulo beta del triangulo 
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * Metodo getGamma
     * @return Modifica el valor de gamma del triangulo
     */
    public int getGamma() {
        return gamma;
    }
    /**
     * Metodo setGamma
     * Modifica el valor de gamma del triangulo
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }
    /**
     * Metodo getA
     * @return el valor del lado a del triangulo
     */
    public float getA() {
        return a;
    }
    /**
     * Metodo setA
     * @param a Modifica el valor del lado a del triangulo
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * Metodo getB
     * @return el valor del lado b del triangulo
     */
    public float getB() {
        return b;
    }
    /**
     * Metodo setB
     * @param b Modifica el valor del lado b del triangulo   
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     * Metodo getBase
     * @return el valor de la base del triangulo
     */
    public float getBase() {
        return base;
    }
    /**
     * Metodo setBase
     * @param base Modifica el valor de la base del triangulo 
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * Metodo getAlt
     * @return el valor de la altura del triangulo
     */
    public float getAlt() {
        return alt;
    }
    /**
     * Metodo setAlt
     * @param alt Modifica el valor de la alura del triangulo  
     */
    public void setAlt(float alt) {
        this.alt = alt;
    }
    
    /**
     * Sobrescritura del método area
     * @return el area triangulo
     */

    @Override
    public int area(){
        return (int) ((base*alt)/2);
    }
    /**
     * Sobrescritura del método perimetro
     * @return el perimetro del triangulo
     */
    @Override
    public int perimetro(){
        return (int)(a+b+c);
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return super.toString()+"Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", alt=" + alt + '}';
    }
    
    
}
