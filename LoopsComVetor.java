package estudandojava.vetores;

import java.util.Scanner;

public class LoopsComVetor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for(int i=0; i < vetorA.length; i++) {
			System.out.print("Número " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.print("Vetor A: ");
		for(int indice : vetorA) {
			System.out.print(indice + " ");
		}
		
		/*OU*/
		
		int[] vetorB = new int[5];
		vetorB = vetorA;
		
		System.out.print("\nVetor B: ");
		for(int indice : vetorB) {
			System.out.print(indice + " ");
		}
	}

}
