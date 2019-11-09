package utilitario;

import java.util.Scanner;

public class ContaBancaria {

	private String nome;
	private int numeroDaConta;
	private double saldo;

	Scanner sc = new Scanner(System.in);

	public ContaBancaria(String nome, int numeroDaConta) {
		this.nome = nome;
		this.numeroDaConta = numeroDaConta;
	}

	public ContaBancaria(String nome, int numeroDaConta, double depositoInicial) {
		this.nome = nome;
		this.numeroDaConta = numeroDaConta;
		deposito(depositoInicial);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double quantidade) {
		saldo += quantidade;
	}
	
	public void saque(double quantidade) {
		saldo -= quantidade + 5;
	}
	
}
