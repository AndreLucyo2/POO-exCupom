/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Controller;

import Entidades.Produto;
import bdTeste.BancoDadosFake;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author Andre
 */
public class ProdutoController
{
    

    public Produto criarProdutoT(int id)
    {
	//TESTE:
	//Instancia banco de dados falso para teste
	BancoDadosFake.inicia();
	
	//pegar produto do banco:
	Produto prod1 = (BancoDadosFake.produto.get(id));

	return prod1;
    }

    /**
     * Metodo para solicitar dados para cadastrar um produto
     *
     * @return
     */
    public Produto criarProduto()
    {
	Scanner scan = new Scanner(System.in);
	Produto prod = new Produto();

	//ID FIXO
	prod.setId(0);

	System.out.println("\n--------------------------------------------------");
	System.out.println("DADOS DO PRODUTO:");

	System.out.print("Codigo:    ");
	prod.setCodigo(scan.nextInt());

	System.out.print("Nome:      ");
	prod.setNome(scan.next());

	System.out.print("Unidade:   ");
	prod.setUnidade(scan.next());

	System.out.print("Preço:     ");
	prod.setPreco(new BigDecimal(scan.nextDouble()));	

	System.out.println("--------------------------------------------------");

	return prod;
    }
}
