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
public class Humano {
int Edad;
String Nombre, Apellido, Sexo, Nacionalidad;

    public Humano(int Edad, String Nombre, String Apellido, String Sexo, String Nacionalidad) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
        this.Nacionalidad = Nacionalidad;
    }

    public Humano() {
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }
    public void Haitiano(String Nom){
        System.out.println("klk morene " + Nom);
    }

}
