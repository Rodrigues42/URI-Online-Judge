import java.util.Scanner;

/*
Handebol

Frustrado e desanimado com os resultados de sua equipe de futebol, o Super Brasileiro Clube (SBC) resolveu investir na equipe de handebol. Para melhor avaliar os atletas, os técnicos identificaram que seria útil analisar a regularidade dos jogadores. Especificamente, eles estão interessados em saber quantos jogadores fizeram gols em todas as partidas.

Como o volume de dados é muito grande, eles gostariam de ter um programa de computador para realizar essa contagem.

Entrada
A primeira linha da entrada contém dois inteiros N e M (1 ≤ N ≤ 100 e 1 ≤ M ≤ 100), indicando respectivamente o número de jogadores e o número de partidas. Cada uma das N linhas seguintes descreve o desempenho de um jogador: a i-ésima linha contém M inteiros Xj (0 ≤ X j ≤ 100, para 1 ≤ j ≤ M ), informando o número de gols do i-ésimo jogador em cada partida.

Saída
Seu programa deve produzir uma única linha, contendo um único inteiro, o número de jogadores que fizeram gols em todas as partidas.*/

public class Problema1715{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int n, m; 
		int jogadores = 0;

		n = input.nextInt();
		m = input.nextInt();

		for (int i=0; i < n; i++){

			int golJogos = 0;
			for (int j=0; j < m; j++){

				int golJogo = input.nextInt();

				if (golJogo > 0){
					golJogos++;
				}
			}
			if (golJogos == m){
				jogadores++;
			} 
		}

	System.out.println(jogadores);
	}
}