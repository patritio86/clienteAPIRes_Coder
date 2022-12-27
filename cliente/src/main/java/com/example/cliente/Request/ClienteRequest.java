package com.example.cliente.Request;

import java.util.Date;
import java.util.Objects;

public class ClienteRequest {
    private String nombre;
    private String apellido;
    private Date fechaNac;

    //Create constructor

    public ClienteRequest() {
    }

    public ClienteRequest(String nombre, String apellido, Date fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    //Generate set and get

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

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    //Create toString, equals and hash

    @Override
    public String toString() {
        return "ClienteRequest{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNac=" + fechaNac +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteRequest that = (ClienteRequest) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(fechaNac, that.fechaNac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, fechaNac);
    }
}
