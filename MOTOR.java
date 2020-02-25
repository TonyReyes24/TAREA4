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
public class MOTOR {
    private String cilindro;
    private String bujia;
    private String tamaño;

    public MOTOR() {
    }

    public MOTOR(String cilindro, String bujia, String tamaño) {
        this.cilindro = cilindro;
        this.bujia = bujia;
        this.tamaño = tamaño;
    }

    public String getCilindro() {
        return cilindro;
    }

    public void setCilindro(String cilindro) {
        this.cilindro = cilindro;
    }

    public String getBujia() {
        return bujia;
    }

    public void setBujia(String bujia) {
        this.bujia = bujia;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
