package com.dilanmolina.farmaciaapp.model;

public class Usuario {

    private String nombre;
    private String usuario;
    private String password;
    private String rol;

    public Usuario(){}

    public Usuario(String usuario, String password){
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario(String nombre, String usuario, String password, String rol){
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getRol() {
        return rol;
    }
}