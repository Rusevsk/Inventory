package com.example.inventory.entidades;

public class Clientes {

    private int id;
    private String nombre;
    private String Estado;
    private String Cedula;
    private String Fecha;
    private String telefono;
    private String correo_electornico;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*public String getEstado() {return Estado;    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }*/

    public String getTelefono() {
        return telefono;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_electornico() {
        return correo_electornico;
    }

    public void setCorreo_electornico(String correo_electornico) {
        this.correo_electornico = correo_electornico;
    }
}