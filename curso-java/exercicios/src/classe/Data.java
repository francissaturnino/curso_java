package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	/*Data(int d, int m, int a) {

	}*/

	Data(int i, int j, int k) {
		dia = 01;
		mes = 01;
		ano = 1970;
	}

	public Data() {
		// TODO Auto-generated constructor stub
	}

	String obterDataFormatada() {
		return String.format(" %d/%d/%d ", dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}


}
