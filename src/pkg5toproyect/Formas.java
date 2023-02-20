/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5toproyect;

/**
 *
 * @author santi
 */
public class Formas {
double Pi, A, P;
int R, C, H, D;

    public Formas(double Pi, double A, double P, int R, int C, int H, int D) {
        this.Pi = Pi;
        this.A = A;
        this.P = P;
        this.R = R;
        this.C = C;
        this.H = H;
        this.D = D;
    }

    public Formas (){
        
    }

    public double getPi() {
        return Pi;
    }

    public void setPi(double Pi) {
        this.Pi = Pi;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getP() {
        return P;
    }

    public void setP(double P) {
        this.P = P;
    }

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public int getH() {
        return H;
    }

    public void setH(int H) {
        this.H = H;
    }

    public int getD() {
        return D;
    }

    public void setD(int D) {
        this.D = D;
    }

    public void Circulo(){
        System.out.println("el Area del Circulo es: " + (A = Pi * R));
        System.out.println("el Perimetro del Circulo es: " + (P = 2 * Pi * R));      
    }
    
    public void Cuadrado(){
        System.out.println("el Area del Cuadrado es: " + (A = C^2));
        System.out.println("el Perimetro del Triangulo es: " + (P = 4 * C));      
    }
    
    public void Triangulo(){
        System.out.println("el Area del Triangulo es: " + (A = C * H /2));      
    }
    
    public void Rectangulo(){
        System.out.println("el Area del Rectangulo es: " + (A = C * D));
        System.out.println("el Perimetro del Rectangulo es: " + (P = 2 * C + 2 * D));      
    }
    
}
