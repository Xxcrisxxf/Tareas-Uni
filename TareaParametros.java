/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaparametros;
import java.util.Scanner;
/**
 *
 * @author CRISBV
 */
public class TareaParametros {

    /**
     * @param args the command line arguments
     */
    public static int precio_Total(int compra_1, int compra_2){
    int total_compra = compra_1 + compra_2;
    return total_compra;
    }
    public static void main(String[] Args){

    Scanner leer = new Scanner(System.in);
    System.out.print("Cual es su primera compra: ");
    int compra_1 = leer.nextInt();
    System.out.print("Cual es su segunda compra: ");
    int compra_2 = leer.nextInt();
    
    int resultado = precio_Total(compra_1,compra_2);

    System.out.println("El total de la compra es: " + resultado);   
    }
}