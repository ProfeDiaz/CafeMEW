/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5toproyect;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pre = new Scanner(System.in);
        
        int a, b, suma, resta, multi, div;
        String m = "El resultado es: ";
        System.out.println("Cual es el primero numero");
        a = pre.nextInt();
        System.out.println("Cual es el primero numero");
        b = pre.nextInt();
        
        suma = a + b;
        resta = a - b;
        multi = a * b;
        div = a / b;
        
        System.out.println(m + suma);
        System.out.println(m + resta);
        System.out.println(m + multi);
        System.out.println(m + div);
        
        if (suma >= 30){
            System.out.println("Eso es correcto");
        }
        else{
            System.out.println("Eso es falso");
        }
        
        
    }
    
}
