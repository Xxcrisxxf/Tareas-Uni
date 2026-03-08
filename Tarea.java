/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;
import java.util.Scanner;
/**
 *
 * @author CRISBV
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

    /**
     * @param args
     */
   
        Scanner leer = new Scanner(System.in);
        int [][] asientos = new int[3][4];
        System.out.print("Ingrese la fila 0 a 2: ");
        int f = leer.nextInt();
        System.out.print("Ingrese columna (0 a 3)");
        int c = leer.nextInt();

        asientos[f][c] = 1;

        System.out.print("Estado de sala : ");
        for(int i = 0;i <= 2;i++){
        for(int j = 0;j <= 3;j++){
            System.out.print(asientos[i][j] + " ");

        }   
        System.out.println(" "); 
        }
    }

    }
    

