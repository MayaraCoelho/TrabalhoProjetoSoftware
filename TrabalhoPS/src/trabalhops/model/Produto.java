/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhops.model;

import java.io.Serializable;
import java.time.LocalDate;
import trabalhops.Util.DateException;

/**
 *
 * @author mayaracoelho
 */
public class Produto implements Serializable {

    private int codigo;
    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;

    public Produto(int codigo, String nome, String descricao, LocalDate dataInicial, LocalDate dataFinal) throws DateException {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;

        if ((dataInicial.getYear() >= 1990) && (dataInicial.getYear() < 2017)) {
            this.dataInicial = dataInicial;
        } else {
            throw new DateException("Data incorreta.");
        }
        if ((dataInicial.getDayOfMonth()> 32) && (dataInicial.getDayOfMonth()<1)){
            this.dataInicial = dataInicial;
        } else {
            throw new DateException("Data incorreta.");
        }
        if ((dataFinal.getYear() >= 1990) && (dataFinal.getYear() < 2017)) {
            this.dataFinal = dataFinal;
        } else {
            throw new DateException("Data incorreta.");
        }

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) throws DateException {
        if ((dataInicial.getYear() >= 1990) && (dataInicial.getYear() < 2016)) {
            this.dataInicial = dataInicial;
        } else {
            throw new DateException("Data incorreta.");
        }
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) throws DateException {
        if ((dataFinal.getYear() >= 1990) && (dataFinal.getYear() < 2016)) {
            this.dataFinal = dataFinal;
        } else {
            throw new DateException("Data incorreta.");
        }
    }

    @Override
    public String toString() {
        String string;
        string = ("\nCódigo: " + codigo + "\nNome: "  + nome + 
                "\nDescricao " + descricao + "\nData Inicial " + dataInicial + 
                "\nData Final " +dataFinal);
        return string;
    }

}
