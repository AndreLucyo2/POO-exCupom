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
public class FormaPagamento {
    private int id;
    private String nome;
    private ArrayList<PagamentoVenda> pagamentosVenda;

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

    public ArrayList<PagamentoVenda> getPagamentosVenda() {
        return pagamentosVenda;
    }

    public void setPagamentosVenda(ArrayList<PagamentoVenda> pagamentosVenda) {
        this.pagamentosVenda = pagamentosVenda;
    }
    
    
}
