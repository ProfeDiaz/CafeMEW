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
public class EjeBix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r = new Scanner(System.in);  
        int a;
        
        System.out.println("Coloca el año");
        a = r.nextInt();
        
        if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
	System.out.println("El año es bisiesto");
        else{
	System.out.println("El año no es bisiesto");
        }
    }
    
}
