/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5toproyect;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class EjeBu {

    /**
     * @param args the command line arguments
     */
    
    public static void Ejemplo(){
        System.out.println("Hola Mundo");
    }
    
    public static void Persona(String nombre){
        System.out.println("Tu nombre es: " + nombre);
    }
    
    public static void Usuario(String usuario, String clave){
        if (usuario == "Admin" && clave == "Admin"){
            System.out.println("Bienvenido: " + usuario);
        }
        else{
            System.out.println("Usuario o Clave incorrecto");
        }
    }
    
    public static void Puerta(int a){
        System.out.println("Elige una puerta del 1 al 3");
        if (a == 1) {
            System.out.println("Te moriste no homo");
        }
        else if (a == 2){
            System.out.println("Te volviste homo y te mataron");
        }
        else{
            System.out.println("Sobreviviste al apocalipsis gay");
        }
    }
    public static void Bucle(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Esto es un bucle" + i);
        }
    }
    public static double menor(double a, double b, double c){
        return Math.min(Math.min(a, b),c);
    }
    public static double mayor(double a, double b, double c){
        return Math.max(Math.max(a, b),c);
    }
    public static double promedio(double a, double b, double c){
        return a+b+c/3;
    }
    
     enum Nivel {
        Bajo,
        Medio,
        Alto
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
//     for (int x=1;x<=10;x++){
//            if (x == 10){
//                System.out.println("Felicidades llegaste al final " + x);
//            }
//            else{
//                System.out.println("Esta es la impresion numero: " + x);
//            }
//        }

//        for (char x = 'a'; x<='z';x++){
//            for (char y = x; y<='z';y++){
//              System.out.print(y);
//            }
//            System.out.println("");
//        }

//        Scanner n = new Scanner(System.in);
//        int m;
//        System.out.println("Coloca un Numero");
//        m = n.nextInt();
//        for (int x =1;x<=10;x++){
//            System.out.println("La tabla de Multiplicar es: " + m*x);
//        }       
//         for(int i = 1; i <=10; i++){
//            System.out.println("Numeros par"
//               + ""
//               + "es" + i * 2);
//                }
//         for(int i = 1; i <=10; i++){
//             if(i % 2 == 0){
//                 System.out.println(i + "Es numero Par");
//             }
//             else{
//                 System.out.println(i + "Es numero Impar");
//             }
//         }
//            Scanner p = new Scanner(System.in);
//            double m,g=0.03;
//            System.out.println("Coloca el monto requerido");
//            m = p.nextDouble();
//            for (int i = 1; i <= 12; i++) {
//                System.out.println("Porcentaje de ganancia " + m*g*i);
//        }
//            int i=1;
//            while(i<=10){
//                if (i==1){
//                    System.out.println("Me regalan un pollo");
//                    i++;
//                }
//                else if (i==10){
//                    System.out.println("Señore hay gente que cree que uno "
//                            + "no come con esto pero si se "
//                            + "puede mira que rico quedo");
//                    i++;
//                }
//                else{
//                System.out.println("Sigan Viendo: " + i);
//                i++;
//                    }
//            }
            //Area y perimetro de un circulo
            
//            Scanner r = new Scanner(System.in);
//            double radio;
//            System.out.println("Coloca el radio");
//            radio = r.nextDouble();
//            
//            double perimetro = 2 * Math.PI * radio;
//            double area = Math.PI * radio * radio;
//
//            System.out.println("el Perimetro es = " + perimetro);
//            System.out.println("el Area es = " + area);
//            
//            //Area y perimetro de un rectangulo
//            
//            Scanner rec = new Scanner(System.in);
//            double ancho, alto;
//            System.out.println("Coloca el Ancho");
//            ancho = rec.nextDouble();
//            System.out.println("Coloca el Alto");
//            alto = rec.nextDouble();
// 
//            double perimetror = 2*(alto + ancho);
//            double arear = ancho * alto;			
//		
//            System.out.printf("Perimetro es 2*(%.1f + %.1f) = %.2f \n", alto, ancho, perimetror);
//
//            System.out.printf("Area es %.1f * %.1f = %.2f \n", ancho, alto, arear);
//            
//            
//            //Voltear letras
//            
//            Scanner let = new Scanner(System.in);
//            System.out.print("entrar el string: ");
//            char[] letras = let.nextLine().toCharArray();
//            System.out.print("Voltear string: ");
//            for (int i = letras.length - 1; i >= 0; i--) {
//            System.out.print(letras[i]);
//            }
//            System.out.print("\n");
            
            
            //Nombre en arte
//            System.out.println("  _________              __  .__                       ");
//            System.out.println(" /   _____/____    _____/  |_|__|____     ____   ____  ");
//            System.out.println(" \\_____  \\\\__  \\  /    \\   __\\  \\__  \\   / ___\\ /  _ \\");
//            System.out.println(" /        \\/ __ \\|   |  \\  | |  |/ __ \\_/ /_/  >  <_> )");
//            System.out.println("/_______  (____  /___|  /__| |__(____  /\\___  / \\____/ ");
//            System.out.println("        \\/     \\/     \\/             \\//_____/         ");
//            
//            int nota;
//            Scanner n = new Scanner(System.in);
//            System.out.println("Coloca tu calificacion");
//            nota = n.nextInt();
//            if (nota >= 90){
//                System.out.println("Sacaste una A, Felicidades");
//            }
//            else if (nota < 90 & nota >= 80) {
//                System.out.println("Sacaste una B, Buen trabajo");
//        }
//            else if (nota < 80 && nota >= 70) {
//                System.out.println("Sacaste una C, Tienes que esforzarte");
//            
//        }
//            else{
//                System.out.println("Sacaste una D, estas reprobado");
//            }

//        String cadena="Mi vida en ipisa es muy interesante";
//  
//        int contador=0;
//        for (int i=0;i<cadena.length();i++){
//            //Comprobamos si el caracter es una vocal
//            if(cadena.charAt(i)=='a' || 
//                    cadena.charAt(i)=='e' || 
//                    cadena.charAt(i)=='i' || 
//                    cadena.charAt(i)=='o' || 
//                    cadena.charAt(i)=='u'){
//                contador++;
//            }
//        }
//  
//        System.out.println("Hay "+contador+" vocales");

//        String cadena="Mi vida en ipisa es muy interesante";
// 
//        for (int i=0;i<cadena.length();i++){
//            //Hacemos un casting para convertir el char a int
//            System.out.print((int)cadena.charAt(i)+" ");
//        }
//           String nombre, apellido;
//           Scanner nom = new Scanner(System.in);
//           System.out.println("Coloca tu nombre");
//           nombre = nom.nextLine();
//           System.out.println("Coloca tu apellido");
//           apellido = nom.nextLine();
//           for (int i = 0; i <= 20; i++) {
//               if(i <= 10){
//                   System.out.println(nombre);
//               }
//               else{
//                   System.out.println(apellido);
//               } 
//        }
//            Scanner sc = new Scanner(System.in);
//            int [] Lista = new int [4];
////            System.out.println("Coloque la primera posicion");
////            Lista[0] = sc.nextInt();
////            System.out.println("Coloque la segunda posicion");
////            Lista[1] = sc.nextInt();
////            System.out.println("Coloque la tercera posicion");
////            Lista[2] = sc.nextInt();
////            System.out.println("Coloque la cuarta posicion");
////            Lista[3] = sc.nextInt();
////            System.out.println(Arrays.toString(Lista));
//           
//            for (int i = 0; i < 4; i++) {
//            System.out.println("Coloque la posicion");
//            Lista[i] = sc.nextInt();
//        }
//            System.out.println(Arrays.toString(Lista));
            
//            Scanner sc = new Scanner(System.in);
            //int [][] numb =  {{1,2,3},{4,5,6}};
//            int [][] numb =  new int [2][2];
//          System.out.println(Arrays.deepToString(numb));

//         for (int i = 0; i<2; i++){
//             for (int j = 0; j<2; j++){
//                System.out.println("Coloque la posicion: " + i + " " + j);
//                numb[i][j] = sc.nextInt();                
//             }             
//         }
//         System.out.println(Arrays.deepToString(numb));
//         
//        int [][]a = new int[10][10];    
//        for(int i = 0; i < 10; i++)
//        {
//            for(int j = 0; j < 10; j++)
//            {
//         System.out.printf("%2d ", a[i][j]);
//                }
//            System.out.println();
//   }


//        int[] numeros = new int[]{20, 30, 25, 35, -16, 60, -100};
//       //Calcula la suma de todos los elementos en el array
//       int suma = 0;
//       for(int i=0; i < numeros.length ; i++)
//        suma = suma + numeros[i];
//       //calcula el promedio
//        double promedio = suma / numeros.length;
//        System.out.println("El promedio de los valores del array es : " + promedio); 
        
//           int[] reversararray = {
//            1789, 2035, 1899, 1456, 2013, 
//            1458, 2458, 1254, 1472, 2365, 
//            1456, 2165, 1457, 2456};
//            System.out.println("Array Original : "+Arrays.toString(reversararray));  
//            for(int i = 0; i < reversararray.length / 2; i++)
//            {
//            int temp = reversararray[i];
//            reversararray[i] = reversararray[reversararray.length - i - 1];
//            reversararray[reversararray.length - i - 1] = temp;
//            }
//            System.out.println("Reversar el Array : "+Arrays.toString(reversararray));
//        int[] matrix = {1, 3, 8, 8, 1, 1, 7, 3};
// 
//        for (int i = 0; i < matrix.length-1; i++)
//        {
//            for (int j = i+1; j < matrix.length; j++)
//            {
//                if ((matrix[i] == matrix[j]) && (i != j))
//                {
//                    System.out.println("Elementos Duplicados : "+matrix[j]);
//                }
//            }
//        }
//
//         int imparpar [][] = new int [25][25]; 
//        
//        for(int i = 1; i<25; i++){
//            System.out.println();
//            for(int a =1; a<25; a++){
//                
//            imparpar [i][a] = a*2 + i*3;
//     
//                System.out.print(imparpar [i][a]+ "\t");
//    }
//    }

//         int b,x = 100;
//
//
//        for (b = 1; b<x; b++){
//
//            if(b% 2 == 1){
//
//            System.out.println(b + "impar");
//            }
//
//            else{
//
//            System.out.println(b + "par");
//
//            }
//        }
//
//
//
//        int[][] prueba = new int [10][10];
//
//        int i,j;
//
//
//        for (i = 0; i<10; i++){
//
//            for( j = 0; j<10; j++){
//
//                System.out.println("matriz" + i + "" + j);
////                prueba[i][j] = b;
//            }
//        }
//
//        // Creamos el Array nombres
//        String [] nombres = {"Alba","Marisol","Rafaelina"};
//
//        // Mediante Arrays creamos una nueva lista
//        List<String> listaNombres = Arrays.asList(nombres);
//        
//        // Recorremos la lista elementos con un foreach
//
//        for (String str : listaNombres) {
//	System.out.println(str);
//        }
        
//        // El parametro 0 representa el indice que queremos eliminar
//        listaNombres.remove(0);
//
//        // Eliminar elemento mediante su nombre
//        listaNombres.remove("Alba");
//
//        // Para eliminar todos los elmentos de la lista usamos clear
//        listaNombres.clear();
        
//            Scanner re = new Scanner(System.in);
//            System.out.println("Agrega un numero");
//            int a = re.nextInt();
//            Ejemplo();
//            Persona("Santiago"); 
//            Usuario("Admin", "Admin");
//            Puerta(a);
//            Bucle();

//             Nivel Voltaje = Nivel.Bajo; 
//             System.out.println(Voltaje);

//        Scanner in = new Scanner(System.in);
//        System.out.print("Ingrese el primer numero: ");
//        double a = in.nextDouble();
//        System.out.print("Ingrese el segundo numero: ");
//        double b = in.nextDouble();
//        System.out.print("Ingrese el tercer numeror: ");
//        
//        double c = in.nextDouble();
//        System.out.print("el valor mas pequeño es " + menor(a, b, c)+"\n" );
//        System.out.print("el valor mas grande es " + mayor(a, b, c)+"\n" );
//        System.out.print("el valor promedio es " + promedio(a, b, c)+"\n" );
        

        
            }
           
            }
