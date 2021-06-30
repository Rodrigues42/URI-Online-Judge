import java.util.Scanner;

/* Loteria 

Flavinho sabe que a chance de ganhar na loteria é bem pequena. 
Ele gosta muito de estudar probabilidade! Mas, justamente por 
entender de probabilidades, Flavinho segue o ditado, “quem não 
arrisca, não petisca!”, e faz um jogo toda semana.

Na loteria preferida dele, o jogador aposta seis números entre 
1 e 99. No sorteio, também são escolhidos seis números 
ganhadores entre 1 e 99. Quem acerta 3, 4, 5 ou 6 números 
ganha como prêmio, respectivamente, um “terno”, uma “quadra”, 
uma “quina” ou uma “sena”.

Nesta tarefa, você deve escrever um programa que diga qual foi 
o prêmio que Flavinho ganhou, dados os seis números que ele 
apostou e os seis números que foram sorteados.

Entrada
A entrada consiste de duas linhas apenas. Na primeira linha são 
dados seis números inteiros distintos entre 1 e 99, 
representando a aposta do Flavinho. A segunda linha 
contém os seis números inteiros distintos sorteados.

Saída
Seu programa deve imprimir uma linha contendo uma palavra: 
“terno”, “quadra”, “quina” ou “sena”; caso Flavinho tenha 
acertado, respectivamente, 3, 4, 5, ou 6 números. 
Caso ele tenha acertado menos do que 3 números, imprima a 
palavra “azar”.*/

public class Problema2473{
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);

		int[] aposta = new int[6];
		int[] resultado = new int[6];

		for(int i=0; i < 6; i++){

			aposta[i] = input.nextInt();
		}

		for(int j=0; j < 6; j++){
			
			resultado[j] = input.nextInt();
		}	

		int acertos = 0;

		for(int k=0; k < 6; k++){

			for(int l=0; l < 6; l++){

				if(aposta[k] == resultado[l]){
					acertos++;
					break;
				}
			}
		}

		if(acertos == 6){
			System.out.println("sena");

		} else if(acertos == 5){
			System.out.println("quina");

		} else if(acertos == 4){
			System.out.println("quadra");

		} else if(acertos == 3){
			System.out.println("terno");

		} else{
			System.out.println("azar");
		}
	}
}