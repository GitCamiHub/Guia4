/*Crea una aplicación que nos pida un número por teclado y con una función 
se lo pasamos por parámetro para que nos indique si es o no un número primo,
debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.*/
package guia4_ejercicio4;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia4_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        boolean retorno = esPrimo(num);
        System.out.println("¿El numero " + num + " es primo? " + retorno);
    }
    public static boolean esPrimo(int num){
        int contador=0;
        boolean primo;
        for (int i = 0; i < num; i++) {
            if (num%(i+1)==0){
                contador += 1;
            }
        }
        
        if (contador==2){
            primo = true;
        }else{
            primo = false;
        }
        return primo;
    }
}
