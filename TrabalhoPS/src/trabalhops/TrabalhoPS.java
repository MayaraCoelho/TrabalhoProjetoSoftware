/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhops;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author mayaracoelho
 */
public class TrabalhoPS {

    // The name of the file to create.
    private static final String nomeArquivo = "Arquivo.bin";

    public static void main(String[] args) throws IOException {

        Arquivo arq = new Arquivo();

        arq.writeArquivo();
        System.out.println("========");
        arq.readArquivo();
        

    }

}
