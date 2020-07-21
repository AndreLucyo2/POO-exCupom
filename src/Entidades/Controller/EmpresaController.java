/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Controller;

import Entidades.Empresa;
import java.util.Scanner;

/**
 *
 * @author Andre
 */
public class EmpresaController
{

    public Empresa getEmpresa()
    {
	//Teste:
	Empresa empresa1 = new Empresa(1, "MERCADINHO", "91.384.685/0001-72", "123123", "RUA AFONSO CAMPOS", 123, "CENTRO", null);

	return empresa1;

    }

    /**
     * Metodo para solicitar dados para cadastrar uma empresa
     *
     * @return
     */
    public Empresa criarEmpresa()
    {
	Scanner scan = new Scanner(System.in);
	Empresa empresa = new Empresa();

	//ID FIXO
	empresa.setId(0);

	System.out.println("\n--------------------------------------------------");
	System.out.println("DADOS DA EMPRESA:");

	System.out.print("Nome:    ");
	empresa.setNome(scan.next());

	System.out.print("CNPJ:    ");
	empresa.setCnpj(scan.next());

	System.out.print("IE:      ");
	empresa.setIe(scan.next());

	System.out.print("Rua:     ");
	empresa.setLogradouro(scan.next());

	System.out.print("Numero:  ");
	empresa.setNumero(scan.nextInt());

	System.out.print("Bairro:  ");
	empresa.setBairro(scan.next());

	System.out.println("--------------------------------------------------");

	return empresa;

    }
}
