package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {

		System.out.println("Digite primeiro n�mero: ");
		Scanner entrada = new Scanner(System.in);
		var num1 = entrada.nextDouble();

		System.out.println("Digite segundo n�mero: ");
		var num2 = entrada.nextDouble();

		System.out.println("Escolha a opera��o desejada:\n" + " Digite a op��o: \n\n" + " 1 : para adi��o \n"
				+ " 2 : para Subtra��o \n" + " 3 : para Multiplica��o \n" + " 4 : para Divis�o \n"
				+ " 5 : para resto da divis�o \n");

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
															: "Digite uma op��o v�lida")))));
		entrada.close();
	}
}
