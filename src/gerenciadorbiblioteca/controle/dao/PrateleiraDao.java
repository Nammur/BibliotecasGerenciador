/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorbiblioteca.controle.dao;

import gerenciadorbiblioteca.controle.ControlUtil;
import gerenciadorbiblioteca.controle.exceptions.ExceptionGeral;
import gerenciadorbiblioteca.model.Prateleira;
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
public class PrateleiraDao implements DaoInterface<Prateleira>{

    @Override
    public void salvar(Prateleira prateleira) throws ExceptionGeral {
        FileWriter file = null;
        try {
            String linha = "\n" + prateleira.getNome();
            
            file = new FileWriter("./dados/prateleiras.txt",true);
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
    public ArrayList<Prateleira> deletar(int[] ids) throws ExceptionGeral {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Prateleira> lerArquivo() throws FileNotFoundException {
        ArrayList<Prateleira> prateleiras = new ArrayList<>();
        
        File csvFile = new File("./dados/prateleiras.txt");
        Scanner scanner = new Scanner(csvFile);
        while(scanner.hasNext()){
            
            Prateleira prateleira = new Prateleira();
            String line = scanner.nextLine();
            prateleira.setNome(line);
            prateleiras.add(prateleira);
        }
        return prateleiras;   
    }
    
}
