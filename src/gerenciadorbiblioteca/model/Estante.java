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
public class Estante {
    
    private ArrayList<Prateleira> prateleiras = new ArrayList<>();
    private String nome;

    public ArrayList<Prateleira> getPrateleiras() {
        return prateleiras;
    }

    public void setPrateleiras(ArrayList<Prateleira> prateleiras) {
        this.prateleiras = prateleiras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estante(String nome) {
        this.nome = nome;
    }
    
    public void adicionarPrateleira(){
        
    }

    public Estante() {
    }
    
    
    
}
