package Entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andre
 */
public class ItenVenda
{

    private int id;
    private Venda venda;
    private Produto produto;
    private Float quantidade;
    private Float precoUnitario;
    private String unidade;

    public int getId()
    {
	return id;
    }

    public void setId(int id)
    {
	this.id = id;
    }

    public Venda getVenda()
    {
	return venda;
    }

    public void setVenda(Venda venda)
    {
	this.venda = venda;
    }

    public Produto getProduto()
    {
	return produto;
    }

    public void setProduto(Produto produto)
    {
	this.produto = produto;
    }

    public Float getQuantidade()
    {
	return quantidade;
    }

    public void setQuantidade(Float quantidade)
    {
	this.quantidade = quantidade;
    }

    public Float getPrecoUnitario()
    {
	return precoUnitario;
    }

    public void setPrecoUnitario(Float precoUnitario)
    {
	this.precoUnitario = precoUnitario;
    }

    public String getUnidade()
    {
	return unidade;
    }

    public void setUnidade(String unidade)
    {
	this.unidade = unidade;
    }

}
