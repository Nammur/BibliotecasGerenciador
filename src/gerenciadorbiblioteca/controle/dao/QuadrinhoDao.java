/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorbiblioteca.controle.dao;

import gerenciadorbiblioteca.controle.ControlUtil;
import gerenciadorbiblioteca.controle.exceptions.ExceptionGeral;
import gerenciadorbiblioteca.model.Quadrinho;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo
 */
public class QuadrinhoDao implements DaoInterface<Quadrinho> {

    @Override
    public ArrayList<Quadrinho> lerArquivo() throws FileNotFoundException {
        ArrayList<Quadrinho> quadrinhos = new ArrayList<>();
        
        File csvFile = new File("./dados/quadrinhos.csv");
        Scanner scanner = new Scanner(csvFile);
        while(scanner.hasNext()){
            
            Quadrinho quadrinho = new Quadrinho();
            String[] line = scanner.nextLine().split(",");
            quadrinho.setTitulo(line[0]);
            quadrinho.setAutor(line[1]);
            quadrinho.setISBN(line[2]);
            quadrinho.setGenero(line[3]);
            quadrinho.setTipo(line[4]);
            quadrinho.setColorido(Boolean.parseBoolean(line[5]));
            quadrinho.setPrateleira(line[6]);
            quadrinhos.add(quadrinho);
        }
        return quadrinhos;    
    }

    @Override
    public void salvar(Quadrinho quadrinho) throws ExceptionGeral {
        FileWriter csvFile = null;
        try {
            String linha = "\n" + quadrinho.getTitulo() + "," +
                    quadrinho.getAutor() + "," +
                    quadrinho.getISBN() + "," +
                    quadrinho.getGenero() + "," +
                    quadrinho.getTipo() + "," +
                    Boolean.toString(quadrinho.isColorido()) + "," +
                    quadrinho.getPrateleira();
            
            csvFile = new FileWriter("./dados/quadrinhos.csv",true);
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
    public ArrayList<Quadrinho> deletar(int[] ids) throws ExceptionGeral {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
