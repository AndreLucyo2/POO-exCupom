/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Controller;

import Entidades.FormaPagamento;

/**
 *
 * @author Andre
 */
public class FormaPagamentoController
{

    /**
     * Metodo para solicitar dados para cadastrar uma venda
     *
     * @return
     */
    public FormaPagamento criarFormPagto(String cr)
    {	
	FormaPagamento frmPagot = new FormaPagamento();
	frmPagot.setId(0);
	
	if (cr == "d")
	{
	  frmPagot.setNome("DINHEIRO");
	      
	}
	else
	{
	    frmPagot.setNome("CARTÃO");
	}
	return frmPagot;
    }
}
