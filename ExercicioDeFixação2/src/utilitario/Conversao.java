package utilitario;

public class Conversao {

	public static double quant;
	public static final double taxa = 0.06;
	public static double valor;

	public static double valorDolar() {

		double totalPagar = (quant * valor * taxa) + (quant * valor);
		return totalPagar;
	}

}
