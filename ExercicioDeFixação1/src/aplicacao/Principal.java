package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		Funcionario emp = new Funcionario();
		
		System.out.print("Nome: ");
		emp.nome = sc.next();
		System.out.print("Salário Bruto: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.print("Taxa: ");
		emp.taxa = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionário: " + emp);
		System.out.println();
		System.out.print("Quantos porcento de aumento?: ");
		double porcentagem = sc.nextDouble();
		emp.aumentoSalario(porcentagem);
		
		System.out.println();
		System.out.println("O aumento foi de: " + emp);
		
		
		
		
		
		sc.close();
		
	}

}
