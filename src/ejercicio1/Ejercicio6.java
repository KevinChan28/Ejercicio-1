/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.*;
/**
 *
 * @author Kevin Chan
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner (System.in);
        int numero;
        System.out.println("Ingrese un numero: ");
        numero=teclado.nextInt();
        if (numero<10 && numero>0) {
            System.out.println("El numero es distinto de dos cifra");
        }
        if (numero<=99 && numero>=10) {
            System.out.println("El numero tiene dos cifras");
        }
    }
    
}
