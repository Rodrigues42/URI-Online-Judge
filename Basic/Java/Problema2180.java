import java.util.Scanner;

/*Viagem à Marte na Velocidade de Primo

Um grupo de cientistas está fazendo novas experiências 
para criar uma nave que possibilite a viagem muito mais 
rápida até Marte do que é possível atualmente. Esta nave 
utilizará dois foguetes e um novo combustível recém criado, 
muito mais eficiente que os utilizados até hoje. Só que a 
velocidade que os novos foguetes podem proporcionar à nave 
está relacionada diretamente com o peso do combustível 
armazenado nestes foguetes (em kg) e, por incrível que pareça, 
uma relação deste peso com números primos. Por exemplo, se o 
peso total do combustível dos foguetes for 1010 kg, a 
velocidade atingida (em km/h) é a soma dos 10 números 
primos à partir de 1010 (incluindo ele se for primo): 
1013 -> 1019 -> 1021 -> 1031 -> 1033 -> 1039 -> 1049 -> 1051 -> 1061 -> 1063, ou seja, 10380 km/h.

Os cientistas estão muito intrigados com esta relação 
matemática existente e querem que você construa um programa 
que calcule quanto tempo aproximado (em horas e em dias) uma 
nave levaria para ir da terra até marte com este novo 
combustível, dado um determinado peso de foguetes (claro, 
eles estão tentando criar os maiores foguetes possíveis) 
assumindo que a distância da terra até marte no dia do 
lançamento, será 60 milhões de kms.

Entrada
A entrada contém um único valor inteiro Peso 
(1000 < Peso ≤ 60000) indicando o peso máximo de 
combustível (em kg) que os foguetes podem armazenar.

Saída
A saída esperada consiste em duas linhas. A primeira 
linha contém a velocidade que pode ser atingida pela nave, 
seguida pelo texto "km/h". A segunda linha contém o tempo 
estimado de viagem até Marte em horas e em dias (truncados), 
com mensagem de texto correspondente, conforme o exemplo abaixo.
 */

public class Problema2180{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int peso = input.nextInt();
		int primos = 0, soma = 0;

		//acrescenta + 1 no peso até os primos ser == 10
		for (int i=peso; i<=70000; i++){

			//verifica se o numero é primo
			int divisores = 0;
			for (int j=2; j <= peso; j++){

				if (peso % j == 0){
					divisores++;
				
				} if (divisores > 2){
					break;
				}

			//verifica se o peso é primo e se primo == 10
			} if (divisores == 1){
				primos++;
				soma += peso;
			} if (primos == 10){
				break;
			}

			//passa para o próximo numero
			peso++;
		}

		int horas = 60000000 / soma;
		int dias = horas / 24;

		System.out.println(soma+" km/h");
		System.out.println(horas+" h / "+ dias+" d");
	}
}