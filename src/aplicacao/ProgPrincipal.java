package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class ProgPrincipal {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
		seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
		salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
		afetado pela porcentagem) e mostrar novamente os dados do funcionário. 
		*/
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Entre com os dados do Funcionário:");
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println(funcionario);
		
		System.out.println();
		System.out.print("Entre com o percentual de aumento Funcionário: ");
		double porcentagem = sc.nextDouble();
		
		funcionario.novoSalario(porcentagem);
		
		System.out.println();
		System.out.println(funcionario);
		
		sc.close();
		
	}

}
