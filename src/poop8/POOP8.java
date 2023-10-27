/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 *
 * @author Zenteno Loyola Angel Maurice
 * Main class que es nuestra controladora
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Poligono poligono;
        Triangulo triangulo=new Triangulo();
        Cuadrilatero cuadrilatero=new Cuadrilatero();
        //System.out.println(poligono);
        System.out.println(triangulo);
        System.out.println(cuadrilatero);
        
        triangulo.setBase(4);
        triangulo.setAlt(3);
        
        cuadrilatero.setBase(4);
        cuadrilatero.setAlt(6);
        
        System.out.println(triangulo);
        System.out.println(cuadrilatero);
        System.out.println(triangulo.area());
        System.out.println(cuadrilatero.area());
        /**
         * Crea un triangulo dentro de un poligono
         * Obtiene sus atributos pero no los metodos get y set
         */
        poligono=new Triangulo();
        System.out.println(poligono);
        //System.out.println(poligono.getBase);
        //poligono no tiene el metodo get ni set pero al ser un triangulo 
        //en este caso
        getPoligono(poligono);
        poligono=new Cuadrilatero();
        getPoligono(poligono);
        
        Flauta flauta=new Flauta();
        System.out.println(flauta.tipoInstrumento());
        
        System.out.println(Math.PI);
        System.out.println("El mes "+ Meses.DOS+ " corresponde a:");   
        System.out.println(Meses.NOMBRE_MESES[Meses.DOS]);
    }
    /**
     * excepcion
     * @param poligono 
     */
    private static void getPoligono(Poligono poligono) {
        if (poligono instanceof Triangulo){
            System.out.println("Es un triangulo");
        }
        else if(poligono instanceof Cuadrilatero){
            System.out.println("Es un cuadrilatero");
        }
        else{
            System.out.println("Es un poligono");
        }
    }
    
}
