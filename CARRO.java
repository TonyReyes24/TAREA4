/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

/**
 *
 * @author usuario
 */
public class CARRO {
    private String modelo;
    private String color; 
    private float precio;
    private LLANTA llantas;
    private MOTOR motorito;
    private CHASIS chasiss;

    public CARRO() {
    }

    public CARRO(String modelo, String color, float precio) {
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
