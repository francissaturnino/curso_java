package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {

		System.out.println("Digite primeiro número: ");
		Scanner entrada = new Scanner(System.in);
		var num1 = entrada.nextDouble();

		System.out.println("Digite segundo número: ");
		var num2 = entrada.nextDouble();

		System.out.println("Escolha a operação desejada:\n" + " Digite a opção: \n\n" + " 1 : para adição \n"
				+ " 2 : para Subtração \n" + " 3 : para Multiplicação \n" + " 4 : para Divisão \n"
				+ " 5 : para resto da divisão \n");

		double add = num1 + num2;
		double sub = num1 - num2;
		double multi = num1 * num2;
		double div = num1 / num2;
		double rest = num1 % num2;

		var opcao = entrada.nextInt();

		System.out.println(opcao == 1 ? add
							: (opcao == 2 ? sub
									: (opcao == 3 ? multi
											: (opcao == 4 ? div 
													: (opcao == 5 ? rest 
															: "Digite uma opção válida")))));
		entrada.close();
	}
}
