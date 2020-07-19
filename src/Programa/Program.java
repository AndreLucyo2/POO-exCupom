package Programa;

import Entidades.ItenVenda;
import Entidades.Venda;
import static Programa.Servicos.criaEmpresa;
import static Programa.Servicos.criarItemVenda;
import static Programa.Servicos.criarProduto;
import static Programa.Servicos.criarVenda;
import static Programa.Servicos.imprimirCupom;
import bdTeste.BancoDadosFake;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rafael
 */
public class Program
{

    public static void main(String[] args) throws ParseException
    {
	//Instancia banco de dados falso para teste
	BancoDadosFake.inicia();

	Scanner scan = new Scanner(System.in);

	System.out.println("================================================================");
	System.out.println("============               VENDA             ===================");
	System.out.println("================================================================");

	//VENDA:
	Venda venda = new Venda();
	venda = criarVenda(criaEmpresa());

	System.out.print("Informe o numero de itens da venda: ");
	int numItens = scan.nextInt();

	ArrayList<ItenVenda> itens = new ArrayList<ItenVenda>();
	for (int i = 0; i < numItens; i++)
	{
	    System.out.println("------------------------------------------------------------");
	    ItenVenda item = new ItenVenda();
	    item = criarItemVenda(venda, criarProduto(i));
	    itens.add(item);
	}

	venda.setItens(itens);

	//gerar Cupom
	imprimirCupom(venda);
    }

}
