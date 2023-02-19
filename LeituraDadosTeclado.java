package estudandojava.entradadedados;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome: ");
		String nomeCompleto = entrada.nextLine(); /*absolve tudo o que foi escrito na linha
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = entrada.next(); /*absolve somente a primeira palavra digitada
		System.out.println("Seu primeiro nome é: " + primeiroNome)
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt(); /*absolve o número digitado
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua altura: ");
		double altura = entrada.nextDouble();
		System.out.println("Sua altura é: " + altura); */
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animal de estimação.");
		String primeiroNome = entrada.next();
		int idade = entrada.nextInt();
		byte qntFilhos = entrada.nextByte();
		double altura = entrada.nextDouble();
		boolean temPet = entrada.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Sua idade: " + idade);
		System.out.println("Quantidade de filhos: " + qntFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem animal de estimação: " + temPet);
		
	}

}
