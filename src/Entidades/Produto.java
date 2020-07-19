package Entidades;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
public class Produto {
    private int id;
    private String nome;
    private int codigo;
    private String unidade;
    private Float preco;
    private ArrayList<ItenVenda> itensVenda;

    public Produto()
    {
    }

    public Produto(int id, String nome, int codigo, String unidade, Float preco)
    {
	this.id = id;
	this.nome = nome;
	this.codigo = codigo;
	this.unidade = unidade;
	this.preco = preco;
    }  
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public ArrayList<ItenVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(ArrayList<ItenVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }
    
    
}
