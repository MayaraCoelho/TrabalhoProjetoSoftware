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

/**
 *
 * @author mayaracoelho
 */
public class Arquivo implements Serializable {

//    private static final String nomeArquivo = "Arquivo.dat";
    private static String filePath = "teste";

    public Arquivo() {

    }

    // The name of the file to create.
//    private static final 
    // Put some bytes in a buffer so we can
    // write them. Usually this would be
    // image data or something. Or it might
    // be unicode text.
//    String bytes = "Hello there";
//    byte[] buffer = bytes.getBytes();
    public void writeArquivo(String texto) throws FileNotFoundException, IOException {
        // The name of the file to create.
        String nomeArquivo = "Arquivo.txt";

        File file = new File(nomeArquivo);
        if (!file.exists()) {
            file.createNewFile();
        }
        
        OutputStream writeArquivo = new FileOutputStream(file);
        ObjectOutputStream os = new ObjectOutputStream(writeArquivo);
        os.writeObject(texto);
//            os.close();

    }

    public String readArquivo() throws ClassNotFoundException, FileNotFoundException, IOException {
        String nomeArquivo = "Arquivo.txt";
        String dados;
        File file = new File(nomeArquivo);
        InputStream readArquivo = new FileInputStream(file);
        ObjectInputStream is = new ObjectInputStream(readArquivo);
        dados = (String) is.readObject();
//             is.close();
        return dados;

    }

//    public static void criaW() throws FileNotFoundException, IOException {
//        FileOutputStream writeArquivo = new FileOutputStream(new File(nomeArquivo), true);
//        DataOutputStream dataOs = new DataOutputStream(writeArquivo);
//        dataOs.close();
//    }
//
//    public static void criaR() throws FileNotFoundException, IOException {
//        FileInputStream readArquivo = new FileInputStream(new File(nomeArquivo));
//        DataInputStream dataIs = new DataInputStream(readArquivo);
//        dataIs.close();
//    }
//
//    public static String getFilePath() {
//        return filePath;
//    }
//
//    public static void setFilePath(String filePath) {
//        Arquivo.filePath = filePath;
//    }
//
//    public static void write(Catalogo cat, String filePath) throws IOException {
//        try {
//            Files.write(FileSystems.getDefault().getPath("", filePath), cat.toString().getBytes());
//        } catch (NoSuchFileException e) {
//            String file = criaFile();
//            criaW();
//            Files.write(FileSystems.getDefault().getPath("", file), cat.toString().getBytes());
//        }
//    }
//
//    public static String read(String filePath) throws IOException {
//        try {
//            byte[] fileData = Files.readAllBytes(FileSystems.getDefault().getPath("", filePath));
//            return new String(fileData);
//        } catch (NoSuchFileException e) {
//            String file = criaFile();
//            criaR();
//            byte[] fileData = Files.readAllBytes(FileSystems.getDefault().getPath("", filePath));
//            return new String(fileData);
//        }
//    }
//
//    public static String criaFile() throws IOException {
//
//        String filename = "Arquivo.bin";
//        String workingDirectory = System.getProperty("user.dir");
//        String absoluteFilePath = "/Users/mayaracoelho";
//
//        absoluteFilePath = workingDirectory + File.separator + filename;
//        System.out.println("Final filepath : " + absoluteFilePath);
//
//        File file = new File(absoluteFilePath);
//        Arquivo.setFilePath(absoluteFilePath);
//
//        return absoluteFilePath;
//    }
//
//    public void atualizarArquivo(Catalogo catalogo) throws FileNotFoundException, IOException {
//
//        write(catalogo, Arquivo.getFilePath());
//
//    }
}
