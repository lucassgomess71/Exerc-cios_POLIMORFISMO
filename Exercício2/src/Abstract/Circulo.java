/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author Admin
 */
public class Circulo extends Forma {
    public double Pi;
    public double R;
    public double areaCirculo;

    public Circulo(double Pi, double R ) {
        this.Pi = Pi;
        this.R = R;    
    }
    
    
    
    @Override
    void calcularArea(){
        areaCirculo = Pi * (R * R);
        System.out.println("Area Circulo: " + areaCirculo);
        
    }
    
    
}
