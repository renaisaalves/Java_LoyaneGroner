package estudandojava.breakcontinue;

import java.util.Scanner;
public class ComandosBreakContinue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Hoje vamos entender como funciona os comandos BREAK e CONTINUE.
		//Observe o código abaixo:
		
		int num = 5;
		
		for (int i = 0; i < 10; i++) {
			if (i >= num) {
				System.out.println("O comando terminou em: " + i);
				break;
			}
			
			//Em nossa estrutura FOR, temos o contador com o valor 0; uma condição (enquanto o contador for menor que 10) e a incrementação do nosso contador (aumentando de 1 em 1);
			//Abaixo, temos uma condição if: se o contador for MAIOR ou IGUAL a variável num (5), vai ser exibida uma mensagem, e em seguida, temos o comando BREAK, cuja função é finalizar a iteração. 
			
			//O comando CONTINUE é o oposto de break: faz com que o programa continue. Ele não é tão usado como BREAK, mas pode ser útil em determinadas situações. Veja um exemplo:
		}
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite um número:");
			int number = scan.nextInt();
			if (number < 10) {
				System.out.println("O número é menor que 10");
				continue;
			} else {
				System.out.println("O número é maior que 10. FIM!");
				break;
			}
		}
	}

}
