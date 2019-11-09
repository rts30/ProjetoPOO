package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import utilitario.Conversao;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dolar: ");
		Conversao.valor = sc.nextDouble();
		System.out.print("Quantos dolares: ");
		Conversao.quant = sc.nextDouble();
		System.out.print("Você pagara: " + Conversao.valorDolar());
		
		
		sc.close();
		
	}

}
