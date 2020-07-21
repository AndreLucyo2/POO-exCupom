/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Controller;

import Entidades.FormaPagamento;
import Entidades.PagamentoVenda;
import Entidades.Venda;
import java.math.BigDecimal;

/**
 *
 * @author Andre
 */
public class PagamentoVendaController
{
       
    /**
     * Metodo para solicitar dados para cadastrar uma venda
     *
     * @return
     */
    public  PagamentoVenda criarPagamentoVenda(Venda venda,FormaPagamento formaPagto ,BigDecimal valorPago)
    {
	
	PagamentoVenda pagtoVenda = new PagamentoVenda();
	
	//ID FIXO
	pagtoVenda.setId(0);
	pagtoVenda.setVenda(venda);
	pagtoVenda.setFormaPagto(formaPagto);

	System.out.print("Informe Valor Pago:    ");
	pagtoVenda.setValorPago(valorPago);

	return pagtoVenda;
    }
}
