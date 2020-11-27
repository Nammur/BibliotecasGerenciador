/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorbiblioteca.controle.dao;

import gerenciadorbiblioteca.controle.ControlUtil;
import gerenciadorbiblioteca.controle.exceptions.ExceptionGeral;
import gerenciadorbiblioteca.model.Livro;
import gerenciadorbiblioteca.model.Quadrinho;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo
 */
public class LivroDao implements DaoInterface<Livro>{
    
    @Override
    public ArrayList<Livro> lerArquivo() throws FileNotFoundException {
        ArrayList<Livro> livros = new ArrayList<>();
        
        File csvFile = new File("./dados/livros.csv");
        Scanner scanner = new Scanner(csvFile);
        while(scanner.hasNext()){
            
            Livro livro = new Livro();
            String[] line = scanner.nextLine().split(",");
            livro.setTitulo(line[0]);
            livro.setAutor(line[1]);
            livro.setISBN(line[2]);
            livro.setGenero(line[3]);
            livro.setNumeroPaginas(Integer.parseInt(line[4]));
            livro.setCapaDura(Boolean.parseBoolean(line[5]));
            livro.setPrateleira(line[6]);
            livros.add(livro);
        }
        return livros;    
    }

    @Override
    public void salvar(Livro livro, boolean sobreescrever) throws ExceptionGeral {
    FileWriter csvFile = null;
        try {
            String linha = "\n" + livro.getTitulo() + "," +
                    livro.getAutor() + "," +
                    livro.getISBN() + "," +
                    livro.getGenero() + "," +
                    livro.getNumeroPaginas() + "," +
                    Boolean.toString(livro.isCapaDura()) + "," +
                    livro.getPrateleira();
            
            csvFile = new FileWriter("./dados/livros.csv",sobreescrever);
            csvFile.write(linha);
            
        } catch (IOException ex) {
            Logger.getLogger(ControlUtil.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                csvFile.close();
            } catch (IOException ex) {
                Logger.getLogger(ControlUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }

    @Override
    public ArrayList<Livro> deletar(int[] ids) throws ExceptionGeral {
        
        ArrayList<Livro> livrosTabela = new ArrayList<>();
        
        
        try {
            livrosTabela = new ArrayList(lerArquivo());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LivroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i=0;i<ids.length;i++){
            System.out.println(ids[i]);
            livrosTabela.remove(ids[i]);
        }
        
        return livrosTabela;
    }
    
}
