package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class ProgPrincipal {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). Em
		seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o
		sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto �
		afetado pela porcentagem) e mostrar novamente os dados do funcion�rio. 
		*/
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Entre com os dados do Funcion�rio:");
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println(funcionario);
		
		System.out.println();
		System.out.print("Entre com o percentual de aumento Funcion�rio: ");
		double porcentagem = sc.nextDouble();
		
		funcionario.novoSalario(porcentagem);
		
		System.out.println();
		System.out.println(funcionario);
		
		sc.close();
		
	}

}
