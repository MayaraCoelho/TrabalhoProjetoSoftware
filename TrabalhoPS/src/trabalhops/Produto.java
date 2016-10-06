/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhops;

import java.util.Date;

/**
 *
 * @author mayaracoelho
 */
public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private Date dataInicial;
    private Date dataFinal;
    
    public Produto() {
    }

    public Produto(int codigo, String nome, String descricao, Date dataInicial, Date dataFinal) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
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

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
    
    
    
    
    
}
