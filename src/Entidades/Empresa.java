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
public class Empresa
{

    private int id;
    private String nome;
    private String cnpj;
    private String ie;
    private String logradouro;
    private int numero;
    private String bairro;
    private ArrayList<Venda> vendas;

    public Empresa()
    {
    }

    public Empresa(int id, String nome, String cnpj, String ie, String logradouro, int numero, String bairro, ArrayList<Venda> vendas)
    {
	this.id = id;
	this.nome = nome;
	this.cnpj = cnpj;
	this.ie = ie;
	this.logradouro = logradouro;
	this.numero = numero;
	this.bairro = bairro;
	this.vendas = vendas;
    }

    public int getId()
    {
	return id;
    }

    public void setId(int id)
    {
	this.id = id;
    }

    public String getNome()
    {
	return nome;
    }

    public void setNome(String nome)
    {
	this.nome = nome;
    }

    public String getCnpj()
    {
	return cnpj;
    }

    public void setCnpj(String cnpj)
    {
	this.cnpj = cnpj;
    }

    public String getIe()
    {
	return ie;
    }

    public void setIe(String ie)
    {
	this.ie = ie;
    }

    public String getLogradouro()
    {
	return logradouro;
    }

    public void setLogradouro(String logradouro)
    {
	this.logradouro = logradouro;
    }

    public int getNumero()
    {
	return numero;
    }

    public void setNumero(int numero)
    {
	this.numero = numero;
    }

    public String getBairro()
    {
	return bairro;
    }

    public void setBairro(String bairro)
    {
	this.bairro = bairro;
    }

    public ArrayList<Venda> getVendas()
    {
	return vendas;
    }

    public void setVendas(ArrayList<Venda> vendas)
    {
	this.vendas = vendas;
    }

}
