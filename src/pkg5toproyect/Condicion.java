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
public class Condicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario,clave;
        Scanner nam = new Scanner(System.in);
        
        System.out.println("Introduzca el Usuario");
        usuario = nam.nextLine();
        System.out.println("Introduzca la clave");
        clave = nam.nextLine();
        
        if ("Admin".equals(usuario) && "Admin".equals(clave)){
            System.out.println("Bienvenido " + usuario);
        }
        else{
            System.out.println("Usuario o Clave incorrecto");
        }
        
    }
    
}
