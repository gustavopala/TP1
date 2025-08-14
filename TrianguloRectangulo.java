
/**
 * Write a description of class TrianguloRectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrianguloRectangulo{
    public static void main(String [] args){
        double h = Double.parseDouble(args[0]);
        double l1 = Double.parseDouble(args[1]);
        double l2 = Double.parseDouble(args[2]);
        double lados = Math.pow(l1, 2) + Math.pow(l2, 2);
        if(Math.pow(h, 2) == lados){
            System.out.println("Es un triangulo rectangulo.");
        }else{
            System.out.println("No es un triangulo rectangulo.");
        }
    }
}