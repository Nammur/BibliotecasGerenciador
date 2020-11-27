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
public class Livro extends AbstractLivro{
    private int numeroPaginas;
    private boolean capaDura = false;

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isCapaDura() {
        return capaDura;
    }

    public void setCapaDura(boolean capaDura) {
        this.capaDura = capaDura;
    }

    public Livro(int numeroPaginas, String titulo, String ISBN, String genero, String autor,String prateleira, boolean capaDura) {
        super(titulo, ISBN, genero, autor,prateleira);
        this.numeroPaginas = numeroPaginas;
        this.capaDura = capaDura;
    }

    public Livro() {
        
    }
    
    
    
    
}
