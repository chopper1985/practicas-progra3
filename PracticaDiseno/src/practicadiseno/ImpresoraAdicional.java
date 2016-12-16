/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicadiseno;

/**
 *
 * @author Estudiante
 */
public class ImpresoraAdicional {
    
    private String texto;
    private String tipoDocumento;
    private Boolean color;
    private String hoja;

    public ImpresoraAdicional() {
    }

    
    
    
    
    public ImpresoraAdicional(String texto, String tipoDocumento, Boolean color, String hoja) {
        this.texto = texto;
        this.tipoDocumento = tipoDocumento;
        this.color = color;
        this.hoja = hoja;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Boolean getColor() {
        return color;
    }

    public void setColor(Boolean color) {
        this.color = color;
    }

    public String getHoja() {
        return hoja;
    }

    public void setHoja(String hoja) {
        this.hoja = hoja;
    }

    @Override
    public String toString() {
        return "ImpresoraAdicional{" + "texto=" + texto + ", tipoDocumento=" + tipoDocumento + ", color=" + color + ", hoja=" + hoja + '}';
    }
    
    
    
}
