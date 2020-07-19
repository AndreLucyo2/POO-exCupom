/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdTeste;

import Entidades.Empresa;
import Entidades.Produto;
import java.util.ArrayList;

/**
 *
 * @author Andre
 */
public class BancoDadosFake
{
    public static ArrayList<Produto> produto;
    public static ArrayList<Empresa> empresa;

    public static void inicia()
    {
	produto = new ArrayList<Produto>();

	//criando elementos
	Produto produto1 = new Produto(1,"COXA SOBRE COXA",234,"KG",8.50f);
	Produto produto2 = new Produto(2,"ACUCAR NORDESTE",456,"UN",5.43f);
	Produto produto3 = new Produto(3,"SAL LEBRE ",221,"UN",1.20f);
	Produto produto4 = new Produto(4,"VINHO DO PORTO",876,"UN",95.50f);

	//Adiciona Elementos na lista
	produto.add(produto1);
	produto.add(produto2);
	produto.add(produto3);
	produto.add(produto4);
	
//	//criando elementos
//	Empresa empresa1 = new Empresa(1,"MERCADINHO","91.384.685/0001-72","123123","RUA AFONSO CAMPOS",123,"CENTRO");
//	Empresa empresa2 = new Empresa(2,"FABRICA DO PAO","00.678.685/0001-41","45623","RUA SEM NOME",341,"VILA BOI");
//	
//	
//	//Adiciona Elementos na lista
//	empresa.add(empresa1);
//	empresa.add(empresa2);
    }
}
