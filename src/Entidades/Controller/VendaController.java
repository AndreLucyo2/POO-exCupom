/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Controller;

import static Entidades.Controller.ItenVendaController.criarItemVenda;
import static Entidades.Controller.ProdutoController.criarProdutoT;
import Entidades.Empresa;
import Entidades.ItenVenda;
import Entidades.Venda;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andre
 */
public class VendaController
{

    /**
     * Metodo para solicitar dados para cadastrar uma venda
     *
     * @return
     */
    public static Venda criarVenda(Empresa empresa, int numItens)
    {
	Venda venda = new Venda();
	venda.setEmpresa(empresa);
	venda.setId(1);
	venda.setNumero(456);
	venda.setSerie("SERgjgjjgdjtyty345");
	venda.setChave("KEYtyythghxghftfyrt123");

	//ADICIONAR ITENS A VENDA:
	ArrayList<ItenVenda> itens = new ArrayList<ItenVenda>();
	for (int i = 0; i < numItens; i++)
	{
	    System.out.println("------------------------------------------------------------");
	    ItenVenda item = new ItenVenda();

	    item = criarItemVenda(venda, criarProdutoT(i), (i + 1));

	    itens.add(item);
	}
	venda.setItens(itens);


	

	//DEFINIR CAMPOS DE DATAS:
	try
	{
	    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	    String dataAtual = sdf1.format(Calendar.getInstance().getTime());

	    venda.setDataEmissao(sdf1.parse("30/03/2020 00:00"));
	    venda.setDataProtocolo(sdf1.parse(dataAtual));

	}
	catch (ParseException ex)
	{
	    Logger.getLogger(Venda.class.getName()).log(Level.SEVERE, null, ex);
	}

	return venda;
    }
}
