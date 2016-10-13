/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhops.controller;

import trabalhops.model.Catalogo;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.time.LocalDate;

/**
 *
 * @author mayaracoelho
 */
public class Arquivo {

    private static final String nomeArquivo = "Arquivo.bin";

    public Arquivo() {
    }

    public static void write(Catalogo cat, String filePath) throws IOException {
        Files.write(FileSystems.getDefault().getPath("", filePath), cat.toString().getBytes());
    }

    public static String read(String filePath) throws IOException {
        try {
            byte[] fileData = Files.readAllBytes(FileSystems.getDefault().getPath("", filePath));
            return new String(fileData);
        } catch (NoSuchFileException e) {
            return "";
        }
    }

    public void criaFile() throws IOException {

        String filename = "Arquivo.bin";
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";

        absoluteFilePath = workingDirectory + File.separator + filename;
        System.out.println("Final filepath : " + absoluteFilePath);

        File file = new File(absoluteFilePath);

        try {
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File is already existed!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
