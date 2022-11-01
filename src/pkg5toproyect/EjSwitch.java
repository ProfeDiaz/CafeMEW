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
public class EjSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner puerta = new Scanner(System.in);
        int opcion;
        
        System.out.println("Te encuentras en la puerta de ipisa a las 3 AM que haces");
        System.out.println("1.Entras o 2.te quedas fuera");
        opcion = puerta.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Te agarro el padre y te secuestro");
                break;
            case 2:
                System.out.println("Te Atracaron");
                break;
            default:
                System.out.println("Como quiera te atracan");
                break;
        }
    }
    
}
