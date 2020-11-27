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
public class QuadrinhoTableModel extends AbstractTableModel{
  
    private List<Quadrinho> quadrinhos = new ArrayList<>();
    private String[] colunas = {"Título","ISBN","Autor","Genero", "Tipo","Colorido","Prateleira" };

    public int getRowCount() {
        return quadrinhos.size();
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
               return quadrinhos.get(rowIndex).getTitulo();
           case 1 : 
               return quadrinhos.get(rowIndex).getISBN();
           case 2 : 
               return quadrinhos.get(rowIndex).getAutor();
           case 3 : 
               return quadrinhos.get(rowIndex).getGenero();
           case 4 :
               return quadrinhos.get(rowIndex).getTipo();
           case 5 :
               return quadrinhos.get(rowIndex).isColorido();
           case 6 :
               return quadrinhos.get(rowIndex).getPrateleira();
       }
       return null;
    }
    
    public void adcicionarQuadrinho(Quadrinho quadrinho){
        this.quadrinhos.add(quadrinho);
    }

    public List<Quadrinho> getLivros() {
        return quadrinhos;
    }
    
}

