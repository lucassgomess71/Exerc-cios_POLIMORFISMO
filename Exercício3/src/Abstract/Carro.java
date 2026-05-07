/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author Admin
 */
public class Carro extends Veiculo {
    public String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }
    
    
    void mover(){
       System.out.println( modelo + "esta se Movimentando"); 
    }
    
}
