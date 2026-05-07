/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Admin
 */
public class Retangulo implements Forma {
     public double base;
    public double altura;
    public double areaRetangulo;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
   
   public void calcularArea(){
        areaRetangulo = base * altura;
        System.out.println("Area Retangulo: " + areaRetangulo);
        
    }
    
}
