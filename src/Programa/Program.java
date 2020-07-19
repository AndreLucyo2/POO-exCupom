package Programa;

import Entidades.Empresa;
import Entidades.ItenVenda;
import Entidades.Produto;
import Entidades.Venda;
import bdTeste.BancoDadosFake;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
	    item = criarItemVenda(venda, criarProduto());
	    itens.add(item);
	}

	venda.setItens(itens);

	//gerar Cupom
	imprimirCupom(venda);
    }

    public static void imprimirCupom(Venda venda)
    {
	System.out.println("\n\n\n");
	System.out.println("================================================================");
	System.out.println("============               CUPOM             ===================");
	System.out.println("================================================================");
	System.out.println(venda.getEmpresa().getNome());
	System.out.println("CNPJ: " + venda.getEmpresa().getCnpj() + "      IE: " + venda.getEmpresa().getIe());
	System.out.println(venda.getEmpresa().getLogradouro() + " , " + venda.getEmpresa().getBairro() + " , " + venda.getEmpresa().getNumero());
	System.out.println("----------------------------------------------------------------");
	System.out.println("       DANFE NFC-e Documento Auxiliar da Nota Fiscal De");
	System.out.println("                Consumidor Eletronica ");
	System.out.println("       NFC-e não permite aproveitamento de credito de ICMS");
	System.out.println("----------------------------------------------------------------");
	//System.out.println("CODIGO  | DESCRIÇÃO               | QTDE | UN | VL. UNT. |  VL TOT ");

	System.out.print(String.format("|%-8.8s|", " CODIGO"));
	System.out.print(String.format("%-20.20s|", " DESCRIÇÃO"));
	System.out.print(String.format("%-6.6s|", " QTDE"));
	System.out.print(String.format("%-4.4s|", " UN"));
	System.out.print(String.format("%10.10s|", " VL. UNT."));
	System.out.println(String.format("%9.9s|", " VL TOT"));
	
	System.out.println("----------------------------------------------------------------");

	//Lista Itens da Compra
	for (int i = 0; i < venda.getItens().size(); i++)
	{
	    String codigo = String.format(" %-9.9s", venda.getItens().get(i).getProduto().getCodigo() + "");
	    String descricao = String.format("%-20.20s", venda.getItens().get(i).getProduto().getNome() + "");
	    String qtde = String.format("%6.6s", venda.getItens().get(i).getQuantidade() + "");
	    String un = String.format("%4.4s", venda.getItens().get(i).getUnidade());
	    String vlUnt = String.format("%11.11s", venda.getItens().get(i).getProduto().getPreco() + "");
	    String vlTotal = String.format("%10.10s", venda.getItens().get(i).getQuantidade() * venda.getItens().get(i).getProduto().getPreco() + "");

	    System.out.println(codigo + descricao + qtde + un + vlUnt + vlTotal);
	    System.out.println("----------------------------------------------------------------");

	}
    }

    /**
     * Metodo para solicitar dados para cadastrar uma Item da Venda
     *
     * @return
     */
    public static ItenVenda criarItemVenda(Venda venda, Produto produto)
    {
	Scanner scan = new Scanner(System.in);
	ItenVenda item = new ItenVenda();

	//ID FIXO
	item.setId(0);

	System.out.print("Quantidade:  ");
	item.setQuantidade(scan.nextFloat());

//	System.out.print("Preço Unt.:  ");
//	item.setPrecoUnitario(scan.nextFloat());
	System.out.print("Unidade:     ");
	item.setUnidade(scan.next());

	item.setVenda(venda);
	item.setProduto(produto);

	return item;
    }

    /**
     * Metodo para solicitar dados para cadastrar uma venda
     *
     * @return
     */
    public static Venda criarVenda(Empresa empresa)
    {
	Venda vend = new Venda();
	vend.setEmpresa(empresa);
	vend.setId(1);
	vend.setNumero(456);
	vend.setSerie("SERgjgjjgdjtyty345");
	vend.setChave("KEYtyythghxghftfyrt123");

	try
	{
	    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	    String dataAtual = sdf1.format(Calendar.getInstance().getTime());

	    vend.setDataEmissao(sdf1.parse("30/03/2020 00:00"));
	    vend.setDataProtocolo(sdf1.parse(dataAtual));

	}
	catch (ParseException ex)
	{
	    Logger.getLogger(Venda.class.getName()).log(Level.SEVERE, null, ex);
	}

	return vend;
    }

    /**
     * Metodo para solicitar dados para cadastrar uma empresa
     *
     * @return
     */
    public static Empresa criaEmpresa()
    {
//	Scanner scan = new Scanner(System.in);
//	Empresa empresa = new Empresa();
//
//	//ID FIXO
//	empresa.setId(0);
//
//	System.out.println("\n==================================================");
//	System.out.println("======      CADASTRANDO EMPRESA        ===========");
//	System.out.println("==================================================");
//
//	System.out.print("Nome:    ");
//	empresa.setNome(scan.next());
//
//	System.out.print("CNPJ:    ");
//	empresa.setCnpj(scan.next());
//
//	System.out.print("IE:      ");
//	empresa.setIe(scan.next());
//
//	System.out.print("Rua:     ");
//	empresa.setLogradouro(scan.next());
//
//	System.out.print("Numero:  ");
//	empresa.setNumero(scan.nextInt());
//
//	System.out.print("Bairro:  ");
//	empresa.setBairro(scan.next());

	//Teste:
	Empresa empresa1 = new Empresa(1, "MERCADINHO", "91.384.685/0001-72", "123123", "RUA AFONSO CAMPOS", 123, "CENTRO", null);

	return empresa1;

    }

    /**
     * Metodo para solicitar dados para cadastrar um produto
     *
     * @return
     */
    public static Produto criarProduto()
    {
//	Scanner scan = new Scanner(System.in);
//	Produto prod = new Produto();
//
//	//ID FIXO
//	prod.setId(0);
//
//	System.out.println("\n==================================================");
//	System.out.println("======      CADASTRANDO PRODUTO        ===========");
//	System.out.println("==================================================");
//
//	System.out.print("Codigo:    ");
//	prod.setCodigo(scan.nextInt());
//
//	System.out.print("Nome:      ");
//	prod.setNome(scan.next());
//
//	System.out.print("Unidade:   ");
//	prod.setUnidade(scan.next());
//
//	System.out.print("Preço:     ");
//	prod.setPreco(scan.nextFloat());

	//TESTE:
	//Instancia banco de dados falso para teste
	BancoDadosFake.inicia();
	//pegar produto do banco:
	Produto prod1 = (BancoDadosFake.produto.get(1));

	return prod1;
    }
}
