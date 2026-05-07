package Abstract;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Veiculo bicicleta = new Bicicleta();
       Veiculo carro = new Carro("Lamborghini Urus");
       
       carro.mover();
       
       bicicleta.mover();
    }
    
}
