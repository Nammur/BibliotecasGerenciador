/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorbiblioteca.controle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo
 */
public class ControlUtil {
     public int getIdIncr(){
        try {
            File csvFile = null;
            csvFile = new File("./dados/id.txt");
            Scanner scanner = new Scanner(csvFile);
            int id = scanner.nextInt();
            csvFile.delete();
            FileWriter newCsvFile = new FileWriter("./dados/id.txt");
            newCsvFile.write(String.valueOf(id+1));
            System.out.println(id);
            newCsvFile.close();
            return id;
        } catch (IOException ex) {
            Logger.getLogger(ControlUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
