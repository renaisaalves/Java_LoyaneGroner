package estudandojava.operadores;

public class Operadores {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 8;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado % 5;
		System.out.println(resultado);
		
		String primeiroNome = "Esta é ";
		String segundoNome = "uma String concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++; /*O operador ++ significa que está adicionando +1*/
		System.out.println(resultado);
		
		++resultado; /*O operador ++ vai adicionar antes de mostrar o resultado*/
		System.out.println(resultado);
		resultado--; /*O operador -- vai retirar 1*/
		System.out.println(resultado);
		

	}

}
