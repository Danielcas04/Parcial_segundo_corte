package com.example.dos_pantallas;

public class Persona {

    public String Nombre;
    public String Apellido;
    public String Direccion;
    public String Cedula;
    public String Creditos ;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getCreditos() {
        return Creditos;
    }

    public void setCreditos(String creditos) {
        Creditos = creditos;
    }

    Persona (String Nombre, String Apellido, String Direccion, String Cedula, String Creditos ) {


    }

}
