/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmaciasb
 */
public class PruebaRectangulo {
    public static void main(String[] args) {
        
    
    Rectangulo Rectangulo1 = new Rectangulo(10,20);
    Rectangulo Rectangulo2 = new Rectangulo(5,6);
    Rectangulo Rectangulo3 = new Rectangulo(100,33);
    
    double Area1 =  Rectangulo1.CalcularArea();
    double Perimetro1 = Rectangulo1.CalcularPerimetro();
    double Area2 =  Rectangulo2.CalcularArea();
    double Perimetro2  = Rectangulo2.CalcularPerimetro();
    double Area3 = Rectangulo3.CalcularArea();
    double Perimetro3 = Rectangulo3.CalcularPerimetro();
    System.out.println("Area 1:"+Area1);
    
    
    }
    
    
}
