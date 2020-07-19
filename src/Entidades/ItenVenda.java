package Entidades;

import java.math.BigDecimal;

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
    private BigDecimal quantidade;
    private BigDecimal precoItem;
    
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

    public BigDecimal getQuantidade()
    {
	return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade)
    {
	this.quantidade = quantidade;
    }

    public BigDecimal getPrecoUnitario()
    {
	//Calcula preço:
	precoItem = produto.getPreco().multiply(quantidade);			
	return precoItem;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario)
    {
	this.precoItem = precoUnitario;
    }

}
