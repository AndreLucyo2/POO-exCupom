/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Controller;

import Entidades.ItenVenda;
import Entidades.Produto;
import Entidades.Venda;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author Andre
 */
public class ItenVendaController
{

    /**
     * Metodo para solicitar dados para cadastrar uma Item da Venda
     *
     * @return
     */
    public ItenVenda criarItemVenda(Venda venda, Produto produto, int indice)
    {
	Scanner scan = new Scanner(System.in);
	ItenVenda item = new ItenVenda();

	//ID FIXO
	item.setId(0);

	System.out.print("Quantidade do item " + indice + " : ");
	item.setQuantidade(new BigDecimal(scan.nextDouble()));

	item.setVenda(venda);
	item.setProduto(produto);

	return item;
    }
}
