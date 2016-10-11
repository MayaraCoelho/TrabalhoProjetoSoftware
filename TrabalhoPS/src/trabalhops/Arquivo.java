/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhops;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author mayaracoelho
 */
public class Arquivo {

    public Arquivo() {
    }

    // The name of the file to create.
    private static final String nomeArquivoTXT = "test.txt";
    // Put some bytes in a buffer so we can
    // write them. Usually this would be
    // image data or something. Or it might
    // be unicode text.
    String bytes = "Hello theren";
//
//    public boolean criaArquivo() throws IOException {
//        File arquivo = new File("Arquivo.txt");
//        if (!arquivo.exists()) {
//            arquivo.createNewFile();
//            return true;
//        }else 
//            return false;
//    }

    public void writeArquivo(int codigo, String nome, String descricao) throws IOException {

        try {
            FileOutputStream writeArquivo = new FileOutputStream(new File(nomeArquivoTXT), true);
            DataOutputStream dataOs = new DataOutputStream(writeArquivo);
            System.out.println("CÓDIGO " + codigo);
            dataOs.writeBytes(codigo + "");
            dataOs.writeUTF(nome);
            dataOs.writeUTF(descricao);
            dataOs.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void readArquivo() throws IOException {
        try {
            FileInputStream readArquivo = new FileInputStream(new File(nomeArquivoTXT));
            DataInputStream dataIs = new DataInputStream(readArquivo);
            int cod = dataIs.readInt();
            String teste = dataIs.readUTF();
            System.out.println("código " + cod);
            System.out.println("teste " + teste);
            dataIs.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
