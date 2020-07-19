/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import static Entidades.Controller.EmpresaController.criarEmpresa;
import static Entidades.Controller.ProdutoController.criarProduto;
import bdTeste.BancoDadosFake;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Andre
 */
public class TesteGeral
{

    public static void main(String[] args)
    {
	//------------------------------------------------------------
	//Instancia banco de dados falso para teste
	//------------------------------------------------------------
	BancoDadosFake.inicia();

	//------------------------------------------------------------
	//DEFININDO CAMPO DATA
	//------------------------------------------------------------
	// Definindo formato de data no objeto:
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	// passa uma data para o objeto no formato especificado:			
	String dataAtual = sdf1.format(Calendar.getInstance().getTime());
	//teste:
	System.out.println(dataAtual);

	//Teste:
	criarEmpresa();
	criarProduto();

	//TESTE DE STRING:
	String texto = "001 - " + String.format("%-15.15s", "123");
	String texto1 = "002 - " + String.format("%15.15s", "123");
	String texto2 = "003 - " + String.format("%015d", 123);

	System.out.println(texto);
	System.out.println(texto1);
	System.out.println(texto2);

	System.out.println("004 - " + String.format("|%2$s|", 32, "Olá"));
	System.out.println("005 - " + String.format("|%20d|", 93));

	System.out.println("006 - " + String.format("|%-20d|", 93));

	System.out.println("007 - " + String.format("|%020d|", 93));

	System.out.println("008 - " + String.format("|%+20d|", 93));

	System.out.println("009 - " + String.format("|% d|", 93));
	System.out.println("010 - " + String.format("|% d|", -36));

	System.out.println("011 - " + String.format("|%,d|", 10000000));
	System.out.println("012 - " + String.format("|%(d|", -36));
	System.out.println("013 - " + String.format("|%x|", 93));
	System.out.println("014 - " + String.format("|%s|", "Hello World"));
	System.out.println("015 - " + String.format("|%30s|", "Hello World"));
	System.out.println("016 - " + String.format("|%-30s|", "Hello World"));
	System.out.println("017 - " + String.format("|%.5s|", "Hello World"));
	System.out.println("018 - " + String.format("|%30.5s|", "Hello World"));

	String str1 = String.format("%d", 101);          // Integer value  
	String str2 = String.format("%s", "Amar Singh"); // String value  
	String str3 = String.format("%f", 101.00);       // Float value  
	String str4 = String.format("%x", 101);          // Hexadecimal value  
	String str5 = String.format("%c", 'c');          // Char value  
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);
	System.out.println(str5);

	System.out.printf("Total: %10.2f: ", 34534.90);
	System.out.printf("% 4d", 3455);
	System.out.printf("%20.10s\n", 4545.77);
	
	System.out.printf("%-12s%-12s%s\n","Coluna 1","Coluna 2","Coluna 3");
	System.out.printf("%-12d%-12d%07d\n",15,12,5);

	//------------------------------------------------------------
	//TESTE EM AULA - EXEMPLO
	//------------------------------------------------------------
	//obter o preço unitario a partir da venda:
//	Venda venda = new Venda();
//	venda.getItens().get(2).getPrecoUnitario();
//
//	//obter informações do item da venda
//	ItensVenda item = venda.getItens().get(0);
//	//buscar o produdo de um item da venda
//	Produto produto = item.getProduto();
//	produto.getNome();
//	venda.getItens().get(0).getProduto().getNome();
    }
}


/*
big decimal : https://www.devmedia.com.br/java-bigdecimal-trabalhando-com-mais-precisao/30286

String.format : https://dzone.com/articles/java-string-format-examples

 */
