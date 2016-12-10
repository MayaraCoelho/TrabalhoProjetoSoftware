/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhops.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Map;
import trabalhops.model.Catalogo;
import trabalhops.model.Produto;

/**
 *
 * @author mayaracoelho
 */
public class Arquivo implements Serializable {

    private static String filePath = "teste";

    public Arquivo() {

    }
    
    public void writeArquivoCatalogo(Map<String, Produto> catalogo) throws FileNotFoundException, IOException {
        // The name of the file to create.
        String nomeArquivo = "Arquivo.dat";

        File file = new File(nomeArquivo);
        if (!file.exists()) {
            file.createNewFile();
        }
        
        OutputStream writeArquivo = new FileOutputStream(file);
        ObjectOutputStream os = new ObjectOutputStream(writeArquivo);
        os.writeObject(catalogo);

    }

    public Map<String, Produto> readArquivoCatalogo() throws ClassNotFoundException, FileNotFoundException, IOException {
        String nomeArquivo = "Arquivo.dat";
        Map<String, Produto> dados;
        File file = new File(nomeArquivo);
        InputStream readArquivo = new FileInputStream(file);
        ObjectInputStream is = new ObjectInputStream(readArquivo);
        dados = (Map<String, Produto>) is.readObject();
        return dados;

    }

}
