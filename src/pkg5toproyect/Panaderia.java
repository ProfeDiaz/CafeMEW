package pkg5toproyect;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santi
 */
public class Panaderia {

    String Tipo;
    int Precio;
    String Nombre;
    int Cantidad;

    public Panaderia(String tipo, int precio, String nombre, int cantidad) {
        this.Tipo = tipo;
        this.Precio = precio;
        this.Nombre = nombre;
        this.Cantidad = cantidad;
    }
    
    public Panaderia(){
        
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    public void Postre(String Sab, String Tip, int Can){
        System.out.println("Su postre es: " + Sab + " Su tipo es:  " + Tip + " te llevas:  " + Can);
    }
    
    
    }
