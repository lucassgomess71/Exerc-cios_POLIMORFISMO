/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Admin
 */
public class MainArea {
    public static void main(String[] args) {
        Forma circulo = new Circulo(3.14, 3);
        Forma retangulo =  new Retangulo(12.0, 5);
        
        circulo.calcularArea();
        
        retangulo.calcularArea();
    }
    
}