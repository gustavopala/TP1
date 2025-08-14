
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo{
    public static void main (String [] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[0]);
        double semiperimetro = (a+b+c)/2;
        double area = Math.sqrt(semiperimetro*
        (semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c));
       System.out.println("semiperimetro: "+semiperimetro);
       System.out.println("area: "+area);
    }
}