/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author mayaracoelho
 */
public class Arquivo {

    public Arquivo() {
    }

    // The name of the file to create.
    private static final String nomeArquivo = "Arquivo.bin";
    // Put some bytes in a buffer so we can
    // write them. Usually this would be
    // image data or something. Or it might
    // be unicode text.
    String bytes = "Hello theren";
    byte[] buffer = bytes.getBytes();

    public void writeArquivo() throws IOException {

        try {
            FileOutputStream writeArquivo = new FileOutputStream(nomeArquivo);
            ObjectOutputStream os = new ObjectOutputStream(writeArquivo);
            os.write(buffer);
            os.close();
            System.out.println("Wrote " + buffer.length
                    + " bytes");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void readArquivo()throws IOException {
        try {
            FileInputStream readArquivo = new FileInputStream(nomeArquivo);
            ObjectInputStream is = new ObjectInputStream(readArquivo);
            is.read();
//            is.readByte();
            is.close();
            System.out.println("teste "+ is.read());
        
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
