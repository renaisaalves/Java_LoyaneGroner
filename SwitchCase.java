package estudandojava.condicionais;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número de 1-7: ");
		int num = scan.nextInt();
		
		switch (num) {
		case 1: System.out.println("Domingo"); break; /*Se não tiver o break, vai executar todas as sentenças até encontrar o break*/
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Terça");
		case 4: System.out.println("Quarta");
		case 5: System.out.println("Quinta");
		case 6: System.out.println("Sexta");
		case 7: System.out.println("Sábado"); break;
		}
	}

}
