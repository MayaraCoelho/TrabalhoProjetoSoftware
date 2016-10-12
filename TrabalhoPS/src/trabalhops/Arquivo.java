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
import java.time.LocalDate;

/**
 *
 * @author mayaracoelho
 */
public class Arquivo {

    public Arquivo() {
    }

    private static final String nomeArquivoTXT = "test.txt";

    public void writeArquivo(int codigo, String nome, String descricao, LocalDate dataInicial, LocalDate dataFinal) throws IOException {

        try {
            FileOutputStream writeArquivo = new FileOutputStream(new File(nomeArquivoTXT), true);
            DataOutputStream dataOs = new DataOutputStream(writeArquivo);
            dataOs.writeBytes(codigo + " ");
            dataOs.writeUTF(nome + " ");
            dataOs.writeUTF(descricao + " ");
            dataOs.writeBytes(dataInicial + " ");
            dataOs.writeBytes(dataFinal + " ");
            dataOs.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void readArquivo() throws IOException {
        try {
            FileInputStream readArquivo = new FileInputStream(new File(nomeArquivoTXT));
            DataInputStream dataIs = new DataInputStream(readArquivo);
            byte[] fileData = new byte[(int) (nomeArquivoTXT.length())];

            byte cod = dataIs.readByte();
//            System.out.println("condigo: " + cod);
//            String nom = dataIs.readUTF();
//            System.out.println("nome: " + nom);
//            String des = dataIs.readUTF();
//            System.out.println("descrição: " + des);
//            byte dai = dataIs.readByte();
//            System.out.println("data inicial: " + dai);
//            byte daf = dataIs.readByte();
//            System.out.println("data final: " + daf);
//            dataIs.readByte();
//            String token[] = str.split(" ");
//            dataIs.readUTF();
//            dataIs.readUTF();
//            dataIs.readByte();
//            dataIs.readByte();
            System.out.println("cod do arquivo " + cod);
            //            while (dataIs != null) {
            //                if (dataIs.readByte() == codigo) {
            //                    System.out.println("IGUAL");
            //                } else {
            //                    dataIs.readByte();
            //                }
            //            }
            //            dataIs.readUTF();
            dataIs
                    .close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
