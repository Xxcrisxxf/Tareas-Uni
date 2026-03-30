import java.util.Scanner;
import java.util.ArrayList;
public class colecciones {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

       System.out.print("Cuantos nombres quieres ingresar? ");
        int num = leer.nextInt();
        leer.nextLine();

        for(int i = 0; i < num; i++){
            System.out.print("Ingresa un nombre: ");
            String nombre = leer.nextLine();
            lista.add(nombre);
        System.out.println("Lista de nombres total: "+lista);
    }
    System.out.print("Desea eliminar algun nombre ? s/n: ");
    String pregunta = leer.nextLine();
    
    if (pregunta.equalsIgnoreCase("si")){
         System.out.print("Que nombre deseas eliminar? ");
        String eliminar = leer.nextLine();
        lista.remove(eliminar);
        System.out.println("Nueva lista : "+lista);
    
    }
     else{
        System.out.println("fin");
     }
        leer.close();
}
}
