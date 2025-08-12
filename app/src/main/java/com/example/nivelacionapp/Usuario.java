package com.example.nivelacionapp;

public class Usuario {
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Password;
    private String Telefono;

    // Constructor
    public Usuario(String nombre, String apellido, String email, String password, String telefono) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Email = email;
        this.Password = password;
        this.Telefono = telefono;
    }

    // Getters
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getTelefono() {
        return Telefono;
    }

    // Setters
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public void setTelefono(String telefono) {
        this.Telefono = telefono;
    }
}


