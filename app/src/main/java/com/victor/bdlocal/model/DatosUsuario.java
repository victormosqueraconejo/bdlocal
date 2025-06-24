package com.victor.bdlocal.model;

public class DatosUsuario {
    private int codigoUs;
    private String nombre;
    private String apellido;
    private String cedula;
    private int telefono;


    public DatosUsuario(int codigoUs, String nombre, String apellido, String cedula, int telefono) {
        this.codigoUs = codigoUs;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public int getCodigoUs() {
        return codigoUs;
    }

    public void setCodigoUs(int codigoUs) {
        this.codigoUs = codigoUs;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
