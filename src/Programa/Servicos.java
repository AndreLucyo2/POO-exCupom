/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import Entidades.Venda;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author Andre
 */
public class Servicos
{

    public static void imprimirCupom(Venda venda)
    {
	DecimalFormat decFormat = new DecimalFormat("##,##0.00");
	BigDecimal vltotalVenda = new BigDecimal(0.00);
	BigDecimal vlTotalIten = new BigDecimal(0.00);

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
	    String un = String.format("%4.4s", venda.getItens().get(i).getProduto().getUnidade());
	    String vlUnt = String.format("%11.11s", venda.getItens().get(i).getProduto().getPreco().setScale(2, BigDecimal.ROUND_HALF_EVEN) + "");

	    vlTotalIten = venda.getItens().get(i).getPrecoUnitario().setScale(2, BigDecimal.ROUND_HALF_EVEN);
	    String strTotalIten = String.format("%10.10s", vlTotalIten + "");
	    vltotalVenda = vltotalVenda.add(vlTotalIten);

	    System.out.println(codigo + descricao + qtde + un + vlUnt + strTotalIten);
	    System.out.println("----------------------------------------------------------------");

	}

	String frmPagto = venda.getPagamentos().get(0).getFormaPagto().getNome();
	BigDecimal vlpago = venda.getPagamentos().get(0).getValorPago();
	BigDecimal troco = vlpago.subtract(vltotalVenda);
	System.out.println();
	System.out.println("===============================================================");
	System.out.println("QTD. TOTAL DE ITENS                        " + venda.getItens().size());
	System.out.println("VALOR TOTAL                              R$" + vltotalVenda.setScale(2, BigDecimal.ROUND_HALF_EVEN));
	System.out.println("----------------------------------------------------------------");
	System.out.println("FORMA DE PAGAMENTO                         " + frmPagto);
	System.out.println("VALOR PAGO                               R$" + vlpago.setScale(2, BigDecimal.ROUND_HALF_EVEN));
	System.out.println("TROCO                                    R$" + troco.setScale(2, BigDecimal.ROUND_HALF_EVEN));
	System.out.println("----------------------------------------------------------------");
    }

}
