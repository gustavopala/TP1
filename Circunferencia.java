
/**
 * Write a description of class Circunferencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Circunferencia{  
   public static void main(String [] args){
       Scanner teclado = new Scanner(System.in);
       boolean terminar = false;
       while(terminar == false){
            System.out.println("Ingrese el radio de la circunferencia: ");
            double radio = teclado.nextDouble();
            double perimetro = 2*Math.PI*radio;
            System.out.println("El perimetro de la circunferencia es de: "+" "+perimetro);
            System.out.println("Le gustaria calcular otro perimetro? (s/n) ");
            String respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("n")) {
                terminar = true;
            }
       }
   }
}