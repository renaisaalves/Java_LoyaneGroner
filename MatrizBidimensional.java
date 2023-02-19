package estudandojava.matrizes;

public class MatrizBidimensional {

	public static void main(String[] args) {
		
		/* Pense na matriz como sendo uma tabela, com linhas e colunas. 
		   Primeiro, a iteração vai ler toda a primeira linha [0], passando por todas as colunas até chegar no fim (no que foi determinado por você em new tipo[]). Quando chegar no fim da linha, a iteração vai passar para a próxima linha e vai ler novamente todas as colunas, e assim sucessivamente. 
		   */
		
		double[][] variavel = new double[2][4];
		
		/* Quando você declara um vetor simples (com só 1 colchete) você está determinando quantas colunas esse vetor terá. 
		   Quando você adiciona mais um colchete, você passa a trabalhar com uma matriz, que nada mais é que uma tabela.
		   Na matriz, o primeiro colchete é a quantidade de linhas. O segundo colchete é a quantidade de colunas.
		   
		   Então no exemplo acima, eu criei uma matriz (simbolizada por 2 colchetes) do tipo real, com o nome variavel, e essa matriz chamada variavel vai receber 2 linhas e 4 colunas.
		   Se você assimilar a matriz como uma tabela, tudo ficará mais fácil de compreender, pois você vai conseguir imaginar a iteração percorrendo por todas as colunas de cada linha. 
		  */
		
		variavel[0][0] = 5;
		variavel[0][1] = 22;
		variavel[0][2] = 35;
		variavel[0][3] = 11;
		
		variavel[1][0] = 14;
		variavel[1][1] = 58;
		variavel[1][2] = 29;
		variavel[1][3] = 23;
		
		/* Manualmente, você pode escolher uma linha (lembrando que a primeira linha sempre começa com 0) e escolher uma coluna para armazenar um valor. Basicamente, você está dizendo qual é a região que vai ocupar um determinado valor. Por exemplo: eu quero que a primeira linha e a quarta coluna (varivel[0][3]) receba o valor 11. Então, nessa posição da tabela/matriz, o valor 11 será armazenado.
		 */
		
		for(int i=0; i < variavel.length; i++) { // Aqui vai iterar as linhas. Enquanto i < tamanho das linhas...
			//System.out.println(variavel.length)// tamanho das linhas = 2;
			for (int j=0; j < variavel[i].length; j++) { // Aqui vai iterar as colunas. Na linha atual (variavel[i]) vai iterar todas as colunas. Enquanto j < tamanho das colunas...
				//System.out.println(variavel[i].length// tamanho das colunas = 4;
				System.out.print(variavel[i][j] + " - "); // vai exibir todos os valores de acordo com linha x coluna. 
			}
		}
		
		variavel[1][2] = 30; // Você também pode mudar um determinado valor. 
		
		System.out.println();
		
		for(int k=0; k < variavel.length; k++) {
			for (int l=0; l < variavel[k].length; l++) {
				System.out.print(variavel[k][l] + " - ");
			}
		}
		System.out.println();
		
		System.out.println("\nCalculando a média de cada aluno.\n");
		
		double soma = 0;
		
		for (int m=0; m < variavel.length; m++) {
			for (int n=0; n < variavel[m].length; n++) {
				soma += variavel[m][n];	
			}
			System.out.println("Média do aluno " + m + " é: " + (soma/4));
		}
		
		/*Você também pode declarar direto, dessa maneira aqui: */
		
		double[] notasAlunos1 = {7, 8, 9, 10};
		double[][] notasAlunos2 = {{7, 8, 9, 10}, {5, 6, 3, 2}};
	}
}
