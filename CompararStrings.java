package estudandojava.comparstrings;

import java.util.Scanner;

public class CompararStrings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//COMPARANDO STRINGS
		
		//Eu não ia fazer esse tema, mas como estou tendo muita dificuldade em comparar strings, vou detalhar essa aula pra fixar o método. 
		
		System.out.println("Gênero (F/M):");
		String genero = scan.next();
		
		if (genero.equalsIgnoreCase("f")) {
			System.out.println("Ok! É feminino.\n");
		} else if (genero.equalsIgnoreCase("m")){
			System.out.println("Ok, é masculino!\n");
		} else {
			System.out.println("Sexo inválido.\n");
		}
		
		//No Java, existe 2 maneiras de comparar Strings: usando os métodos equals e equalsIgnoreCase
		//A diferença entre os dois é a seguinte: equals é Case Sensitive, ou seja, letras maiúsculas e minúsculas precisam ser rigorosamente respeitadas para a comparação ser verdade. Exemplo: se você escrever AmOr, o usuário DEVE escrever exatamente AmOr para a comparação ser verdadeira. Do contrário, será falso, porque AmOr != aMoR, amor, AMor, AmoR, amOR, AMOR. 
		//Já em equalsIgnoreCase você pode ter a liberdade de escrever a mesma palavra (gato, GATO, gATO etc.) independente de estar em maiúsculo ou minúsculo. 
		
		//Exercício: escreva seu nome. Vamos testar nos dois modos, utilizando a iteração.
		
		System.out.println("Usando equals()\n");
		System.out.println("Escreva seu nome:");
		String meunome = scan.next();
		String nome = "Renaisa";
		if (meunome.equals(nome)) {
			System.out.println("Certo, pois: " + nome + " = " + meunome);
		} else {
			System.out.println("Errado, pois: " + nome + " != " + meunome);
		}
		
		System.out.println("\nUsando equalsIgnoreCase()\n");
		System.out.println("Escreva seu nome:");
		String myname = scan.next();
		String name = "Renaisa";
		if (myname.equalsIgnoreCase(name)) {
			System.out.println("Certo, pois: " + name + " = " + myname);
		} else {
			System.out.println("Errado, pois: " + name + " != " + myname);
		}
		
		//ENTENDENDO A ESTRUTURA
		
		//EQUALS
		//nome.equals() = nome é a variável que vai ser a referência da comparação;
		//equals() = é o método que vai estabelecer o conceito de CaseSensitive;
		//equals(meunome) = meunome é a variável que vai ser analisada/comparada. Se ela for diferente de nome (nome != meunome) então será false. Lembrando que equals maiúsculo e minúsculo devem ser respeitados. 
		
		//EQUALSIGNORECASE
		//myname.equalsIgnoreCase() = myname é a variável que vai ser a referência da comparação;
		//equalsIgnoreCase() = é o método que vai retirar o conceito de CaseSensitive, ou seja, maiúsculo e minúsculo não vai fazer diferença. 
		//equalsIgnoreCase(name) = name é a variável que vai ser analisada/comparada. A palavra pode ter letras minúsculas e/ou maiúsculas diferentes da variável myname (usada como referência), DESDE que sejam os mesmos caracteres. 
		
	}

}
