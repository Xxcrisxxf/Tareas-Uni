/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;
import java.util.Scanner;
/**
 *
 * @author CRISBV
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static int calcularPrecio(int precio,int cantidad){
        int total = precio * cantidad;
        return total;
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Escriba el precio del producto: ");
        int precio = leer.nextInt();
        System.out.print("Escriba la cantidad que se va a llevar: ");
        int cantidad = leer.nextInt();
        int resultado = calcularPrecio(precio, cantidad);

        System.out.println(resultado);

    }
    
    
}
