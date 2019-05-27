package entidades;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void novoSalario(double percentual) {
		salarioBruto += salarioBruto * percentual / 100;
	}
	
	public String toString() {
		return "Funcionário: "
			 + nome
			 + " , Sálario R$ "
			 + String.format("%.2f", salarioLiquido());
			
	}

}
