package estudandojava.loops;

public class LoopWhile {

	public static void main(String[] args) {
		
		/*Primeiro a gente declara as nossas variáveis, especificando qual é o seu tipo, e atribuindo um valor.*/
		
		int i = 1;
		int max = 10;
		
		while (i < max) {
			System.out.println("Contando até: "+ i);
			i++; //++ é o mesmo que var = var + 1//
		}
		
		/* O "do while" é interessante porque não vi isso em Python. Basicamente o "do while" funciona da seguinte forma: 
		 * DO significa "FAÇA/FAZER", então, ao colocar uma instrução no escopo de DO, você está instruindo o computador a fazer essa instrução ENQUANTO (while) algo acontecer. */
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 15);
		
		System.out.println(i);
		
		/* No exemplo acima, faça (do) imprimir algo enquanto a condição (while) for atendida. 
		 * No caso, o programa está pedindo para repetir o valor de i enquanto i for menor que 15. 
		 * E claro, a iteração (++) serve para ir aumentando o valor de i consecutivamente. */
	}

}
