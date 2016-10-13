/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhops.controller;

import java.io.IOException;
import trabalhops.model.Catalogo;
import trabalhops.model.Produto;

/**
 *
 * @author mayaracoelho
 */
public class Loja {

    public void add(String key, Produto produto) throws IOException {
        if (key != null && !key.isEmpty()) {
            Catalogo cat = new Catalogo();
            cat.incluirProduto(produto.getCodigo(), produto.getNome(),
                    produto.getDescricao(), produto.getDataInicial(),
                    produto.getDataFinal());
        }

    }

}
