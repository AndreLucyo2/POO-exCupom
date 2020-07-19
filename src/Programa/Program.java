package Programa;

import static Entidades.Controller.EmpresaController.getEmpresa;
import static Entidades.Controller.FormaPagamentoController.criarFormPagto;
import static Entidades.Controller.PagamentoVendaController.criarPagamentoVenda;
import static Entidades.Controller.VendaController.criarVenda;
import Entidades.FormaPagamento;
import Entidades.PagamentoVenda;
import Entidades.Venda;
import static Programa.Servicos.imprimirCupom;
import bdTeste.BancoDadosFake;
import java.math.BigDecimal;
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

    /*
    1 - definir a empresa
    2 - abre a venda
    3 - adiciona itens a venda
	a - produto:nome/cod/unid/preço
	b - quantidade/peso
	c - preço do item (qtde * preço produto)
    
    4 - definir a forma de pagamento (Cart/Diheiro)
    5 - pagamento da venda:
	a - valor pago
     */
    public static void main(String[] args) throws ParseException
    {
	//Instancia banco de dados falso para teste
	BancoDadosFake.inicia();

	Scanner scan = new Scanner(System.in);

	System.out.println("================================================================");
	System.out.println("============               VENDA             ===================");
	System.out.println("================================================================");

	//só para limitar o for
	System.out.print("Informe o numero de itens da venda: ");
	int numItens = scan.nextInt();

	//ABRIR A VENDA:
	Venda venda = new Venda();
	venda = criarVenda(getEmpresa(), numItens);

	//FORMA DE PAGAMENTO
	System.out.print("Qual a forma de pagameto: [d] dinheiro [c]cartão ");
	String cr = scan.next();
	FormaPagamento frmPagot = criarFormPagto(cr);

	//PAGAMENTO DA VENDA
	System.out.print("Informe valor recebido: ");
	BigDecimal vlRec = new BigDecimal(scan.next());
	PagamentoVenda pagtoVend = criarPagamentoVenda(venda, frmPagot, vlRec);

	//ADICIONAR PAGAMENTO:
	ArrayList<PagamentoVenda> pagamentos = new ArrayList<PagamentoVenda>();
	pagamentos.add(pagtoVend);
	venda.setPagamentos(pagamentos);	

	//gerar Cupom
	imprimirCupom(venda);
    }

}
