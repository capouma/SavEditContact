package com.example.findag.crearmodcontac;

/**
 * Created by findag on 7/11/14.
 */
public class Contactos
{
    private String nombre;
    private int telefono;
    public Contactos()
    {

    }
    public Contactos(String nombre, int telefono)
    {
        this.nombre = nombre;
        this.telefono = telefono;

    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getTelefono()
    {
        return telefono;
    }

    public void setTelefono(int telefono)
    {
        this.telefono = telefono;
    }
}
