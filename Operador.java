
/**
 * Write a description of class Operador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Operador{
  public static void main (String [] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("suma: "+(a+b));
        System.out.println("resta: "+(a-b));
        System.out.println("multiplicacion: "+(a*b));
        System.out.println("division: "+(a/b));
        System.out.println("resto: "+(a%b));
    }
}