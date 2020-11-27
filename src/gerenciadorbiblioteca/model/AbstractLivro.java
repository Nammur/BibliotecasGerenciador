/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorbiblioteca.model;

import java.util.ArrayList;

/**
 *
 * @author Leonardo
 */
public abstract class AbstractLivro {    
    private String titulo;
    private String ISBN;
    private String genero;
    private String autor;
    private int id;
    private String prateleira;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }
    
    
    

    public AbstractLivro(String titulo, String ISBN, String genero, String autor, String prateleira) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.genero = genero;
        this.autor = autor;
        this.prateleira = prateleira;
    }
    
    public AbstractLivro(){
    
    }  
    
}
