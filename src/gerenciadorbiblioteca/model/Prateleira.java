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
public class Prateleira{
    private ArrayList<AbstractLivro> livros = new ArrayList<>();
    private String nome;
    private String estante;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public ArrayList<AbstractLivro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<AbstractLivro> livros) {
        this.livros = livros;
    }

    public String getEstante() {
        return estante;
    }

    public void setEstante(String estante) {
        this.estante = estante;
    }

    public Prateleira(String nome, String estante) {
        this.nome = nome;
        this.estante = estante;
    }
    
    public void adicionarLivro(){
        //todo
    }    

    public Prateleira() {
    }
    
    
}
