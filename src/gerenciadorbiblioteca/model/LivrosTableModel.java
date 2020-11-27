/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorbiblioteca.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Leonardo
 */
public class LivrosTableModel extends AbstractTableModel {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
    private List<Livro> livros = new ArrayList<>();
    private String[] colunas = {"Título","ISBN","Autor","Genero", "Páginas","Capa Dura","Prateleira" };

    public int getRowCount() {
        return livros.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0 : 
               return livros.get(rowIndex).getTitulo();
           case 1 : 
               return livros.get(rowIndex).getISBN();
           case 2 : 
               return livros.get(rowIndex).getAutor();
           case 3 : 
               return livros.get(rowIndex).getGenero();
           case 4 :
               return livros.get(rowIndex).getNumeroPaginas();
           case 5 :
               return livros.get(rowIndex).isCapaDura();
           case 6 :
               return livros.get(rowIndex).getPrateleira();
       }
       return null;
    }
    
    public void adcicionarLivro(Livro livro){
        this.livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }
    
}
