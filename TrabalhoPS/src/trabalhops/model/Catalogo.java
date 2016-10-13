/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhops.model;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author mayaracoelho
 */
public class Catalogo {
    
    //private Produto[] produtos;
    //private Arquivo arq;
    Map<String, Produto> catalogo = new Hashtable();
    
    
    public Produto incluirProduto(int codigo, String nome, String descricao, LocalDate dataInicial, LocalDate dataFinal) throws IOException{
        Produto produto = new Produto(codigo, nome, descricao, dataInicial, dataFinal); 
        return produto;
    }
    
    
    
    public void add(String key, Produto produto) {
            catalogo.put(key, produto);
             
        }
    
    public void remove(String key) {
            catalogo.remove(key);
             
        }
    
    public void clear() {
            catalogo.clear();
             
        }
    
    public void checkkey(String key){
        catalogo.containsKey(key);
        
    }
    
    
    public void return_produto(String key){
        catalogo.containsKey(key); //Aqui talvez um toString
        
    }

    
    public void buscarCodigoProduto(int codigo){
        
    }
    
      @Override
    public String toString(){
        String string = "";
        for(Map.Entry<String, Produto> produto : catalogo.entrySet()){
            string += produto.getValue().toString() + "/n";
        }
      return string;  
    }
    
}
