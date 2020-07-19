package Entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andre
 */
public class Venda
{

    private int id;
    private Empresa empresa;
    private int numero;
    private String serie;
    private Date dataEmissao;
    private String chave;
    private Date dataProtocolo;
    private ArrayList<ItenVenda> itens;
    private ArrayList<PagamentoVenda> pagamentos;

    public Venda()
    {
    }

    public Venda(int id, Empresa empresa, int numero, String serie, String dataEmissao, String chave, String dataProtocolo, ArrayList<ItenVenda> itens, ArrayList<PagamentoVenda> pagamentos)
    {
	this.id = id;
	this.empresa = empresa;
	this.numero = numero;
	this.serie = serie;
	this.chave = chave;
	this.itens = itens;
	this.pagamentos = pagamentos;

	try
	{
	    // Definindo formato da data:
	    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	    
	    //Formata a data do tipo String para o formato Date
	    this.dataEmissao = sdf1.parse(dataEmissao);
	    this.dataProtocolo = sdf1.parse(dataProtocolo);

	}
	catch (ParseException ex)
	{
	    Logger.getLogger(Venda.class.getName()).log(Level.SEVERE, null, ex);
	}
    }

    public int getId()
    {
	return id;
    }

    public void setId(int id)
    {
	this.id = id;
    }

    public Empresa getEmpresa()
    {
	return empresa;
    }

    public void setEmpresa(Empresa empresa)
    {
	this.empresa = empresa;
    }

    public int getNumero()
    {
	return numero;
    }

    public void setNumero(int numero)
    {
	this.numero = numero;
    }

    public String getSerie()
    {
	return serie;
    }

    public void setSerie(String serie)
    {
	this.serie = serie;
    }

    public Date getDataEmissao()
    {
	return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao)
    {
	this.dataEmissao = dataEmissao;
    }

    public String getChave()
    {
	return chave;
    }

    public void setChave(String chave)
    {
	this.chave = chave;
    }

    public Date getDataProtocolo()
    {
	return dataProtocolo;
    }

    public void setDataProtocolo(Date dataProtocolo)
    {
	this.dataProtocolo = dataProtocolo;
    }

    public ArrayList<ItenVenda> getItens()
    {
	return itens;
    }

    public void setItens(ArrayList<ItenVenda> itens)
    {
	this.itens = itens;
    }

    public ArrayList<PagamentoVenda> getPagamentos()
    {
	return pagamentos;
    }

    public void setPagamentos(ArrayList<PagamentoVenda> pagamentos)
    {
	this.pagamentos = pagamentos;
    }

}
