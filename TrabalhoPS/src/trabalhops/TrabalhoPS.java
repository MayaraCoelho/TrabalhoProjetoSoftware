/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhops;

import java.io.IOException;

/**
 *
 * @author mayaracoelho
 */
public class TrabalhoPS {

    // The name of the file to create.
//    private static final String nomeArquivo = "Arquivo.bin";
    
    public static Catalogo cat = new Catalogo();
    public static Arquivo arq = new Arquivo();
    public static Arquivo arq2 = new Arquivo();
    public static int cod = 11;

    public static void main(String[] args) throws IOException {

        Produto produto = cat.incluirProduto(11, "testeC ", "tested");
        arq.writeArquivo(produto.getCodigo(), produto.getNome(), produto.getDescricao());
        Produto produto2 = cat.incluirProduto(12, "testec2 ", "tested2");
        arq2.writeArquivo(produto2.getCodigo(), produto2.getNome(), produto2.getDescricao());
        
    }

}
