/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdTeste;

import Entidades.Produto;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Andre
 */
public class BancoDadosFake
{

    public static ArrayList<Produto> produto;

    public static void inicia()
    {
	produto = new ArrayList<Produto>();

	//criando elementos
	Produto produto1 = new Produto(1, "COXA SOBRE COXA", 234, "KG",new BigDecimal(8.50f));
	Produto produto2 = new Produto(2, "ACUCAR NORDESTE", 456, "UN",new BigDecimal(5.50f));
	Produto produto3 = new Produto(3, "SAL LEBRE ", 221, "UN",new BigDecimal(1.10f));
	Produto produto4 = new Produto(4, "VINHO DO PORTO", 876, "UN",new BigDecimal(88.56f));

	Produto produto5 = new Produto(5, "MACARRÃO", 234, "UN", new BigDecimal(2.33f));
	Produto produto6 = new Produto(6, "BATATA", 456, "KG",new BigDecimal(2.50f));
	Produto produto7 = new Produto(7, "TOMATE ", 221, "KG",new BigDecimal(6.74f));
	Produto produto8 = new Produto(8, "REPOLHO", 876, "UN", new BigDecimal(4.00f));

	//Adiciona Elementos na lista
	produto.add(produto1);
	produto.add(produto2);
	produto.add(produto3);
	produto.add(produto4);
	produto.add(produto5);
	produto.add(produto6);
	produto.add(produto7);
	produto.add(produto8);

    }
}
