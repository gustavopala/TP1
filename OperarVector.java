
/**
 * Write a description of class OperarVector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class OperarVector{
  public static void main(String [] args){
      Scanner teclado = new Scanner(System.in);
      int index = 0;
      double [] notas = new double[5];
      double suma = 0;
      double masAlta = 0;
      do{
          System.out.println("Ingrese nota "+index);
          double nota = teclado.nextDouble();
          notas[index] = nota;
          index++;
      }while(index<5);
      System.out.print("notas ingresadas: ");
      for(int i = 0; i < 5; i++){
          suma += notas[i];
          System.out.print(notas[i] + "\t");
          if(masAlta<notas[i]){masAlta=notas[i];}
      } 
      System.out.println();
      System.out.println("Promedio: "+ suma/notas.length);
      System.out.println("Mas Alta: "+ masAlta);
  }
}