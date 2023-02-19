package estudandojava.condicionais;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade.");
		} else {
			System.out.println("É menor de idade.");
		}
		System.out.println("Digite um número inteiro qualquer: ");
		double num = scan.nextDouble();
		System.out.println("Quantos sapatos você tem? ");
		int sapatos = scan.nextInt();
		System.out.println("Qual é o último número do seu celular?");
		int numCelular = scan.nextInt();
		double total = num + sapatos + numCelular;
		
		if (total <= 10) {
			System.out.println("UAL! Você tem poucos elementos (" + total + ").");
		} else if (total > 10 && total <= 50) {
			System.out.println("OK! Você tem " + total + " elementos.");
		} else {
			System.out.println("É, você tem vários elementos! São ao todo: " + total);
		}
	}
}
