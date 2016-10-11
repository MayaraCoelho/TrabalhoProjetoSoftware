/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhops;

import java.io.IOException;
import java.time.LocalDate;

/**
 *
 * @author mayaracoelho
 */
public class Catalogo {
    
    private Produto[] produtos;
    private Arquivo arq;
    
    public Produto incluirProduto(int codigo, String nome, String descricao) throws IOException{
        Produto produto = new Produto(); 
        produto.setCodigo(codigo);
        produto.setNome(nome);
        produto.setDescricao(descricao);
//        produto.setDataInicial(dataInicial);
//        produto.setDataFinal(dataFinal);
        return produto;
    }
    
    public String toString(){
      return null;  
    }
    
    public void buscarProduto(){
        
    }
}
