/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorbiblioteca.controle.dao;

import gerenciadorbiblioteca.controle.ControlUtil;
import gerenciadorbiblioteca.controle.exceptions.ExceptionGeral;
import gerenciadorbiblioteca.model.Estante;
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
public class EstanteDao implements DaoInterface<Estante>{

    @Override
    public void salvar(Estante estante) throws ExceptionGeral {
        FileWriter file = null;
        try {
            String linha = "\n" + estante.getNome();
            
            file = new FileWriter("./dados/estantes.txt",true);
            file.write(linha);
            
        } catch (IOException ex) {
            Logger.getLogger(ControlUtil.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(ControlUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public ArrayList<Estante> deletar(int[] ids) throws ExceptionGeral {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Estante> lerArquivo() throws FileNotFoundException {
        ArrayList<Estante> estantes = new ArrayList<>();
        
        File csvFile = new File("./dados/estantes.txt");
        Scanner scanner = new Scanner(csvFile);
        while(scanner.hasNext()){
            
            Estante estante = new Estante();
            String line = scanner.nextLine();
            estante.setNome(line);
            estantes.add(estante);
        }
        return estantes;   
    }
    
}
