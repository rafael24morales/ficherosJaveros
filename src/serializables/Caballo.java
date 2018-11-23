/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializables;

import java.io.Serializable;

/**
 *
 * @author rafaelm
 */
public class Caballo implements Serializable{
    private static final long serialVerionUID = 376245763457652L;
    private String nombre;
    private String color;
    private String raza;

    public Caballo() {
    }

    public Caballo(String nombre, String color, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
