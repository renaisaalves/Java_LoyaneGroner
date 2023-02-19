package estudandojava.loops;

public class LoopFor {

	public static void main(String[] args) {
		
		//Diferente do WHILE, em que tivemos que criar variáveis fora do escopo, na estrutura FOR não precisamos criar variáveis fora do seu escopo. Isso significa que podemos criar (ou declarar) variáveis dentro da própria estrutura FOR. Vamos ver um exemplo:
		
		for (int i = 0; i < 5; i++) {
			System.out.println("O valor i tem: " + i);
		}
		
		//Primeiro, a estrutura de repetição FOR precisa de uma instrução pra poder executar alguma coisa. É a partir dessa instrução que as demais linhas de comando (após as chaves) poderão (ou não) ser executadas. 
		//Essa instrução sempre estará dentro de parênteses. 
		//Dentro desses parênteses, há as nossas instruções, cujo papel se divide em três fases:
		//1º parte: declaração de variável(is). Nessa primeira fase, há a inicialização da(s) variável(is), afinal, sem variável, não tem como começar. 
		//2º parte: expressão/operação lógica. Eu preciso instruir o FOR a repetir uma determinada coisa através de uma ordem/instrução. Sem um comando, como vou repetir? É como se você dissesse "água" sem me dizer o que devo fazer. É por isso que a segunda fase é tão importante. 
		//Seguindo o nosso exemplo, temos que: "enquanto a nossa variável i for menor que 5". Notem que a partir daí temos uma instrução com um fim determinado. Isso significa que após a variável i for maior que 5, o programa deixará de funcionar. 
		//E, por fim, temos a nossa variável com dois símbolos muito curiosos: ++. Esses ++ tem a função de adicionar +1, ou seja, ele é quem vai fazer com que a(s) variável(is) ganhem outros valores pra poder repetir novamente. O papel do i++ é como se fosse i = i + 1 ou i += 1 do Python, lembra?
		//Por curiosidade, eu declarei a variável com o nome i porque é o mais utilizado. 
		//O FOR é muito mais utilizado do que o WHILE e DO WHILE. Essa é a maneira mais comum de usarmos estrutura de repetição.
		
		for (int i = 5; i > 0; i--) {
			System.out.println("O valor de i é: " + i);
		}
		
		//Nesse outro exemplo, temos uma variável do tipo inteiro inicializando com o valor 5, enquanto i for maior que 0; daí temos a variável que vai ter 1 número retirado, fazendo esse movimento aqui: i-- é o mesmo que 5, 4, 3, 2, 1, pois:       i (5) = i (5) - 1 | i (4) = i (4) - 1 ... e assim sucessivamente, até chegar no 0 e satisfazer a condição que lhe foi dada.
		
		//Existem outras maneiras também de fazer o uso do FOR. Vamos conhecer a primeira:
		
		int count = 0;
		for ( ; count < 10; ) {
			System.out.println("Valor de count: " + count);
			count += 2;
		}
		
		//Vejam que a variável count foi inicializada fora dos parênteses de FOR. E vejam também que há um espaço vazio dentro dos parênteses de FOR, mostrando a ausência da inicialização de variável e também da ausência de decrementação da variável (count++ ou count--).
		//Mas a decrementação precisa existir, serão será um loop infinito (já que a variável count será sempre 0). Então a decrementação foi colocada fora dos parênteses, logo abaixo da impressão (println). count += 2 é o mesmo que count = count + 2
		//A diferença de count += 2 e count++ ou -- é que no caso de ++ e --, o valor da variável vai mudando de 1 em 1. Quando quero fazer uma repetição, cuja mudança da variável seja maior que 1, utilizo += ou -=. Essa informação não foi a Loiane Groner que deu, foi apenas eu que presumi pra fins compreensíveis kkkk.
		
		for (int cont = 0; cont < 10; cont +=2) {
			System.out.println("Valor de cont: " + cont);
		}
		
		//Esse outro código acima mostra exatamente o mesmo resultado, com a diferença de que tudo está incluso dentro dos parênteses. Esse modo é muito mais chique, organizado e utilizado. 
		
		//INICIALIZANDO COM MAIS DE UMA VARIÁVEL
		//Até agora, mostramos apenas a execução de FOR com apenas 1 variável. Porém, podemos inicializar com muitas variáveis. 
		//No exemplo abaixo, por mais que pareça confuso entender, vamos fazer um passo-a-passo para entender como funciona o código. 
		
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + "j = " + j);
		}

		//Do mesmo modo, iniciamos uma variável (i) que recebe o valor 0, e com a vírgula (a vírgula serve para separar expressões do mesmo comando), iniciamos outra variável (j) que recebe o valor 10. O ponto e vírgula (;) serve para separar um comando de outros comandos. 
		//Enquanto a variável i for menor que a variável j, a variável i vai decrementando (aumentando) de 1 em 1 e 
	}

}
