package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		System.out.println("Digite a nota ou - 1, para mostrar a média e finalizar...");
		Scanner entrada = new Scanner(System.in);

		double nota = 0.0;
		double total = 0.0;
		double media = 0.0;
		int i = 0;

		nota = entrada.nextDouble();
		while (nota >= 0 && nota <= 10) {
			total += nota;
			i++;
			media = total / 2;
			System.out.println("Digite a nota ou - 1, para mostrar a média e finalizar...");
			nota = entrada.nextDouble();

		}
		System.out.println("A média é " + media + " e " + i + " nota(s) inserida(s)");
		entrada.close();
	}
}
