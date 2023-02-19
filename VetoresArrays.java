package estudandojava.vetores;

public class VetoresArrays {

	public static void main(String[] args) {
		
		//Vetores (arrays) são muito importantes. Nada mais são do que espaços na memória. 
		
		// double temp1 = 31.7;
		//double temp2 = 28;
		//double temp3 = 15.8;
		//double temp4 = -3.1;
		//double temp5 = 22;
		
		//Tudo o que criamos, vai pra algum lugar na memória. No exemplo acima, criamos 5 espaços na memória, cada um com seu próprio endereço, ocupando uma região específica. 
		
		//Acontece que é muito chato ficar criando vários endereços diferentes para abrigar os dados. Por quê não adicionar vários dados num mesmo endereço de memória?  
		
		//A maneira de criar um vetor é declarar o tipo do dado que esse vetor vai armazenar (double, String, int, boolean etc.) e depois colocar os colchetes [], identificando que se trata de um vetor. Após isso, criaremos o nome desse vetor (exemplo: temperatura). 
		
		//new double[10] significa que criamos 10 posições no array. No Java, é obrigatório definir o número de posições a serem reservadas.
		
		double[] temperatura = new double[10];
		
		//Escrever da maneira acima é uma boa prática, pois facilita a identificação do vetor logo no início. 
		
		temperatura[0] = 31.7;
		temperatura[1] = 28;
		temperatura[2] = 15.8;
		temperatura[3] = -3.1;
		temperatura[4] = 22;
		
		System.out.println("O valor da temperatura do dia 3 é: " + temperatura[2]);
		
		System.out.println("O tamanho do array: " + temperatura.length);
		
		//LENGTH vai medir o tamanho do vetor, ou seja, quantos espaços reservados o vetor tem.
		
		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperatura[i]);
		}
		
		//Após fazer a iteração, você vai perceber que após o dia 5 os resultados serão todos 0.0. Isso acontece porque após o índice 5, não há valores declarados (os espaços estão vazios), então Java considera como 0.0 (que convenhamos: é a mesma coisa que nada).
		
		//ITERAÇÃO ESPECIAL PARA STRING
		
		for (double temp : temperatura) {
			System.out.println(temp);
			
		}
		
		//Essa iteração funciona da seguinte forma: temp (nome qualquer) é uma variável que vai armazenar todos os valores do vetor (temperatura), mas não vai pegar seu índice. Por exemplo: o tamanho do vetor temperatura é 10. Então temp vai pegar todos os valores das 10 posições em ordem cronológica [posição 0, 1, 2, 3... etc.] é como se temp funcionasse como um contador ao mesmo tempo, mas você não vai poder pegar os índices do vetor.
	}

}
