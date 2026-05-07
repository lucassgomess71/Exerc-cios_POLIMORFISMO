/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author Admin
 */
public class Retangulo extends Forma {
    public double base;
    public double altura;
    public double areaRetangulo;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    @Override
    void calcularArea(){
        areaRetangulo = base * altura;
        System.out.println("Area Retangulo: " + areaRetangulo);
        
    }
    
    
    
}
