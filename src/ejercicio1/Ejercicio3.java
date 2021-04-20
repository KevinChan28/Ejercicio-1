/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Kevin Chan
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1=300, numero2=300;
        if ( numero1<numero2 && numero1 != numero2 ) {
              System.out.println("El numero mayor es: "+numero2);
              System.out.println("El numero menor es: "+numero1);
          }
        if (numero1>numero2 && numero1!= numero2) {
            System.out.println("El numero mayor es: "+numero1);
                      System.out.println("El numero menor es: "+numero2);
        }
        if (numero1==numero2) {
            System.out.println("Los numeros son iguales");
        }
    }
    
}
