/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorbiblioteca.model;

/**
 *
 * @author Leonardo
 */
public class Quadrinho extends AbstractLivro {
    private String tipo; // gibí/mangá/HQ
    private boolean colorido = false;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isColorido() {
        return colorido;
    }

    public void setColorido(boolean colorido) {
        this.colorido = colorido;
    }

    public Quadrinho(String titulo, String ISBN, String genero, String autor,String tipo, String prateleira, boolean colorido) {
        super(titulo, ISBN, genero, autor, prateleira);
        this.tipo = tipo;
        this.colorido = colorido;
    }

    public Quadrinho() {
        
    }
    
    
    
}
