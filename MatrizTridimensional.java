package estudandojava.matrizes;

public class MatrizTridimensional {

	public static void main(String[] args) {
		
		/* A matriz de 3 dimensões não é muito usada no meio corporativo, e sim na área de games. Mas é interessante aprender como funciona a iteração com matriz de mais de 2 dimensões.*/
		
		int[][][] matrizTridimensional = new int[3][3][3]; // eu quero 3 linhas, 3 colunas e 3 de profundidade;
		
		for (int i=0; i < matrizTridimensional.length; i++){
			for (int j=0; j < matrizTridimensional[i].length; j++) {
				for (int k=0; k < matrizTridimensional[i][j].length; k++) {
					System.out.println("i = " + i + " - j = " + j + " - k = " + k);
					matrizTridimensional[i][j][k] = i + j + k;
				}
			}
		}
		
		System.out.println();
		
		/* Uma coisa muito importante é entender como a iteração funciona. 
		   Já sabemos que o primeiro for está relacionado com as linhas; o segundo for com as colunas; e o terceiro for com a profundidade. 
		   A iteração principal (linha) só vai passar pra próxima depois que todas as outras iterações que estão "dentro dela" tiver sido resolvidas (iteradas).
		   O primeiro for interno (representado por j) está relacionado com as colunas. Todas as colunas desse for precisa ser iteradas pra poder voltar ao for principal (o da linha);
		   O segundo for interno (que está "dentro" do for coluna) vai se repetir até que acabem todas as iterações que lhe forem atribuídas para voltar ao for da coluna. 
		   
		   Ou seja: o for da profundidade (o for mais interno) vai iterar primeiro (e com mais frequência) pra depois passar pra próxima coluna, pra depois passar pra próxima linha. Na vdd ficou bastante confuso, mas com muito estudo é possível aprender. 
		   */
		
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		
		System.out.println("Tamanho da matriz tridimensional: " + matrizTridimensional.length + "\n");
		
		for(int l=0; l < matrizTridimensional.length; l++) { // l = 0; matrizTridimensional = 3;
			for(int m=0; m < matrizTridimensional[l].length; m++) { // m = 0; matrizTridimensional[0]; 
				for(int n=0; n < matrizTridimensional[l][m].length; n++) { // n = 0; matrizTridimensional[0][0];
					soma += matrizTridimensional[l][m][n]; // Adição: soma = soma+[l]+[m]+[n] ou 0 = 0+[0]+[0]+[0]
					
					if (matrizTridimensional[l][m][n] % 2 == 0) { 
						somaPares += matrizTridimensional[l][m][n];
						System.out.print("Linha " + l + " Coluna " + m + " Profundidade " + n + "\n");
					} else {
						somaImpares += matrizTridimensional[l][m][n];
						System.out.print("Linha " + l + " Coluna " + m + " Profundidade " + n + "\n");
					}
				}
			}
		}
		System.out.println("\nTotal: " + soma);
		System.out.println("Soma dos pares: " + somaPares);
		System.out.println("Soma dos impares: " + somaImpares);
	}
}
