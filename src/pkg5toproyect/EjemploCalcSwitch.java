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
public class EjemploCalcSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Scanner o = new Scanner(System.in);
        int a,b;
        String resp;
        
        System.out.println("Coloca el primer Digito");
        a = r.nextInt();
        System.out.println("Coloca el segundo Digito");
        b = r.nextInt();
        System.out.println("Coloca la operacion deseada Suma, Resta, Multiplicacion o Division");
        resp = o.nextLine();
        
        switch (resp) {
            case "Suma":
                System.out.println(a+b);
                break;
            case "Resta":
                System.out.println(a-b);
                break;
            case "Multiplicacion":
                System.out.println(a*b);
                break;
            case "Division":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Elije una opcion Valida");
                break;
        }
    }
    
}
