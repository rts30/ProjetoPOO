package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Retangulo;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Digite a base e altura: ");
		ret.base = sc.nextDouble();
		ret.altura = sc.nextDouble();
		
		System.out.printf("Area do retangulo é: %.2f%n", ret.area());
		System.out.printf("Perimetro do retangulo é: %.2f%n", ret.perimetro());
		System.out.printf("Diagonal do retangulo é: %.2f%n", ret.diagonal());
		
		
		sc.close();
	}

}
