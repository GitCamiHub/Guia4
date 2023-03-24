/*Diseñe una función que pida el nombre y la edad de N personas e imprima
los datos de las personas ingresadas por teclado e indique si son mayores 
o menores de edad. Después de cada persona, el programa debe preguntarle 
al usuario si quiere seguir mostrando personas y frenar cuando el usuario 
ingrese la palabra “No”.*/
package guia4_ejercicio2;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia4_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);  
        System.out.println("Ingrese la cantidad de personas.");
        int personas = leer.nextInt();
        leer.nextLine(); //consume el final vacio de la linea (\n)
       pedirDatos(personas,leer);
    }
    public static void pedirDatos(int personas, Scanner leer){
        int edad;
        String nombre;
        
        for (int i = 0; i < personas; i++) {
            System.out.println("Nombre persona " + (i + 1) + ":");
            nombre = leer.nextLine();
            System.out.println("Edad:");
            edad = leer.nextInt();
            leer.nextLine(); //consume \n
            if (edad >= 18) {
                System.out.println("Nombre:" + nombre + ", Edad:" + edad + ", ES MAYOR.");
            } else {
                System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", ES MENOR.");
            }
            if (i != personas - 1) {
                System.out.println("Quiere seguir mostrando personas?(Si/No)");
                String respuesta = leer.nextLine(); //lo hice con Line para que me tome el leer del inicio del bucle
                if (respuesta.equals("No")) {
                    break;
            }
        }
        }
    }
    
}
