/*Escribir un programa que procese una secuencia de caracteres ingresada
por teclado y terminada en punto, y luego codifique la palabra o frase ingresada
de la siguiente manera: cada vocal se reemplaza por el carácter que se indica 
en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) 
se mantienen sin cambios.
a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne
la codificación correspondiente. Utilice la estructura “según” para la 
transformación.*/
package guia4_teoria11;

import java.util.Scanner;


/**
 *
 * @author BANGHO
 */
public class Guia4_Teoria11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase.");
        String frase = leer.nextLine();
        
        codificarFrase(frase);
    }
    public static void codificarFrase(String frase){
        int longitud = frase.length();
        frase = frase.toLowerCase();
        String fraseCodificada="";
        for (int i = 0; i < longitud ; i++) {
            String letra = frase.substring(i, i+1);
            switch (letra){
                case "a":
                    fraseCodificada = fraseCodificada.concat("@");
                    break;
                case "e":
                   fraseCodificada = fraseCodificada.concat("#");
                    break;
                case "i":
                    fraseCodificada = fraseCodificada.concat("$");
                    break;
                case "o":
                    fraseCodificada = fraseCodificada.concat("%");
                    break;
                case "u":
                    fraseCodificada = fraseCodificada.concat("*");
                    break;
                default:
                    fraseCodificada = fraseCodificada.concat(letra);
            }
        }
            System.out.println("La frase codificada es:");
            System.out.println(fraseCodificada);
       
    }
}
