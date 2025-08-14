
/**
 * Write a description of class OrdenVector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class OrdenVector {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double[] vec = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero: ");
            vec[i] = teclado.nextDouble();
        }

        for (int i = 0; i < vec.length - 1; i++) {
            for (int j = 0; j < vec.length - 1 - i; j++) {
                if (vec[j] > vec[j + 1]) {
                    double temp = vec[j];
                    vec[j] = vec[j + 1];
                    vec[j + 1] = temp;
                }
            }
        }

        System.out.println("Menor: " + vec[0]);

        System.out.print("Elementos: ");
        for (double num : vec) {
            System.out.print(num + "\t");
        }
    }
}