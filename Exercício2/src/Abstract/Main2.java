package Abstract;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Forma circulo = new Circulo(3.14, 3);
        Forma retangulo = new Retangulo(10, 5);
        
        circulo.calcularArea();
        
        retangulo.calcularArea();
    }
    
}
