/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorbiblioteca.controle.dao;

import gerenciadorbiblioteca.controle.exceptions.ExceptionGeral;
import gerenciadorbiblioteca.model.Livro;
import gerenciadorbiblioteca.model.Quadrinho;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public interface DaoInterface<E> {
    public void salvar(E entidade, boolean sobreescrever) throws ExceptionGeral;
    public ArrayList<E> deletar(int[] ids) throws ExceptionGeral;
    public ArrayList<E> lerArquivo() throws FileNotFoundException;
}
