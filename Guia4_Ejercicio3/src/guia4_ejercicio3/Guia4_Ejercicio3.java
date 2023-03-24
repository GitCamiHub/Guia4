/*Crea una aplicación que a través de una función nos convierta una cantidad
de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
yenes o libras. La función tendrá como parámetros, la cantidad de euros y
la moneda a convertir que será una cadena, este no devolverá ningún valor 
y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 € */
package guia4_ejercicio3;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia4_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros");
        int cantidad = leer.nextInt();
        System.out.println("A que moneda desea convertirlo? Escriba: ");
        System.out.println("Libra, Dolar o Yen.");
        
      String moneda = leer.next();
        euroAmoneda(cantidad,moneda);
    }
    public static void euroAmoneda(int cantidad, String moneda){
    double resultado;
        switch (moneda) {
            case "Libra":
                resultado = cantidad * 0.86;
               System.out.println( resultado + " Libras");
                break;
            case "Dolar":
                 resultado = cantidad * 1.28611;
                 System.out.println(resultado+ " Dolar");
                 break;
            case "Yen":
                resultado = cantidad * 129.852;
                System.out.println(resultado + " Yenes");
                break;
            default:
                System.out.println("Ingrese una opcion correcta.");
                
        }
   
       
}
   
}