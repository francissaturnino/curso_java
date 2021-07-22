package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		/*
		 * int a = 3 * 4 - 10 ; int b = (int) Math.pow(a, 3); double c = Math.pow(a, 3);
		 * 
		 * System.out.println(b); System.out.println(c);
		 */
		
		int exp1 = (6*(3 + 2));
		exp1 = (int ) Math.pow(exp1, 2);
		exp1 = exp1/(3*2);
		
		int exp2 = ((1 -5) * (2 -7));
		exp2 = exp2 /2;
		exp2 = (int) Math.pow(exp2, 2);
		
		int resultado = exp1 - exp2;
		resultado = (int) Math.pow(resultado, 3);
		resultado = resultado / (int) Math.pow(10, 3);
		System.out.println(resultado);
	}
}
