/*Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una 
función para cada operación matemática y deben devolver sus resultados para 
imprimirlos en el main. */
package guia4_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia4_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros.");
        System.out.println("Primer numero:");
        double num1 = leer.nextDouble();
        System.out.println("Segundo numero:");
        double num2 = leer.nextDouble();
        
        System.out.println("OPERACIONES");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Dividir");
        System.out.println("4.Multiplicar");
        System.out.println("Elija una opcion:");
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
              double retornoSuma = suma(num1,num2);
                System.out.println("La suma de ambos numeros es: " + retornoSuma);
                break;
            case 2:
                double retornoResta = resta(num1,num2);
                System.out.println("La resta de ambos numeros es: " + retornoResta);
                break;
            case 3:
                double retornoDivision = dividir(num1,num2);
                System.out.println("La division de ambos numeros es: " + retornoDivision);
                break;
            case 4:
                double retornoMultiplicar = multiplicar(num1,num2);
                System.out.println("El producto de ambos numeros es: " + retornoMultiplicar);
                break;
            default:
                System.out.println("Elija una opcion correcta");
        }
    }
    
    public static double suma(double num1, double num2){
        double suma;
        suma = num1+num2;
        return suma;
    }
    public static double resta(double num1, double num2){
        double resta;
        resta= num1-num2;
        return resta;
    }
    public static double dividir(double num1,double num2){
        double division;
        division = num1 /num2;
        return division;
    }
    public static double multiplicar(double num1, double num2){
        double producto;
        producto = num1*num2;
        return producto;
    }
    
}
