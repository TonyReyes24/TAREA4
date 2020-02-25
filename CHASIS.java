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
public class CHASIS {
  
    private String soporte;
    private String material;
    private String peso; 

    public CHASIS() {
    }

    public CHASIS(String soporte, String material, String peso) {
        this.soporte = soporte;
        this.material = material;
        this.peso = peso;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    
    
}
